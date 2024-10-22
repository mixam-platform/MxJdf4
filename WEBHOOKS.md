# Mixam Webhooks

Mixam can provide a _Webhook_ ("post back") API through which Suppliers can notify Mixam of changes 
to the status of orders fulfilled with them. Please contact Mixam to have the Webhook API enabled 
for your supplier account.

## Authentication

The Webhook API expects a standard `Bearer` token — use the (standard) `Authorization`
HTTP header and pass the following value: `Bearer {access.token}`.

You can obtain a valid `{access.token}` programmatically from the Mixam security token endpoint:

```shell
https://{mixam.domain}/api/user/token
```

Where `mixam.domain` is the domain associated with your supplier account (`mixam.co.uk`,
`mixam.com`, `mixam.ca`, `mixam.de`, or `mixam.com.au`).

The token endpoint supports [HTTP BASIC authentication](). (Most modern development platforms and
frameworks include a very simple way to include BASIC authentication when sending an HTTP request.)
Use the username & password of the registered Mixam account associated with the Mixam supplier
record. A valid `{access.token}` expires after 30 minutes.

## Webhook Endpoint (API URL)

Webhook endpoints take the following form:

```shell
https://{mixam.domain}/api/webhooks/{supplier.token}/shipment
```

### Path Tokens

  - `mixam.domain`: the domain associated with your supplier account (`mixam.co.uk`, `mixam.com`, `mixam.ca`, `mixam.de` or `mixam.com.au`)
  - `supplier.token`: a short, unique string assigned to your supplier account by the Mixam team

### HTTP Request Headers

Please pass **all** of the following HTTP headers on each Webhook request:

  - `Authorization: Bearer {access.token}`
  - `Content-Type: application/json`
  - `Accept: application/json`

### HTTP POST

Webhook endpoints accept only HTTP `POST` requests.

## Webhook Payload

The body of the Webhook HTTP `POST` request must be valid JSON containing the following properties:

| Property             | Applicable Status(es) | Java Type | Description |
|----------------------|---|---|---|
| `externalOrderId`    | All | `String` (Required) | Mixam's reference number for the item (e.g. `11/111111001`) |
| `orderStatus`        | All | `String` | One of the following:<br>`ACCEPTED`<br>`REJECTED`<br>`DELAYED`<br>`SHIPPED`<br>`CANCELLED`<br>If status is `DELAYED`, `UpdateDispatchDate` must be specified. |
| updateDispatchDate | DELAYED | Long | The new estimated dispatch date given in [Unix Epoch Time in milliseconds] (e.g. 1655897807000) |
| `deliveryId`         | `SHIPPED` | `String` | (Required for Split Delivery items) Mixam's reference number for the delivery (e.g. `ed642885-226a-4416-8b70-22d415866244`) |
| `trackingCode`       | `SHIPPED` | `String` | The tracking number/code as provided by the carrier |
| `sourceShipmentId`   | `SHIPPED` | `Long` | Integer id assigned to the shipment by the carrier |
| `numberOfItems`      | `SHIPPED` | `Long` | (Optional) Number of copies shipped; if omitted, Mixam assumes all copies in the delivery |
| `reason`             | `REJECTED`<br>`DELAYED`<br>`CANCELLED` | `String` | (Optional) Additional details |

### Example Payload

```json
{
  "externalOrderId": "11/111111001",
  "orderStatus": "SHIPPED",
  "deliveryId": "ed642885-226a-4416-8b70-22d415866244",
  "trackingCode": "5672345678",
  "sourceShipmentId": 123456
}
```

## Webhook Response

A successful (200-series) response to a Webhook HTTP `POST` request will be valid JSON containing the following properties:

| Property | Applies To | Java Type | Description |
|---|---|---|---|
| `status` | All | `String` | `SUCCESS` or `FAILURE` |
| `id` | API Successes | `String` | A unique, random identifier assigned to the response |
| `error` | API Failures | `String` | Short description of the error condition |

### Example Response

```json
{
    "id": null,
    "status": "FAILURE",
    "error": "Order 538277 is not found"
}
```

[HTTP BASIC authentication]:https://en.wikipedia.org/wiki/Basic_access_authentication
[Unix Epoch Time]:https://www.epoch101.com/
