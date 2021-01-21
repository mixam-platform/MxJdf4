![GitHub tag (latest SemVer)](https://img.shields.io/github/v/tag/mixam-platform/MxJdf4?label=Latest%20Version&style=for-the-badge)

# Mixam Job Description Format, v. 4

## API & SDK for ordering a print job

The _Mixam Job Description Format_ describes the structure of a print job in an unambiguous way.

Although the Mixam Platform is capable of specifying a job in many formats (cXML, OneFlow, and
vendor specific formats), the MXJDF (Mixam Job Description Format) is the most complete and useful,
and also the recommended way to establish an automated connection with us.

The MXJDF format is made of attributes and values and can be provided as an XML and/or JSON
document. We also provide a Java implementation of the MXJDF format, but it can easily be
implemented with other programing languages such as PHP or JavaScript.

MXJDF documents can be attached to an email message or posted to the printer's preferred end-point
using HTTPS or SFTP.

## Table of Contents

| Chapter | Number |
|---|--:|
| [Top Level Element](#1-top-level-element) | 1 |
| [Element: job](#2-element-job) | 2 |
| [Element: article](#3-element-article) | 3 |
| [Element: component](#4-element-component) | 4 |
| [Element: chromaticity](#5-element-chromaticity) | 5 |
| [Element: format](#6-element-format) | 6 |
| [Element: material](#7-element-material) | 7 |
| [Element: refining](#8-element-refining) | 8 |
| [Element: processing](#9-element-processing) | 9 |
| [Element: binding](#10-element-binding) | 10 |
| [Element: details](#11-element-details) | 11 |
| [Element: shipment](#12-element-shipment) | 12 |
| [Element: RecipientAddress](#13-element-recipientaddress) | 13 |
| [Element: address](#14-element-address) | 14 |
| [Element: senderForLabel (Address)](#15-element-senderforlabel-address) | 15 |
| [Type: Address](#16-type-address) | 16 |
| [Element: delivery](#17-element-delivery) | 17 |
| [Element: File](#18-element-file) | 18 |
| [Element: export](#19-element-export) | 19 |
| [JSON Example](#20-json-example) | 20 |
| [XML Example](#21-xml-example) | 21 |
 
# 1. Top Level Element
The top level of the MxJdf document contains the following elements:
```javascript
{
  "version": 4.01.05,
  "desc": "mixam.job.description",
  "dateCreated": 1579177108174,
  "author" : "Sherlock Holmes",
  "referencedJobNumber": 303171489,
  "price" : 105.31,
  “currencyCode”: “gbp”,
  "job": {...},
  "export": {...}
}
```

| Property  | Description | Values |
|---|---|---|
|version| Current version of the protocol. (String)  | Currently ‘4.01.03’|
|desc|Document description. (String)|Always "mixam.job.description"|
|dateCreated|Epoch date of creation. (Long number)|A Unix Timestamp of the date the document was created|
|author|The name of the person who created the document. (String)|   |
|referencedJobNumber|The associated order’s id in the Mixam system. (String)|   |
|price|The pre-agreed cost price of the job (Double precision number)|   |
|currencyCode|The currency in which the price is specified. (String)|“GBP”, “USD”, “CAD”, “AUD”|
|job|A map of properties describing the job.|See bellow|
|export|A map of properties describing the export value of the goods. (Map). Applicable only when goods are shipped overseas.| See bellow.|

# 2. Element: job
```javascript
"job": {
    "article": {...},
    "details": {...},
    "shipment": {...}
}
```
| Property  | Description | Values |
|---|---|---|
|article|The article describes the print requirements (map)|See bellow|
|details|Contains some meta data regarding the number of copies, tax and alternative id. (map)|See bellow|
|shipment|Contains addresses and delivery details|See bellow|


# 3. Element: article
```javascript
"article": {
  "components": [...],
  "type": 0,
  "product": 1,
  "subProduct": 1
 }
````
| Property  | Description | Values |
|---|---|---|
|components|A list of components (such as text, cover, dust jacket etc.) (List<component>)|See bellow|
|type|Taxation type (VAT, GST etc.) (ArticleTaxType)|EXEMPT(0),<br> VAT(1),<br> GST(2),<br> USA_TAX(3);|
|product|The product id (ProductGroupType)|INVALID(0),<br>PRODUCT_BRUCHURES(1),<br>PRODUCT_FLYERS(2),<br>PRODUCT_FOLDED(3),<br>PRODUCT_POSTERS(4),<br>   PRODUCT_LETTERHEADS(5),<br>PRODUCT_PHOTOBOOK(6),<br>PRODUCT_BOOK(7),<br>  PRODUCT_BUSINESS_CARD(8),<br>PRODUCT_POSTCARD(9),<br>PRODUCT_GREETING_CARD(10)<br>PRODUCT_NOTEPAD(11),<br> PRODUCT_COMPLIMENT_SLIPS(12),<br>PRODUCT_ENVELOPES(13),<br>PRODUCT_FOLDERS(14),<br>PRODUCT_LAYFLAT(15),<br>PRODUCT_WALL_CALENDARS(16),<br>PRODUCT_DESK_CALENDARS(17)<br> PRODUCT_VR_WALL_CALENDARS(18)<br> PRODUCT_VR_DESK_CALENDARS(19),<br>  PRODUCT_TRADITIONAL_BOOK(20);|
|subProduct|Fine classification of the product. (optional) (SubProductType)|PRODUCT_HARD_COVER_BOOKS(1)<br>PRODUCT_PAPERBACK_BOOKS(2)<br>PRODUCT_PERFECT_BOOKLETS(3)<br>PRODUCT_WIRO_BOOKLETS(4)<br>PRODUCT_LOOP_BOOKLETS(5)<br>PRODUCT_STAPLED_BOOKLETS(6)<br>PRODUCT_MAGAZINES(7)<br>PRODUCT_CATALOGS(8)<br>PRODUCT_BOOKLETS(9)<br>PRODUCT_ZINES(10)<br>PRODUCT_COMIC_BOOKS(11)<br> PRODUCT_ART_PRINTS(12)<br>PRODUCT_MANGA(13)<br>PRODUCT_WEDDING_BOOK(14)<br>PRODUCT_YEARBOOK(15)<br>PRODUCT_COOKBOOK(16)<br> PRODUCT_COLOURINGBOOK(17)<br> PRODUCT_ARTBOOK(18)<br> PRODUCT_GRAPHIC_NOVEL(19)<br> PRODUCT_LOOKBOOK(20);|


# 4. Element: component
```javascript
{
  "pages": 4,
  "chromaticity": {...},
  "format": {...},
  "material": {...},
  "processing": {...},
  "files": [...],
  "type": 2
}
```` 

| Property  | Description | Values |
|---|---|---|
|pages|Number of pages in the component (Integer number)|4, 8, 32, to name a few|
|chromaticity|Chromaticity element which specify the colour space on the front and back|See below|
|format|Format element which specify the component measurements|See below|
|material|Material element which specify the component paper stock.|See below|
|processing|Processing element which specify additional processing such as binding.|See below|
|files|A list of artwork files associated with the component. (List<File>)|See bellow|
|type|ComponentType|INVALID(0),<br>CONTENT(1),<br>COVER(2),<br>JACKET(3),<br>BOOKMARK(4),<br>ENVELOPE (5)|

# 5. Element: chromaticity
```javascript
{
  "front": 3,
  "back": 3
}
```

| Property  | Description | Values |
|---|---|---|
|front|Colour space on front / outside. (ColorType)|INVALID (0),<br>HKS (1),<br>BLACK (2),<br>PROCESS (3);|
|back|Colour space on back / inside. (ColorType)|INVALID (0),<br>HKS (1),<br>BLACK (2),<br>PROCESS (3);|

# 6. Element: format
```javascript
 "format" : {
    "longEdge" : 210,
    "orientation" : 1,
    "shortEdge" : 99,
    "units": 0
}
```

| Property  | Description | Values |
|---|---|---|
|longEdge|Component long axis. (Double precision number) in shop’s units||
|shortEdge|Component short axis. (Double precision number) in shop’s units ||
|orientation|(OrientationType)|PORTRAIT(0),<br>LANDSCAPE(1);|
|units|The units in which the edges are specified. mm on metric system, inch on imperial.|MM (0),<br>INCH(1),|
 
# 7. Element: material
```javascript
"material" : {
    "glossiness" : 1,
    “weight" : 170,
    "units" : 1,
    "type" : 4,
    "refinings": [{...}, {...}]
}
````

| Property  | Description | Values |
|---|---|---|
|glossiness|Paper glossiness (MaterialGlossinessType)|NONE(0),<br>MATT(1),<br>GLOSS(2),|
|weight|The weight on one unit (Integer number)||
|units|Units of weight (PaperWeightUnit)|INVALID(0),<br>GSM(1),<br>LIBRA_COVER(2),<br> LIBRA_TEXT(3),<br> LIBRA_CARD(4),|
|type|(MaterialType) (SILK is known as SATIN in the US)|INVALID(0)<br>SILK(1)<br>GLOSS(2)<br>UNCOATED(3)<br>AFFICHE_PAPER(4)<br>OUTDOOR_PAPER(5)<br>ILLUSTRATION_PRINTING_PAPER(6)<br>PHOTOGRAPHIC_PRINTING_PAPER(7)<br>POSTCARD_BOARD(8)<br>RECYCLED_NATURAL_PAPER(9)<br>RECYCLED_SILK_PAPER(10)<br>MATT(11)<br>WEATHERPROOF_VINYL(12)<br>RECYCLED_UNCOATED_PAPER(13)|
|refinings|List of refining of material such as lamination coating and UV coating. (MaterialRefining)|See below|
|color|The colour of the material|WHITE (0),<br>YELLOW(1),<br>GREEN(2),<br>RED(3)|

# 8. Element: refining
```javascript
"refining": {
  "effect": 2,
  "side": 1,
  "type": 3
}
````

| Property  | Description | Values |
|---|---|---|
|effect|(RefiningEffect)|NONE (0),<br>MATT_FINISH(1),<br>GLOSS_FINISH (2),<br>SILK_FINISH (3),<br>SOFT_TOUCH (4),<br>GOLD (5),<br>SILVER (6),|
|side|(RefiningSideType)|NONE(0),<br>FRONT(1),<br>BACK(2),<br>FRONT_AND_BACK(3),<br>OUTSIDE(4),<br>INSIDE (5)<br>OUTSIDE_AND_INSIDE(6)|
|type|(RefiningType)|NONE (0) <br>ULTRA_VIOLET_COATING(1) <br>LAMINATION (2), <br>PROTECTIVE_FOIL (3) <br>METAL_FOIL (4) <br>SOFT_PVC_FILM_LAMINATION (5) <br>ULTRA_VIOLET_SPOT_COATING (6) <br>DISPERSION_COATING (7) <br>BIND_EMBOSSING (8) <br>RELIEF_SPOT_COATING (9) <br>ULTRA_VIOLET_3D_SPOT_COATING(10)|

# 9. Element: processing
```javascript
"processing": {
    "binding": {...},
    "creasing": 0,
    "folding": 0,
    "headTailBand": 1,
    "ribbon": 0,
    "window": 0,
    "feature": 0
}
```

| Property  | Description | Values |
|---|---|---|
|binding|Binding element (map)|See below|
|creasing|(CreasingType)|NONE(0),<br>>CREASING_NECESSARY(1)|
|folding|(FoldingType)|FLAT (0), <br>HALF  (1), <br>LETTER  (2), <br>Z  (3), <br>GATE_OPEN (4), <br>GATE_CLOSED (5), <br>CROSS (6), <br>DOUBLE_PARALLEL (7)|
|headTailBand|Ratchford (BandType)|NONE(0), <br>BLACK_AND_WHITE_69WS(1), <br>WHITE_T117(2), <br>GREEN_AND_BIEGE_72WS(3), <br>DARK_BLUE_AND_WHITE_64WS(4), <br>RED_T105(5), <br>MAROON_AND_WHITE_66WS(6), <br>BROWN_AND_BIEGE_58WS(7), <br>RED_AND_WHITE_56WS(8), <br>MEDIUM_GREY_T109(9), <br>YELLOW_T122(10), <br>BLACK_T108(11), <br>LIGHT_BLUE_AND_WHITE_634WS(12), <br>YELLOW_AND_DARK_BLUE_59WS(13), <br>RED_AND_GREY_55WS(14), <br>RED_AND_YELLOW_65WS(15), <br>NAVY_T118(16), <br>GREEN_AND_BLACK_52WS(17), <br>PURPLE_AND_WHITE_54WS(18), <br>BLACK_AND_DARK_GREEN_71WS(19), <br>GREEN_AND_RED_61WS(20), <br>RED_AND_BLACK_53WS(21), <br>YELLOW_AND_BROWN_57WS(22), <br>YELLOW_AND_BLACK_67WS(23), <br>GREEN_AND_WHITE_68WS(24), <br>GREEN_AND_YELLOW_62WS(25), <br>NAVY_AND_GOLD(26),|
|ribbon|Ratchford  (RibbonType)|NONE(0), <br>MAROON(1), <br>BLACK(2), <br>DARK_GREEN(3), <br>BRIGHT_RED(4), <br>IVORY(5), <br>WHITE(6), <br>GOLD(7), <br>PURPLE(8), <br>ORANGE(9), <br>PINK(10), <br>GREY(11), <br>BABY_BLUE(12), <br>BLUE(13),|
|window|Envelope window (WindowType)|NONE(0), <br>LEFT(1), <br>RIGHT(2)|
|feature|(FeatureType)|INVALID(0), <br>SUPPLY_FOLDED(1), <br>SUPPLY_NOT_FOLDED(2), <br>PERFORATED_ON_TOP(3), <br>PERFORATED_LEFT(4), <br>PEEL_AND_SEAL(5)|

# 10. Element: binding
```javascript
{
   "type": 2,
   "color": 0,
   "loops": 0,
   "endPaperColor": 0,
   "spineWidth": 7.5,
}
```
| Property  | Description | Values |
|---|---|---|
|type|(BindingType)|NONE(0), <br>STAPLE_BINDING(1), <br>PERFECT_BINDING(2), <br>WIRO_BINDING(3), <br>LOOP_BINDING(4), <br>BOOK_BINDING(5), <br> SEW_BINDING(6), <br>CALENDAR_BINDING (7)|
|color|Wiro spiral colour (BindingColorType)|NONE (0), <br>BLACK (1), <br>SILVER (2), <br>WHITE (3),|
|loops|How many loop holes. (LoopsType)|NONE (0), <br>TWO (1), <br>FOUR (2),|
|endPaperColor|(EndPaperColorType)|NONE(0), <br>WHITE(1), <br>BLACK(2); <br>COLORPLAN_ADRIATIC(10)<br>COLORPLAN_AMETHYST(11)<br>COLORPLAN_AZURE_BLUE(12) <br>COLORPLAN_BAGHDAD_BROWN(13) <br>COLORPLAN_BITTER_CHOCOLATE(14) <br>COLORPLAN_BRIGHT_RED(15) <br>COLORPLAN_BRIGHT_WHITE(16) <br>COLORPLAN_CANDY_PINK(17) <br>COLORPLAN_CHINA_WHITE(18) <br>COLORPLAN_CITRINE(19) <br>COLORPLAN_CLARET(20) <br>COLORPLAN_COBALT(21) <br>COLORPLAN_COOL_BLUE(22) <br>COLORPLAN_COOL_GREY(23) <br>COLORPLAN_DARK_GREY(24) <br>COLORPLAN_EBONY(25) <br>COLORPLAN_EMERALD(26) <br>COLORPLAN_FACTORY_YELLOW(27) <br>COLORPLAN_FOREST(28) <br>COLORPLAN_FUSCHIA_PINK(29) <br>COLORPLAN_HARVEST(30) <br>COLORPLAN_HOT_PINK(31) <br>COLORPLAN_ICE_WHITE(32) <br>COLORPLAN_IMPERIAL_BLUE(33) <br>COLORPLAN_LAVENDAR(34) <br>COLORPLAN_LOCKWOOD_GREEN(35) <br>COLORPLAN_MANDARIN(36) <br>COLORPLAN_MARRS_GREEN(37) <br>COLORPLAN_MID_GREEN(38) <br>COLORPLAN_MIST(39) <br>COLORPLAN_NATURAL(40) <br>COLORPLAN_NEW_BLUE(41) <br>COLORPLAN_NUBUCK_BROWN(42) <br>COLORPLAN_PALE_GREY(43) <br>COLORPLAN_PARK_GREEN(44) <br>COLORPLAN_PISTACHIO(45) <br>COLORPLAN_POWDER_GREEN(46) <br>COLORPLAN_PRISTINE_WHITE(47) <br>COLORPLAN_PURPLE(48) <br>COLORPLAN_RACING_GREEN(49) <br>COLORPLAN_REAL_GREY(50) <br>COLORPLAN_ROYAL_BLUE(51) <br>COLORPLAN_SAPPHIRE(52) <br>COLORPLAN_SCARLET(53) <br>COLORPLAN_SMOKE(54) <br>COLORPLAN_SORBET_YELLOW(55) <br>COLORPLAN_STONE(56) <br>COLORPLAN_TABRIZ_BLUE(57) <br>COLORPLAN_TURQUOISE(58) <br>COLORPLAN_VELLUM_WHITE(59) <br>COLORPLAN_VERMILLION(60) <br>COLORPLAN_WHITE_FROST(61)|
|spineWidth|(Double precision number)|In shops units (mm in the UK, inch in the US)|

# 11. Element: details
```javascript
 "details": {
   "additionalProjectName": "370260/1",
   "completionType": 3,
   "assumedPrintType": 1,
   "totalCirculation": 400 
 }
```

| Property  | Description | Values |
|---|---|---|
|additionalProjectName||Additional Order number. Reference number. (String)||
|completionType|Urgency of the job. Default value is 4 (Standard)|INVALID(0), <br>SAME_DAY(1), <br>EXPRESS(2), <br>OVERNIGHT(3), <br>STANDARD(4), <br>SAVER(5);|
|totalCirculation|The total number of copies (Integer)||
|assumedPrintType|The expect print technology|NONE(0), <br>LITHO(1), <br>DIGITAL(2), <br>INKJET(3)|
|jobType|Classification of print job|PRIMARY_PRINT(0), <br>RIPPED_PROOF(1), <br>HARD_COPY_PROOF(2)|

# 12. Element: shipment
```javascript
"shipment": {
   "deliveryAddresses": [...],
   "senderForLabel": {...},
   "weight": 1.2
   "units": 1
}
```

| Property  | Description | Values |
|---|---|---|
|deliveryAddresses|A list of RecipientAddress elements. (List<RecipientAddress>)|See bellow|
|senderForLabel|The sender address. (Address)|See bellow|
|Weight|The expected weight of the goods. (Double precision number)||
|units|The units in which the weight is specified. KILOGRAM on metric system, LIBRA on imperial.|KILOGRAM(0), <br>LIBRA(1),|

# 13. Element: RecipientAddress
```javascript
{
  "deliveryId": "abc123456",
  "address": {...},
  "circulation:  100,
  "delivery": {...},
  "dispatchDate": 1579693407751,
  "deliveryDate": 1579695818930
}
```

| Property  | Description | Values |
|---|---|---|
|deliveryId|Unique identifier of the delivery (String).|Useful in cases where the supplier needs to report back a completion of a specific delivery|
|address|Address of recipient (Address)|See bellow|
|circulation|How many copies to this specific address. (Integer number)||
|delivery|Delivery details. (Delivery)|See bellow|
|dispatchDate|Epoch date of dispatch (when the boxes are due to be collected by the carrier.) (Long number)|A Unix Timestamp|
|deliveryDate|Epoch date of delivery (when the boxes are due to arrive at the customer address.) (Long number)|A Unix Timestamp|

# 14. Element: address
```javascript
"address": {
      "salutation": "Mr.",
      "firstName": "Sherlock",
      "surName": "Holmes",
      "street1": "221B Baker Street",
      "county": "Marylebone",
      "postalCode": "NW1 6XE",
      "city": "London",
      "country": "GB",
      "telephoneNumber": "07585055748",
      "email": "machinemagazine@mail.com"
}
```

See type ‘Address’

# 15. Element: senderForLabel (Address)
```javascript
"senderForLabel": {
    "salutation": "Mr.",
    "companyName": "Mixam Print",
    "firstName": "Arthur",
    "surName": "Conan Doyle",
    "street1": "6 Hercules Way",
    "street2": "Building 1"
    "county": "Hertfordshire",
    "postalCode": "WD25 7GS",
    "city": "Watford",
    "country": "GB",
    "telephoneNumber": "01923 594 040",
    "email": "info@mixam.co.uk"
}
```
See type ‘Address’

# 16. Type: Address
```javascript
{
    "salutation": "Mr.",
    "companyName": "Mixam Print",
    "firstName": "Arthur",
    "surName": "Conan Doyle",
    "street1": "6 Hercules Way",
    "street2": "Building 1"
    "county": "Hertfordshire",
    "postalCode": "WD25 7GS",
    "city": "Watford",
    "country": "GB",
    "telephoneNumber": "01923 594 040",
    "locationType": 0,
    "email": "info@mixam.co.uk"
}
```

| Property  | Description | Values |
|---|---|---|
|salutation|(SalutationType)|MX("Mx."), <br>MS("Ms."), <br>MR("Mr."), <br>DR("Dr."), <br>MRS("Mrs"), <br>PROF("Prof"),|
|companyName|(String)||
|firstName|(String)||
|surName|(String)||
|street1|(String)||
|street2|Optional (String) ||
|street3|Optional (String) ||
|county|Usually county name. State in the US. (String)||
|postalCode|Postcode in the UK, zip in US. (String)||
|city|(String)||
|country|(String)|“GB”, “US”, “CA” or “AU”|
|telephoneNumber|(String)||
|email|(String)||
|locationType|(AddressLocationType)|RESIDENTIAL(0), <br>BUSINESS_DOCK(1), <br>BUSINESS_NO_DOCK(2), <br>LIMITED_ACCESS(3), <br>TRADE_SHOW(4), <br>CONSTRUCTION(5), <br>FARM(6),|
 
# 17. Element: delivery
```javascript
"delivery": {
    "type": "parcel",
    "carrier": "UPS",
    "serviceType": "Next day air",
    "serviceDescription": "By Friday, 17:00",
    "canonicalUri": "UPS_NEXTDAYAIR_2_XCR_Z",
    "cost": 6.50
    "url": "https://mixam.co.uk/spedition/5e2842bc4ed2f62bd2375020"
  }
```

| Property  | Description | Values |
|---|---|---|
|type|(DeliveryType)|PARCEL(0), <br>PALLET(1), <br>ENVELOPE(2);|
|carrier|The name of the carrier (String)|DPD, 2MV, Mini Clipper etc.|
|serviceType|Usually Next day (in the UK) (String)||
|serviceDescription|(String)||
|canonicalUri|A unique identifier of the service (String)||
|cost|Cost of delivery (Double precision number)||
|url|Points to a page where collection can be summoned and shipment labels printed. (String)||

# 18. Element: File
```javascript
 {
      "type": 0,
      "name": "job372825.pdf",
      "url": "https://s3-eu-...83da8bb6fe8d858d2117/job372825.pdf",
      "checksum": "90be4101398f7f9bc95abe8b1d0f7447",
      "sizeInBytes": 1865517
}
```

| Property  | Description | Values |
|---|---|---|
|type|Which component is associated with this file. (FileType)|ALL(0), <br>BODY(1), <br>COVER(2), <br>DUST_JACKET(3), <br>HEAD_TO_HEAD(4)|
|name|Name of file (String)||
|url|Where to download this file (String)||
|checksum|MD5 checksum of this file. (String)||
|sizeInBytes|Size of file (Long number)||

# 19. Element: export
Optional, applicable only when goods are shipped overseas.
 ```javascript
"export": {
    "customsValueSum": 100,
    "customsValueCurrency": "USD"
}
```

| Property  | Description | Values |
|---|---|---|
|customsValueSum|Value of the goods for custom evaluation. (Integer number)||
|customsValueCurrency|Currency code  of the above value.|GBP, USD, CAD, AUD|

# 20. JSON Example

```javascript
{
  "version": "4.01.05",
  "desc": "mixam.job.description",
  "referencedJobNumber": "484134",
  "author": "Sherlock Holmes",
  "dateCreated": 1603279100614,
  "job": {
    "article": {
      "components": [
        {
          "pages": 4,
          "chromaticity": {
            "front": 3,
            "back": 0
          },
          "format": {
            "longEdge": 297.0,
            "orientation": 0,
            "shortEdge": 210.0,
            "units": 0
          },
          "material": {
            "weight": 170,
            "units": 1,
            "refinings": [
              {
                "effect": 2,
                "side": 4,
                "type": 2
              }
            ],
            "type": 1,
            "color": 0
          },
          "processing": {},
          "type": 2,
          "files": [
            {
              "type": 2,
              "name": "job484134-cover.pdf",
              "url": "https://s3.wasabisys.com/files.mixam.com/76f1a499451752af04e37aa328718a86c0afb2f8/job484134-cover.pdf",
              "checksum": "4e8dcebe35e8b00dbd6b7b72ecbcba38",
              "sizeInBytes": 13273803
            }
          ]
        },
        {
          "pages": 28,
          "chromaticity": {
            "front": 2,
            "back": 3
          },
          "format": {
            "longEdge": 297.0,
            "orientation": 0,
            "shortEdge": 210.0,
            "units": 0
          },
          "material": {
            "weight": 200,
            "units": 1,
            "refinings": [],
            "type": 1,
            "color": 0
          },
          "processing": {
            "binding": {
              "type": 5,
              "endPaperColor": 2,
              "spineWidth": 28.0
            }
          },
          "type": 1,
          "files": [
            {
              "type": 1,
              "name": "job484134-body.pdf",
              "url": "https://s3.wasabisys.com/files.mixam.com/76f1a499451752af04e37aa328718a86c0afb2f8/job484134-body.pdf",
              "checksum": "05551af33a81f6f13802ca1858919414",
              "sizeInBytes": 256689704
            }
          ]
        }
      ],
      "type": 0,
      "product": 7,
      "subProduct": 0
    },
    "details": {
      "additionalProjectName": "5f7c9449a478e23e57444661",
      "completionType": 4,
      "totalCirculation": 1,
      "assumedPrintType": 2,
      "orderId": "5f7c9449a478e23e57444661"
    },
    "shipment": {
      "deliveryAddresses": [
        {
          "deliveryId": "a895ac12-9a6a-4551-a71e-58e03393353b",
          "address": {
            "salutation": "Mr.",
            "firstName": "Sherlock",
            "surName": "Holmes",
            "street1": "221B Baker Street",
            "street2": "Marylebone",
            "postalCode": "NW1 6XE",
            "city": "London",
            "county": "N/A",
            "country": "GB",
            "telephoneNumber": "02072243688",
            "company": "",
            "locationType": 0
          },
          "circulation": 1,
          "delivery": {
            "type": 0,
            "carrier": "Interlink",
            "serviceType": "DPD Next day",
            "serviceDescription": "DPD Next day",
            "canonicalUri": "DPD-DPD_NEXT_DAY-zxa-1",
            "cost": 6.5,
            "url": "https://mixam.co.uk/spedition/5f88be4ef9936c52e6c93d86"
          },
          "dispatchDate": 1603234800000,
          "deliveryDate": 1603321200000
        }
      ],
      "senderForLabel": {
        "salutation": "Mr.",
        "firstName": "Arthur",
        "surName": "Conan Doyle",
        "street1": "6 Hercules Way, Watford, Hertfordshire, WD25 7GS",
        "postalCode": "WD25 7GS",
        "city": "Watford",
        "county": "Hertfordshire",
        "country": "GB",
        "telephoneNumber": "01923 594 040",
        "email": "info@mixam.co.uk",
        "company": "Mixam Print"
      },
      "weight": 1.7999999523162842,
      "units": 0
    }
  },
  "export": {
    "customsValueSum": 33.16999816894531,
    "customsValueCurrency": "GBP"
  },
  "price": 33.16999816894531,
  "currencyCode": "GBP"
}
```

# 21. XML Example

```xml
<MxJdf4>
    <version>4.01</version>
    <desc>mixam.job.description</desc>
    <referencedJobNumber>37663402</referencedJobNumber>
    <author>Sherlock Holmes</author>
    <dateCreated>1603279655663</dateCreated>
    <job>
        <article>
            <components-list>
                <components>
                    <pages>28</pages>
                    <chromaticity>
                        <front>3</front>
                        <back>3</back>
                    </chromaticity>
                    <format>
                        <longEdge>210.0</longEdge>
                        <orientation>1</orientation>
                        <shortEdge>148.0</shortEdge>
                        <units>0</units>
                    </format>
                    <material>
                        <weight>150</weight>
                        <units>1</units>
                        <refinings-list/>
                        <type>1</type>
                        <color>0</color>
                    </material>
                    <processing>
                        <binding>
                            <type>1</type>
                            <spineWidth>0.0</spineWidth>
                        </binding>
                    </processing>
                    <type>1</type>
                    <files-list>
                        <files>
                            <type>1</type>
                            <name>job376634.pdf</name>
                            <url>https://s3.wasabisys.com/files.mixam.com/8472912a7dba3e57ddeb36131ae96726ff3cc5da/job376634.pdf</url>
                            <checksum>584f4618c4532fbacda1d36d8a0d8338</checksum>
                            <sizeInBytes>11437989</sizeInBytes>
                        </files>
                    </files-list>
                </components>
            </components-list>
            <type>0</type>
            <product>1</product>
            <subProduct>0</subProduct>
        </article>
        <details>
            <additionalProjectName>5e31a3dc2f231530f33ef3a4</additionalProjectName>
            <completionType>2</completionType>
            <totalCirculation>250</totalCirculation>
            <assumedPrintType>3</assumedPrintType>
            <orderId>5e31a3dc2f231530f33ef3a4</orderId>
        </details>
        <shipment>
            <deliveryAddresses-list>
                <deliveryAddresses>
                    <deliveryId>82dcdf2c-f5d9-46d3-b06f-a47e3fd41bf9</deliveryId>
                    <address>
                        <salutation>Mr.</salutation>
                        <firstName>Sherlock</firstName>
                        <surName>Holmes</surName>
                        <street1>221B Baker Street</street1>
                        <street2></street2>
                        <postalCode>NW16XE</postalCode>
                        <city>Marylebone</city>
                        <county>London</county>
                        <country>GB</country>
                        <telephoneNumber>01225485600</telephoneNumber>
                        <company>Interaction</company>
                        <locationType>0</locationType>
                    </address>
                    <circulation>250</circulation>
                    <delivery>
                        <type>0</type>
                        <carrier>Interlink</carrier>
                        <serviceType>DPD Next day</serviceType>
                        <serviceDescription>DPD Next day</serviceDescription>
                        <canonicalUri>DPD-DPD_NEXT_DAY-zxa-1</canonicalUri>
                        <cost>8.39</cost>
                    </delivery>
                    <dispatchDate>1580428800000</dispatchDate>
                    <deliveryDate>1580688000000</deliveryDate>
                </deliveryAddresses>
            </deliveryAddresses-list>
            <senderForLabel>
                <salutation>Mr.</salutation>
                <firstName>Arthur</firstName>
                <surName>Conan Doyle</surName>
                <street1>6 Hercules Way, Watford, Hertfordshire, WD25 7GS</street1>
                <postalCode>WD25 7GS</postalCode>
                <city>Watford</city>
                <county>Hertfordshire</county>
                <country>GB</country>
                <telephoneNumber>01923 594 040</telephoneNumber>
                <email>info@mixam.co.uk</email>
                <company>Mixam Print</company>
            </senderForLabel>
            <weight>16.299999237060547</weight>
            <units>0</units>
        </shipment>
    </job>
    <export>
        <customsValueSum>143.85000610351562</customsValueSum>
        <customsValueCurrency>GBP</customsValueCurrency>
    </export>
    <price>143.85000610351562</price>
    <currencyCode>GBP</currencyCode>
</MxJdf4>
```

## License
The Mixam Job Description Format is an Open Source software released under the
 [Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.html).
 

