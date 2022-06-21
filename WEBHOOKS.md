# Mixam Webhooks

Mixam can provide a _Webhook_ ("post back") API through which Suppliers can notify Mixam of changes 
to the status of orders fulfilled with them. Please contact Mixam to have the Webhook API enabled 
for your supplier account.

## Webhook Endpoint (API URL)

Webhook endpoints take the following form:

```shell
https://{mixam.domain}/api/webhooks/{supplier.token}/shipment
```

### Path Tokens

  - `mixam.domain`: the domain associated with your supplier account (`mixam.co.uk`, `mixam.com`, `mixam.ca`, or `mixam.com.au`)
  - `supplier.token`: a short, unique string assigned to your supplier account by the Mixam team

Webhook endpoints accept only HTTP `POST` requests with `Content-Type: application/json`.

## Webhook Payload

The body of the Webhook HTTP `POST` request must be valid JSON containing the following properties:

| Property | Applicable Status(es) | Java Type | Description |
|---|---|---|---|
| `ExternalOrderId` | All | `String` (Required) | Mixam's reference number for the item (e.g. `11/111111001`) |
| `orderStatus` | All | `String` | One of the following:<br>`ACCEPTED`<br>`REJECTED`<br>`DELAYED`<br>`SHIPPED`<br>`CANCELLED`<br>If status is `DELAYED`, `UpdateDispatchDate` must be specified. |
| `UpdateDispatchDate` | `DELAYED` | `Long` | The new estimated dispatch date  |
| `deliveryId` | `SHIPPED` | `String` | (Required for Split Delivery items) Mixam's reference number for the delivery (e.g. `ed642885-226a-4416-8b70-22d415866244`) |
| `TrackingCode` | `SHIPPED` | `String` | The tracking number/code as provided by the carrier |
| `SourceShipmentId` | `SHIPPED` | `Long` | Integer id assigned to the shipment by the carrier |
| `NumberOfItems` | `SHIPPED` | `Long` | (Optional) Number of copies shipped; if omitted, Mixam assumes all copies in the delivery |
| `Reason` | `REJECTED`<br>`DELAYED`<br>`CANCELLED` | `String` | (Optional) Additional details |

### Example Payload

```json
{
  "ExternalOrderId": "11/111111001",
  "orderStatus": "SHIPPED",
  “DeliveryId”: “ed642885-226a-4416-8b70-22d415866244”,
  “TrackingCode”: “5672345678”,
  "sourceShipmentId": 123456
}
```
