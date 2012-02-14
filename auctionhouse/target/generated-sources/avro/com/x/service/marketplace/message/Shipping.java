/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.x.service.marketplace.message;  
@SuppressWarnings("all")
public class Shipping extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Shipping\",\"namespace\":\"com.x.service.marketplace.message\",\"fields\":[{\"name\":\"shippingLocaleServices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ShippingLocaleService\",\"fields\":[{\"name\":\"rateType\",\"type\":{\"type\":\"enum\",\"name\":\"ShippingRateType\",\"symbols\":[\"FLAT\",\"CALCULATED\",\"FREIGHT\"]}},{\"name\":\"localeType\",\"type\":{\"type\":\"enum\",\"name\":\"ShippingLocaleType\",\"symbols\":[\"DOMESTIC\",\"INTERNATIONAL\"]}},{\"name\":\"applyPromotionalShippingRule\",\"type\":\"boolean\"},{\"name\":\"shippingServiceOptions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ShippingServiceOption\",\"fields\":[{\"name\":\"sellerPriority\",\"type\":\"int\"},{\"name\":\"serviceName\",\"type\":\"string\"},{\"name\":\"cost\",\"type\":{\"type\":\"record\",\"name\":\"CurrencyAmount\",\"fields\":[{\"name\":\"amount\",\"type\":\"double\"},{\"name\":\"code\",\"type\":\"string\"}]}},{\"name\":\"additionalCost\",\"type\":[\"null\",\"CurrencyAmount\"]},{\"name\":\"packagingHandlingCost\",\"type\":[\"null\",\"CurrencyAmount\"]},{\"name\":\"surcharge\",\"type\":[\"null\",\"CurrencyAmount\"]},{\"name\":\"shipToLocations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}]}]}}}]}}}]}");
  public java.util.List<com.x.service.marketplace.message.ShippingLocaleService> shippingLocaleServices;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return shippingLocaleServices;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: shippingLocaleServices = (java.util.List<com.x.service.marketplace.message.ShippingLocaleService>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}