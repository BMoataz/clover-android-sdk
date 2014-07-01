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

package com.clover.sdk.v3.inventory;

@SuppressWarnings("all")
public final class ModifierGroup implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractId();
      }
    },
    name {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractName();
      }
    },
    alternateName {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractAlternateName();
      }
    },
    minRequired {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractMinRequired();
      }
    },
    maxAllowed {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractMaxAllowed();
      }
    },
    showByDefault {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractShowByDefault();
      }
    },
    modifiers {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractModifiers();
      }
    },
    modifierIds {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractModifierIds();
      }
    },
    items {
      @Override
      public Object extractValue(ModifierGroup instance) {
        return instance.extractItems();
      }
    },
    ;

    public abstract Object extractValue(ModifierGroup instance);
  }

  private String jsonString = null;
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
  public ModifierGroup() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ModifierGroup(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public ModifierGroup(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ModifierGroup(ModifierGroup src) {
    if (src.jsonString != null) {
      this.jsonString = src.jsonString;
    } else {
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
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = new org.json.JSONObject(jsonString);
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) throw new IllegalArgumentException("Maximum string length exceeded for 'id'");

    java.lang.String name = getName();
    if (name == null) throw new java.lang.IllegalArgumentException("'name' is required to be non-null");
    if (name != null && name.length() > 255) throw new IllegalArgumentException("Maximum string length exceeded for 'name'");

    java.lang.String alternateName = getAlternateName();
    if (alternateName != null && alternateName.length() > 255) throw new IllegalArgumentException("Maximum string length exceeded for 'alternateName'");

    java.lang.Integer minRequired = getMinRequired();
    if (minRequired != null && minRequired < 0) throw new IllegalArgumentException("Invalid value for 'minRequired'");

    java.lang.Integer maxAllowed = getMaxAllowed();
    if (maxAllowed != null && maxAllowed < 0) throw new IllegalArgumentException("Invalid value for 'maxAllowed'");
  }


  /**
   */
  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }

  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }

  /**
   * Name of the modifier group
   */
  public java.lang.String getName() {
    return cacheGet(CacheKey.name);
  }

  private java.lang.String extractName() {
    return getJSONObject().isNull("name") ? null :
      getJSONObject().optString("name");
  }

  /**
   */
  public java.lang.String getAlternateName() {
    return cacheGet(CacheKey.alternateName);
  }

  private java.lang.String extractAlternateName() {
    return getJSONObject().isNull("alternateName") ? null :
      getJSONObject().optString("alternateName");
  }

  /**
   */
  public java.lang.Integer getMinRequired() {
    return cacheGet(CacheKey.minRequired);
  }

  private java.lang.Integer extractMinRequired() {
    return getJSONObject().isNull("minRequired") ? null :
      getJSONObject().optInt("minRequired");
  }

  /**
   */
  public java.lang.Integer getMaxAllowed() {
    return cacheGet(CacheKey.maxAllowed);
  }

  private java.lang.Integer extractMaxAllowed() {
    return getJSONObject().isNull("maxAllowed") ? null :
      getJSONObject().optInt("maxAllowed");
  }

  /**
   */
  public java.lang.Boolean getShowByDefault() {
    return cacheGet(CacheKey.showByDefault);
  }

  private java.lang.Boolean extractShowByDefault() {
    return getJSONObject().isNull("showByDefault") ? null :
      getJSONObject().optBoolean("showByDefault");
  }

  /**
   *
   * The returned List is unmodifiable and will never contain any nulls, even if the source JSON had null entries.
   */
  public java.util.List<com.clover.sdk.v3.inventory.Modifier> getModifiers() {
    return cacheGet(CacheKey.modifiers);
  }

  private java.util.List<com.clover.sdk.v3.inventory.Modifier> extractModifiers() {
    if (getJSONObject().isNull("modifiers")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("modifiers");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<com.clover.sdk.v3.inventory.Modifier> itemList =
        new java.util.ArrayList<com.clover.sdk.v3.inventory.Modifier>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      org.json.JSONObject obj = itemArray.optJSONObject(i);
      if (obj == null) {
        continue;
      }
      com.clover.sdk.v3.inventory.Modifier item = new com.clover.sdk.v3.inventory.Modifier(obj);
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }

  /**
   * The ordered, comma-separated list of modifier ids in this group.
   */
  public java.lang.String getModifierIds() {
    return cacheGet(CacheKey.modifierIds);
  }

  private java.lang.String extractModifierIds() {
    return getJSONObject().isNull("modifierIds") ? null :
      getJSONObject().optString("modifierIds");
  }

  /**
   *
   * The returned List is unmodifiable and will never contain any nulls, even if the source JSON had null entries.
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getItems() {
    return cacheGet(CacheKey.items);
  }

  private java.util.List<com.clover.sdk.v3.base.Reference> extractItems() {
    if (getJSONObject().isNull("items")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("items");
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


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field is set and is not null */
  public boolean isNotNullAlternateName() {
    return cacheValueIsNotNull(CacheKey.alternateName);
  }

  /** Checks whether the 'minRequired' field is set and is not null */
  public boolean isNotNullMinRequired() {
    return cacheValueIsNotNull(CacheKey.minRequired);
  }

  /** Checks whether the 'maxAllowed' field is set and is not null */
  public boolean isNotNullMaxAllowed() {
    return cacheValueIsNotNull(CacheKey.maxAllowed);
  }

  /** Checks whether the 'showByDefault' field is set and is not null */
  public boolean isNotNullShowByDefault() {
    return cacheValueIsNotNull(CacheKey.showByDefault);
  }

  /** Checks whether the 'modifiers' field is set and is not null */
  public boolean isNotNullModifiers() {
    return cacheValueIsNotNull(CacheKey.modifiers);
  }

  /** Checks whether the 'modifiers' field is set and is not null and is not empty */
  public boolean isNotEmptyModifiers() {
    return isNotNullModifiers() && !getModifiers().isEmpty();
  }

  /** Checks whether the 'modifierIds' field is set and is not null */
  public boolean isNotNullModifierIds() {
    return cacheValueIsNotNull(CacheKey.modifierIds);
  }

  /** Checks whether the 'items' field is set and is not null */
  public boolean isNotNullItems() {
    return cacheValueIsNotNull(CacheKey.items);
  }

  /** Checks whether the 'items' field is set and is not null and is not empty */
  public boolean isNotEmptyItems() {
    return isNotNullItems() && !getItems().isEmpty();
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field has been set, however the value could be null */
  public boolean hasAlternateName() {
    return cacheHasKey(CacheKey.alternateName);
  }

  /** Checks whether the 'minRequired' field has been set, however the value could be null */
  public boolean hasMinRequired() {
    return cacheHasKey(CacheKey.minRequired);
  }

  /** Checks whether the 'maxAllowed' field has been set, however the value could be null */
  public boolean hasMaxAllowed() {
    return cacheHasKey(CacheKey.maxAllowed);
  }

  /** Checks whether the 'showByDefault' field has been set, however the value could be null */
  public boolean hasShowByDefault() {
    return cacheHasKey(CacheKey.showByDefault);
  }

  /** Checks whether the 'modifiers' field has been set, however the value could be null */
  public boolean hasModifiers() {
    return cacheHasKey(CacheKey.modifiers);
  }

  /** Checks whether the 'modifierIds' field has been set, however the value could be null */
  public boolean hasModifierIds() {
    return cacheHasKey(CacheKey.modifierIds);
  }

  /** Checks whether the 'items' field has been set, however the value could be null */
  public boolean hasItems() {
    return cacheHasKey(CacheKey.items);
  }


  /**
   * Sets the field 'id'.
   */
  public ModifierGroup setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'name'.
   */
  public ModifierGroup setName(java.lang.String name) {
    logChange("name");

    try {
      getJSONObject().put("name", name == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(name));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.name);
    return this;
  }

  /**
   * Sets the field 'alternateName'.
   */
  public ModifierGroup setAlternateName(java.lang.String alternateName) {
    logChange("alternateName");

    try {
      getJSONObject().put("alternateName", alternateName == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(alternateName));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.alternateName);
    return this;
  }

  /**
   * Sets the field 'minRequired'.
   */
  public ModifierGroup setMinRequired(java.lang.Integer minRequired) {
    logChange("minRequired");

    try {
      getJSONObject().put("minRequired", minRequired == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(minRequired));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.minRequired);
    return this;
  }

  /**
   * Sets the field 'maxAllowed'.
   */
  public ModifierGroup setMaxAllowed(java.lang.Integer maxAllowed) {
    logChange("maxAllowed");

    try {
      getJSONObject().put("maxAllowed", maxAllowed == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(maxAllowed));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.maxAllowed);
    return this;
  }

  /**
   * Sets the field 'showByDefault'.
   */
  public ModifierGroup setShowByDefault(java.lang.Boolean showByDefault) {
    logChange("showByDefault");

    try {
      getJSONObject().put("showByDefault", showByDefault == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(showByDefault));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.showByDefault);
    return this;
  }

  /**
   * Sets the field 'modifiers'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public ModifierGroup setModifiers(java.util.List<com.clover.sdk.v3.inventory.Modifier> modifiers) {
    logChange("modifiers");

    try {
      if (modifiers == null) {
        getJSONObject().put("modifiers", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.modifiers);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.inventory.Modifier obj : modifiers) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("modifiers", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.modifiers);
    return this;
  }

  /**
   * Sets the field 'modifierIds'.
   */
  public ModifierGroup setModifierIds(java.lang.String modifierIds) {
    logChange("modifierIds");

    try {
      getJSONObject().put("modifierIds", modifierIds == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(modifierIds));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.modifierIds);
    return this;
  }

  /**
   * Sets the field 'items'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public ModifierGroup setItems(java.util.List<com.clover.sdk.v3.base.Reference> items) {
    logChange("items");

    try {
      if (items == null) {
        getJSONObject().put("items", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.items);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v3.base.Reference obj : items) {
        if (obj == null) {
          continue;
        }
        array.put(obj.getJSONObject());
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("items", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.items);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    unlogChange("name");
    getJSONObject().remove("name");
    cacheRemoveValue(CacheKey.name);
  }

  /** Clears the 'alternateName' field, the 'has' method for this field will now return false */
  public void clearAlternateName() {
    unlogChange("alternateName");
    getJSONObject().remove("alternateName");
    cacheRemoveValue(CacheKey.alternateName);
  }

  /** Clears the 'minRequired' field, the 'has' method for this field will now return false */
  public void clearMinRequired() {
    unlogChange("minRequired");
    getJSONObject().remove("minRequired");
    cacheRemoveValue(CacheKey.minRequired);
  }

  /** Clears the 'maxAllowed' field, the 'has' method for this field will now return false */
  public void clearMaxAllowed() {
    unlogChange("maxAllowed");
    getJSONObject().remove("maxAllowed");
    cacheRemoveValue(CacheKey.maxAllowed);
  }

  /** Clears the 'showByDefault' field, the 'has' method for this field will now return false */
  public void clearShowByDefault() {
    unlogChange("showByDefault");
    getJSONObject().remove("showByDefault");
    cacheRemoveValue(CacheKey.showByDefault);
  }

  /** Clears the 'modifiers' field, the 'has' method for this field will now return false */
  public void clearModifiers() {
    unlogChange("modifiers");
    getJSONObject().remove("modifiers");
    cacheRemoveValue(CacheKey.modifiers);
  }

  /** Clears the 'modifierIds' field, the 'has' method for this field will now return false */
  public void clearModifierIds() {
    unlogChange("modifierIds");
    getJSONObject().remove("modifierIds");
    cacheRemoveValue(CacheKey.modifierIds);
  }

  /** Clears the 'items' field, the 'has' method for this field will now return false */
  public void clearItems() {
    unlogChange("items");
    getJSONObject().remove("items");
    cacheRemoveValue(CacheKey.items);
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
  public ModifierGroup copyChanges() {
    ModifierGroup copy = new ModifierGroup();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ModifierGroup src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new ModifierGroup(src).getJSONObject();
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
    String json = jsonString != null ? jsonString : getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "ModifierGroup{" +
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

  public static final android.os.Parcelable.Creator<ModifierGroup> CREATOR = new android.os.Parcelable.Creator<ModifierGroup>() {
    @Override
    public ModifierGroup createFromParcel(android.os.Parcel in) {
      ModifierGroup instance = new ModifierGroup(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public ModifierGroup[] newArray(int size) {
      return new ModifierGroup[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ModifierGroup> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ModifierGroup>() {
    @Override
    public ModifierGroup create(org.json.JSONObject jsonObject) {
      return new ModifierGroup(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean ALTERNATENAME_IS_REQUIRED = false;
    public static final long ALTERNATENAME_MAX_LEN = 255;

    public static final boolean MINREQUIRED_IS_REQUIRED = false;
    public static final long MINREQUIRED_MIN = 0;

    public static final boolean MAXALLOWED_IS_REQUIRED = false;
    public static final long MAXALLOWED_MIN = 0;

    public static final boolean SHOWBYDEFAULT_IS_REQUIRED = false;

    public static final boolean MODIFIERS_IS_REQUIRED = false;

    public static final boolean MODIFIERIDS_IS_REQUIRED = false;

    public static final boolean ITEMS_IS_REQUIRED = false;

  }

}
