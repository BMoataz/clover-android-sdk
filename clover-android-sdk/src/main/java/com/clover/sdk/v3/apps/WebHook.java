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

package com.clover.sdk.v3.apps;

@SuppressWarnings("all")
public final class WebHook implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getUrl() {
    return cacheGet(CacheKey.url);
  }
 /**
   * A secret string included as a header in the HTTP request from Clover to the developer's web hook callback URL.
  */
  public java.lang.String getSecret() {
    return cacheGet(CacheKey.secret);
  }
  public java.lang.Boolean getValid() {
    return cacheGet(CacheKey.valid);
  }
 /**
   * The verification code that was sent to the developer's web hook callback URL.
  */
  public java.lang.String getVerification() {
    return cacheGet(CacheKey.verification);
  }
  public java.lang.Boolean getOrders() {
    return cacheGet(CacheKey.orders);
  }
  public java.lang.Boolean getApp() {
    return cacheGet(CacheKey.app);
  }
  public java.lang.Boolean getPayments() {
    return cacheGet(CacheKey.payments);
  }
  public java.lang.Boolean getInventory() {
    return cacheGet(CacheKey.inventory);
  }


  private enum CacheKey {
    url {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractUrl();
      }
    },
    secret {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractSecret();
      }
    },
    valid {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractValid();
      }
    },
    verification {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractVerification();
      }
    },
    orders {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractOrders();
      }
    },
    app {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractApp();
      }
    },
    payments {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractPayments();
      }
    },
    inventory {
      @Override
      public Object extractValue(WebHook instance) {
        return instance.extractInventory();
      }
    },
    ;

    public abstract Object extractValue(WebHook instance);
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
  public WebHook() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public WebHook(String json) throws java.lang.IllegalArgumentException {
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
  public WebHook(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public WebHook(WebHook src) {
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
    java.lang.String url = getUrl();
    if (url != null && url.length() > 1023) { throw new IllegalArgumentException("Maximum string length exceeded for 'url'");}

    java.lang.String secret = getSecret();
    if (secret != null && secret.length() > 36) { throw new IllegalArgumentException("Maximum string length exceeded for 'secret'");}

    java.lang.String verification = getVerification();
    if (verification != null && verification.length() > 36) { throw new IllegalArgumentException("Maximum string length exceeded for 'verification'");}
  }



  private java.lang.String extractUrl() {
    return getJSONObject().isNull("url") ? null :
      getJSONObject().optString("url");
  }


  private java.lang.String extractSecret() {
    return getJSONObject().isNull("secret") ? null :
      getJSONObject().optString("secret");
  }


  private java.lang.Boolean extractValid() {
    return getJSONObject().isNull("valid") ? null :
      getJSONObject().optBoolean("valid");
  }


  private java.lang.String extractVerification() {
    return getJSONObject().isNull("verification") ? null :
      getJSONObject().optString("verification");
  }


  private java.lang.Boolean extractOrders() {
    return getJSONObject().isNull("orders") ? null :
      getJSONObject().optBoolean("orders");
  }


  private java.lang.Boolean extractApp() {
    return getJSONObject().isNull("app") ? null :
      getJSONObject().optBoolean("app");
  }


  private java.lang.Boolean extractPayments() {
    return getJSONObject().isNull("payments") ? null :
      getJSONObject().optBoolean("payments");
  }


  private java.lang.Boolean extractInventory() {
    return getJSONObject().isNull("inventory") ? null :
      getJSONObject().optBoolean("inventory");
  }


  /** Checks whether the 'url' field is set and is not null */
  public boolean isNotNullUrl() {
    return cacheValueIsNotNull(CacheKey.url);
  }

  /** Checks whether the 'secret' field is set and is not null */
  public boolean isNotNullSecret() {
    return cacheValueIsNotNull(CacheKey.secret);
  }

  /** Checks whether the 'valid' field is set and is not null */
  public boolean isNotNullValid() {
    return cacheValueIsNotNull(CacheKey.valid);
  }

  /** Checks whether the 'verification' field is set and is not null */
  public boolean isNotNullVerification() {
    return cacheValueIsNotNull(CacheKey.verification);
  }

  /** Checks whether the 'orders' field is set and is not null */
  public boolean isNotNullOrders() {
    return cacheValueIsNotNull(CacheKey.orders);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'payments' field is set and is not null */
  public boolean isNotNullPayments() {
    return cacheValueIsNotNull(CacheKey.payments);
  }

  /** Checks whether the 'inventory' field is set and is not null */
  public boolean isNotNullInventory() {
    return cacheValueIsNotNull(CacheKey.inventory);
  }


  /** Checks whether the 'url' field has been set, however the value could be null */
  public boolean hasUrl() {
    return cacheHasKey(CacheKey.url);
  }

  /** Checks whether the 'secret' field has been set, however the value could be null */
  public boolean hasSecret() {
    return cacheHasKey(CacheKey.secret);
  }

  /** Checks whether the 'valid' field has been set, however the value could be null */
  public boolean hasValid() {
    return cacheHasKey(CacheKey.valid);
  }

  /** Checks whether the 'verification' field has been set, however the value could be null */
  public boolean hasVerification() {
    return cacheHasKey(CacheKey.verification);
  }

  /** Checks whether the 'orders' field has been set, however the value could be null */
  public boolean hasOrders() {
    return cacheHasKey(CacheKey.orders);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'payments' field has been set, however the value could be null */
  public boolean hasPayments() {
    return cacheHasKey(CacheKey.payments);
  }

  /** Checks whether the 'inventory' field has been set, however the value could be null */
  public boolean hasInventory() {
    return cacheHasKey(CacheKey.inventory);
  }


  /**
   * Sets the field 'url'.
   */
  public WebHook setUrl(java.lang.String url) {
    logChange("url");

    try {
      getJSONObject().put("url", url == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(url));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.url);
    return this;
  }

  /**
   * Sets the field 'secret'.
   */
  public WebHook setSecret(java.lang.String secret) {
    logChange("secret");

    try {
      getJSONObject().put("secret", secret == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(secret));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.secret);
    return this;
  }

  /**
   * Sets the field 'valid'.
   */
  public WebHook setValid(java.lang.Boolean valid) {
    logChange("valid");

    try {
      getJSONObject().put("valid", valid == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(valid));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.valid);
    return this;
  }

  /**
   * Sets the field 'verification'.
   */
  public WebHook setVerification(java.lang.String verification) {
    logChange("verification");

    try {
      getJSONObject().put("verification", verification == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(verification));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.verification);
    return this;
  }

  /**
   * Sets the field 'orders'.
   */
  public WebHook setOrders(java.lang.Boolean orders) {
    logChange("orders");

    try {
      getJSONObject().put("orders", orders == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(orders));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.orders);
    return this;
  }

  /**
   * Sets the field 'app'.
   */
  public WebHook setApp(java.lang.Boolean app) {
    logChange("app");

    try {
      getJSONObject().put("app", app == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(app));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.app);
    return this;
  }

  /**
   * Sets the field 'payments'.
   */
  public WebHook setPayments(java.lang.Boolean payments) {
    logChange("payments");

    try {
      getJSONObject().put("payments", payments == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(payments));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.payments);
    return this;
  }

  /**
   * Sets the field 'inventory'.
   */
  public WebHook setInventory(java.lang.Boolean inventory) {
    logChange("inventory");

    try {
      getJSONObject().put("inventory", inventory == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(inventory));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.inventory);
    return this;
  }


  /** Clears the 'url' field, the 'has' method for this field will now return false */
  public void clearUrl() {
    unlogChange("url");
    getJSONObject().remove("url");
    cacheRemoveValue(CacheKey.url);
  }

  /** Clears the 'secret' field, the 'has' method for this field will now return false */
  public void clearSecret() {
    unlogChange("secret");
    getJSONObject().remove("secret");
    cacheRemoveValue(CacheKey.secret);
  }

  /** Clears the 'valid' field, the 'has' method for this field will now return false */
  public void clearValid() {
    unlogChange("valid");
    getJSONObject().remove("valid");
    cacheRemoveValue(CacheKey.valid);
  }

  /** Clears the 'verification' field, the 'has' method for this field will now return false */
  public void clearVerification() {
    unlogChange("verification");
    getJSONObject().remove("verification");
    cacheRemoveValue(CacheKey.verification);
  }

  /** Clears the 'orders' field, the 'has' method for this field will now return false */
  public void clearOrders() {
    unlogChange("orders");
    getJSONObject().remove("orders");
    cacheRemoveValue(CacheKey.orders);
  }

  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    unlogChange("app");
    getJSONObject().remove("app");
    cacheRemoveValue(CacheKey.app);
  }

  /** Clears the 'payments' field, the 'has' method for this field will now return false */
  public void clearPayments() {
    unlogChange("payments");
    getJSONObject().remove("payments");
    cacheRemoveValue(CacheKey.payments);
  }

  /** Clears the 'inventory' field, the 'has' method for this field will now return false */
  public void clearInventory() {
    unlogChange("inventory");
    getJSONObject().remove("inventory");
    cacheRemoveValue(CacheKey.inventory);
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
  public WebHook copyChanges() {
    WebHook copy = new WebHook();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(WebHook src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new WebHook(src).getJSONObject();
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

    return "WebHook{" +
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

  public static final android.os.Parcelable.Creator<WebHook> CREATOR = new android.os.Parcelable.Creator<WebHook>() {
    @Override
    public WebHook createFromParcel(android.os.Parcel in) {
      WebHook instance = new WebHook(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public WebHook[] newArray(int size) {
      return new WebHook[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<WebHook> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<WebHook>() {
    @Override
    public WebHook create(org.json.JSONObject jsonObject) {
      return new WebHook(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean URL_IS_REQUIRED = false;
    public static final long URL_MAX_LEN = 1023;

    public static final boolean SECRET_IS_REQUIRED = false;
    public static final long SECRET_MAX_LEN = 36;

    public static final boolean VALID_IS_REQUIRED = false;

    public static final boolean VERIFICATION_IS_REQUIRED = false;
    public static final long VERIFICATION_MAX_LEN = 36;

    public static final boolean ORDERS_IS_REQUIRED = false;

    public static final boolean APP_IS_REQUIRED = false;

    public static final boolean PAYMENTS_IS_REQUIRED = false;

    public static final boolean INVENTORY_IS_REQUIRED = false;

  }

}
