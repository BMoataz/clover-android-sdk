/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

@SuppressWarnings("all")
public final class Refund implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
   * Total amount refunded, including tax
  */
  public java.lang.Long getAmount() {
    return cacheGet(CacheKey.amount);
  }
 /**
   * Tax amount refunded
  */
  public java.lang.Long getTaxAmount() {
    return cacheGet(CacheKey.taxAmount);
  }
 /**
   * The time when the refund was recorded on the server
  */
  public java.lang.Long getCreatedTime() {
    return cacheGet(CacheKey.createdTime);
  }
 /**
   * The time when the refund was recorded on the client
  */
  public java.lang.Long getClientCreatedTime() {
    return cacheGet(CacheKey.clientCreatedTime);
  }
 /**
   * The payment with which the refund is associated
  */
  public com.clover.sdk.v3.base.Reference getPayment() {
    return cacheGet(CacheKey.payment);
  }
  public com.clover.sdk.v3.base.Reference getEmployee() {
    return cacheGet(CacheKey.employee);
  }
  public java.util.List<com.clover.sdk.v3.base.Reference> getLineItems() {
    return cacheGet(CacheKey.lineItems);
  }
 /**
   * The tender type associated with this payment, e.g. credit card, cash, etc.
  */
  public com.clover.sdk.v3.base.Tender getOverrideMerchantTender() {
    return cacheGet(CacheKey.overrideMerchantTender);
  }
  public java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> getTaxableAmountRates() {
    return cacheGet(CacheKey.taxableAmountRates);
  }
  public com.clover.sdk.v3.payments.ServiceChargeAmount getServiceChargeAmount() {
    return cacheGet(CacheKey.serviceChargeAmount);
  }


  private enum CacheKey {
    amount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractAmount();
      }
    },
    taxAmount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractTaxAmount();
      }
    },
    createdTime {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractCreatedTime();
      }
    },
    clientCreatedTime {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractClientCreatedTime();
      }
    },
    payment {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractPayment();
      }
    },
    employee {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractEmployee();
      }
    },
    lineItems {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractLineItems();
      }
    },
    overrideMerchantTender {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractOverrideMerchantTender();
      }
    },
    taxableAmountRates {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractTaxableAmountRates();
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.extractServiceChargeAmount();
      }
    },
    ;

    public abstract Object extractValue(Refund instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public Refund() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Refund(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Refund(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Refund(Refund src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
  }



  private java.lang.Long extractAmount() {
    return getJSONObject().isNull("amount") ? null :
      getJSONObject().optLong("amount");
  }


  private java.lang.Long extractTaxAmount() {
    return getJSONObject().isNull("taxAmount") ? null :
      getJSONObject().optLong("taxAmount");
  }


  private java.lang.Long extractCreatedTime() {
    return getJSONObject().isNull("createdTime") ? null :
      getJSONObject().optLong("createdTime");
  }


  private java.lang.Long extractClientCreatedTime() {
    return getJSONObject().isNull("clientCreatedTime") ? null :
      getJSONObject().optLong("clientCreatedTime");
  }


  private com.clover.sdk.v3.base.Reference extractPayment() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("payment");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("payment"));
    }
    return null;
  }


  private com.clover.sdk.v3.base.Reference extractEmployee() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("employee");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("employee"));
    }
    return null;
  }


  private java.util.List<com.clover.sdk.v3.base.Reference> extractLineItems() {
    if (getJSONObject().isNull("lineItems")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("lineItems");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.base.Reference> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.base.Reference>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.base.Reference item = new com.clover.sdk.v3.base.Reference(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  private com.clover.sdk.v3.base.Tender extractOverrideMerchantTender() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("overrideMerchantTender");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Tender(getJSONObject().optJSONObject("overrideMerchantTender"));
    }
    return null;
  }


  private java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> extractTaxableAmountRates() {
    if (getJSONObject().isNull("taxableAmountRates")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("taxableAmountRates");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.payments.TaxableAmountRate>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.payments.TaxableAmountRate item = new com.clover.sdk.v3.payments.TaxableAmountRate(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  private com.clover.sdk.v3.payments.ServiceChargeAmount extractServiceChargeAmount() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("serviceChargeAmount");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.payments.ServiceChargeAmount(getJSONObject().optJSONObject("serviceChargeAmount"));
    }
    return null;
  }


  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field is set and is not null */
  public boolean isNotNullClientCreatedTime() {
    return cacheValueIsNotNull(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() {
    return isNotNullLineItems() && !getLineItems().isEmpty();
  }

  /** Checks whether the 'overrideMerchantTender' field is set and is not null */
  public boolean isNotNullOverrideMerchantTender() {
    return cacheValueIsNotNull(CacheKey.overrideMerchantTender);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null */
  public boolean isNotNullTaxableAmountRates() {
    return cacheValueIsNotNull(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxableAmountRates() {
    return isNotNullTaxableAmountRates() && !getTaxableAmountRates().isEmpty();
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }


  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field has been set, however the value could be null */
  public boolean hasClientCreatedTime() {
    return cacheHasKey(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'overrideMerchantTender' field has been set, however the value could be null */
  public boolean hasOverrideMerchantTender() {
    return cacheHasKey(CacheKey.overrideMerchantTender);
  }

  /** Checks whether the 'taxableAmountRates' field has been set, however the value could be null */
  public boolean hasTaxableAmountRates() {
    return cacheHasKey(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return cacheHasKey(CacheKey.serviceChargeAmount);
  }


  /**
   * Sets the field 'amount'.
   */
  public Refund setAmount(java.lang.Long amount) {
    logChange("amount");

    try {
      getJSONObject().put("amount", amount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(amount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.amount);
    return this;
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public Refund setTaxAmount(java.lang.Long taxAmount) {
    logChange("taxAmount");

    try {
      getJSONObject().put("taxAmount", taxAmount == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(taxAmount));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.taxAmount);
    return this;
  }

  /**
   * Sets the field 'createdTime'.
   */
  public Refund setCreatedTime(java.lang.Long createdTime) {
    logChange("createdTime");

    try {
      getJSONObject().put("createdTime", createdTime == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(createdTime));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.createdTime);
    return this;
  }

  /**
   * Sets the field 'clientCreatedTime'.
   */
  public Refund setClientCreatedTime(java.lang.Long clientCreatedTime) {
    logChange("clientCreatedTime");

    try {
      getJSONObject().put("clientCreatedTime", clientCreatedTime == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(clientCreatedTime));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.clientCreatedTime);
    return this;
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setPayment(com.clover.sdk.v3.base.Reference payment) {
    logChange("payment");

    try {
      getJSONObject().put("payment",
          payment == null ? org.json.JSONObject.NULL : payment.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.payment);
    return this;
  }

  /**
   * Sets the field 'employee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setEmployee(com.clover.sdk.v3.base.Reference employee) {
    logChange("employee");

    try {
      getJSONObject().put("employee",
          employee == null ? org.json.JSONObject.NULL : employee.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.employee);
    return this;
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Refund setLineItems(java.util.List<com.clover.sdk.v3.base.Reference> lineItems) {
    logChange("lineItems");

    try {
      if (lineItems == null) {
        getJSONObject().put("lineItems", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.lineItems);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.base.Reference obj : lineItems) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("lineItems", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.lineItems);
    return this;
  }

  /**
   * Sets the field 'overrideMerchantTender'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setOverrideMerchantTender(com.clover.sdk.v3.base.Tender overrideMerchantTender) {
    logChange("overrideMerchantTender");

    try {
      getJSONObject().put("overrideMerchantTender",
          overrideMerchantTender == null ? org.json.JSONObject.NULL : overrideMerchantTender.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.overrideMerchantTender);
    return this;
  }

  /**
   * Sets the field 'taxableAmountRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Refund setTaxableAmountRates(java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> taxableAmountRates) {
    logChange("taxableAmountRates");

    try {
      if (taxableAmountRates == null) {
        getJSONObject().put("taxableAmountRates", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.taxableAmountRates);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.payments.TaxableAmountRate obj : taxableAmountRates) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("taxableAmountRates", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.taxableAmountRates);
    return this;
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setServiceChargeAmount(com.clover.sdk.v3.payments.ServiceChargeAmount serviceChargeAmount) {
    logChange("serviceChargeAmount");

    try {
      getJSONObject().put("serviceChargeAmount",
          serviceChargeAmount == null ? org.json.JSONObject.NULL : serviceChargeAmount.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.serviceChargeAmount);
    return this;
  }


  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    unlogChange("amount");
    getJSONObject().remove("amount");
    cacheRemoveValue(CacheKey.amount);
  }

  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    unlogChange("taxAmount");
    getJSONObject().remove("taxAmount");
    cacheRemoveValue(CacheKey.taxAmount);
  }

  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    unlogChange("createdTime");
    getJSONObject().remove("createdTime");
    cacheRemoveValue(CacheKey.createdTime);
  }

  /** Clears the 'clientCreatedTime' field, the 'has' method for this field will now return false */
  public void clearClientCreatedTime() {
    unlogChange("clientCreatedTime");
    getJSONObject().remove("clientCreatedTime");
    cacheRemoveValue(CacheKey.clientCreatedTime);
  }

  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    unlogChange("payment");
    getJSONObject().remove("payment");
    cacheRemoveValue(CacheKey.payment);
  }

  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    unlogChange("employee");
    getJSONObject().remove("employee");
    cacheRemoveValue(CacheKey.employee);
  }

  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    unlogChange("lineItems");
    getJSONObject().remove("lineItems");
    cacheRemoveValue(CacheKey.lineItems);
  }

  /** Clears the 'overrideMerchantTender' field, the 'has' method for this field will now return false */
  public void clearOverrideMerchantTender() {
    unlogChange("overrideMerchantTender");
    getJSONObject().remove("overrideMerchantTender");
    cacheRemoveValue(CacheKey.overrideMerchantTender);
  }

  /** Clears the 'taxableAmountRates' field, the 'has' method for this field will now return false */
  public void clearTaxableAmountRates() {
    unlogChange("taxableAmountRates");
    getJSONObject().remove("taxableAmountRates");
    cacheRemoveValue(CacheKey.taxableAmountRates);
  }

  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    unlogChange("serviceChargeAmount");
    getJSONObject().remove("serviceChargeAmount");
    cacheRemoveValue(CacheKey.serviceChargeAmount);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Refund copyChanges() {
    Refund copy = new Refund();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Refund src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new Refund(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "Refund{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<Refund> CREATOR = new android.os.Parcelable.Creator<Refund>() {
    @Override
    public Refund createFromParcel(android.os.Parcel in) {
      Refund instance = new Refund(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public Refund[] newArray(int size) {
      return new Refund[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Refund> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Refund>() {
    @Override
    public Refund create(org.json.JSONObject jsonObject) {
      return new Refund(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean CLIENTCREATEDTIME_IS_REQUIRED = false;

    public static final boolean PAYMENT_IS_REQUIRED = false;

    public static final boolean EMPLOYEE_IS_REQUIRED = false;

    public static final boolean LINEITEMS_IS_REQUIRED = false;

    public static final boolean OVERRIDEMERCHANTTENDER_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNTRATES_IS_REQUIRED = false;

    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;

  }

}
