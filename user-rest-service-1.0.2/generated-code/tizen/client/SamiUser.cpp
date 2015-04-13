
#include "SamiUser.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiUser::SamiUser() {
    init();
}

SamiUser::~SamiUser() {
    this->cleanup();
}

void
SamiUser::init() {
    pId = null;
    pName = null;
    pFirstName = null;
    pState = null;
    pPhoto = null;
    pCategories = null;
    pLocations = null;
    pPrimitives = null;
    pMath = null;
    pDate = null;
    pCreateTimestamp = null;
    pModifyTimestamp = null;
    
}

void
SamiUser::cleanup() {
    if(pId != null) {
        
        delete pId;
        pId = null;
    }
    if(pName != null) {
        
        delete pName;
        pName = null;
    }
    if(pFirstName != null) {
        
        delete pFirstName;
        pFirstName = null;
    }
    if(pState != null) {
        
        delete pState;
        pState = null;
    }
    if(pPhoto != null) {
        pPhoto->RemoveAll(true);
        delete pPhoto;
        pPhoto = null;
    }
    if(pCategories != null) {
        pCategories->RemoveAll(true);
        delete pCategories;
        pCategories = null;
    }
    if(pLocations != null) {
        pLocations->RemoveAll(true);
        delete pLocations;
        pLocations = null;
    }
    if(pPrimitives != null) {
        
        delete pPrimitives;
        pPrimitives = null;
    }
    if(pMath != null) {
        
        delete pMath;
        pMath = null;
    }
    if(pDate != null) {
        
        delete pDate;
        pDate = null;
    }
    if(pCreateTimestamp != null) {
        
        delete pCreateTimestamp;
        pCreateTimestamp = null;
    }
    if(pModifyTimestamp != null) {
        
        delete pModifyTimestamp;
        pModifyTimestamp = null;
    }
    
}


SamiUser*
SamiUser::fromJson(String* json) {
    this->cleanup();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
    return this;
}


void
SamiUser::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pIdKey = new JsonString(L"id");
        IJsonValue* pIdVal = null;
        pJsonObject->GetValue(pIdKey, pIdVal);
        if(pIdVal != null) {
            
            pId = new Long();
            jsonToValue(pId, pIdVal, L"Long", L"Long");
        }
        delete pIdKey;
        JsonString* pNameKey = new JsonString(L"name");
        IJsonValue* pNameVal = null;
        pJsonObject->GetValue(pNameKey, pNameVal);
        if(pNameVal != null) {
            
            pName = new String();
            jsonToValue(pName, pNameVal, L"String", L"String");
        }
        delete pNameKey;
        JsonString* pFirstNameKey = new JsonString(L"firstName");
        IJsonValue* pFirstNameVal = null;
        pJsonObject->GetValue(pFirstNameKey, pFirstNameVal);
        if(pFirstNameVal != null) {
            
            pFirstName = new String();
            jsonToValue(pFirstName, pFirstNameVal, L"String", L"String");
        }
        delete pFirstNameKey;
        JsonString* pStateKey = new JsonString(L"state");
        IJsonValue* pStateVal = null;
        pJsonObject->GetValue(pStateKey, pStateVal);
        if(pStateVal != null) {
            
            pState = new String();
            jsonToValue(pState, pStateVal, L"String", L"String");
        }
        delete pStateKey;
        JsonString* pPhotoKey = new JsonString(L"photo");
        IJsonValue* pPhotoVal = null;
        pJsonObject->GetValue(pPhotoKey, pPhotoVal);
        if(pPhotoVal != null) {
            pPhoto = new ArrayList();
            
            jsonToValue(pPhoto, pPhotoVal, L"IList", L"String");
        }
        delete pPhotoKey;
        JsonString* pCategoriesKey = new JsonString(L"categories");
        IJsonValue* pCategoriesVal = null;
        pJsonObject->GetValue(pCategoriesKey, pCategoriesVal);
        if(pCategoriesVal != null) {
            pCategories = new ArrayList();
            
            jsonToValue(pCategories, pCategoriesVal, L"IList", L"SamiCategory");
        }
        delete pCategoriesKey;
        JsonString* pLocationsKey = new JsonString(L"locations");
        IJsonValue* pLocationsVal = null;
        pJsonObject->GetValue(pLocationsKey, pLocationsVal);
        if(pLocationsVal != null) {
            pLocations = new ArrayList();
            
            jsonToValue(pLocations, pLocationsVal, L"IList", L"SamiLocation");
        }
        delete pLocationsKey;
        JsonString* pPrimitivesKey = new JsonString(L"primitives");
        IJsonValue* pPrimitivesVal = null;
        pJsonObject->GetValue(pPrimitivesKey, pPrimitivesVal);
        if(pPrimitivesVal != null) {
            
            pPrimitives = new SamiShowcaseDatatypePrimitives();
            jsonToValue(pPrimitives, pPrimitivesVal, L"SamiShowcaseDatatypePrimitives", L"SamiShowcaseDatatypePrimitives");
        }
        delete pPrimitivesKey;
        JsonString* pMathKey = new JsonString(L"math");
        IJsonValue* pMathVal = null;
        pJsonObject->GetValue(pMathKey, pMathVal);
        if(pMathVal != null) {
            
            pMath = new SamiShowcaseDatatypeMath();
            jsonToValue(pMath, pMathVal, L"SamiShowcaseDatatypeMath", L"SamiShowcaseDatatypeMath");
        }
        delete pMathKey;
        JsonString* pDateKey = new JsonString(L"date");
        IJsonValue* pDateVal = null;
        pJsonObject->GetValue(pDateKey, pDateVal);
        if(pDateVal != null) {
            
            pDate = new SamiShowcaseDatatypeDate();
            jsonToValue(pDate, pDateVal, L"SamiShowcaseDatatypeDate", L"SamiShowcaseDatatypeDate");
        }
        delete pDateKey;
        JsonString* pCreateTimestampKey = new JsonString(L"createTimestamp");
        IJsonValue* pCreateTimestampVal = null;
        pJsonObject->GetValue(pCreateTimestampKey, pCreateTimestampVal);
        if(pCreateTimestampVal != null) {
            
            pCreateTimestamp = new DateTime();
            jsonToValue(pCreateTimestamp, pCreateTimestampVal, L"DateTime", L"DateTime");
        }
        delete pCreateTimestampKey;
        JsonString* pModifyTimestampKey = new JsonString(L"modifyTimestamp");
        IJsonValue* pModifyTimestampVal = null;
        pJsonObject->GetValue(pModifyTimestampKey, pModifyTimestampVal);
        if(pModifyTimestampVal != null) {
            
            pModifyTimestamp = new DateTime();
            jsonToValue(pModifyTimestamp, pModifyTimestampVal, L"DateTime", L"DateTime");
        }
        delete pModifyTimestampKey;
        
    }
}

SamiUser::SamiUser(String* json) {
    init();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
}

String
SamiUser::asJson ()
{
    JsonObject* pJsonObject = asJsonObject();

    char *pComposeBuf = new char[256];
    JsonWriter::Compose(pJsonObject, pComposeBuf, 256);
    String s = String(pComposeBuf);

    delete pComposeBuf;
    pJsonObject->RemoveAll(true);
    delete pJsonObject;

    return s;
}

JsonObject*
SamiUser::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    
    JsonString *pIdKey = new JsonString(L"id");
    pJsonObject->Add(pIdKey, toJson(getPId(), "Long", ""));

    
    JsonString *pNameKey = new JsonString(L"name");
    pJsonObject->Add(pNameKey, toJson(getPName(), "String", ""));

    
    JsonString *pFirstNameKey = new JsonString(L"firstName");
    pJsonObject->Add(pFirstNameKey, toJson(getPFirstName(), "String", ""));

    
    JsonString *pStateKey = new JsonString(L"state");
    pJsonObject->Add(pStateKey, toJson(getPState(), "String", ""));

    
    JsonString *pPhotoKey = new JsonString(L"photo");
    pJsonObject->Add(pPhotoKey, toJson(getPPhoto(), "String", "array"));

    
    JsonString *pCategoriesKey = new JsonString(L"categories");
    pJsonObject->Add(pCategoriesKey, toJson(getPCategories(), "SamiCategory", "array"));

    
    JsonString *pLocationsKey = new JsonString(L"locations");
    pJsonObject->Add(pLocationsKey, toJson(getPLocations(), "SamiLocation", "array"));

    
    JsonString *pPrimitivesKey = new JsonString(L"primitives");
    pJsonObject->Add(pPrimitivesKey, toJson(getPPrimitives(), "SamiShowcaseDatatypePrimitives", ""));

    
    JsonString *pMathKey = new JsonString(L"math");
    pJsonObject->Add(pMathKey, toJson(getPMath(), "SamiShowcaseDatatypeMath", ""));

    
    JsonString *pDateKey = new JsonString(L"date");
    pJsonObject->Add(pDateKey, toJson(getPDate(), "SamiShowcaseDatatypeDate", ""));

    
    JsonString *pCreateTimestampKey = new JsonString(L"createTimestamp");
    pJsonObject->Add(pCreateTimestampKey, toJson(getPCreateTimestamp(), "DateTime", ""));

    
    JsonString *pModifyTimestampKey = new JsonString(L"modifyTimestamp");
    pJsonObject->Add(pModifyTimestampKey, toJson(getPModifyTimestamp(), "DateTime", ""));

    
    return pJsonObject;
}


Long*
SamiUser::getPId() {
    return pId;
}
void
SamiUser::setPId(Long* pId) {
    this->pId = pId;
}


String*
SamiUser::getPName() {
    return pName;
}
void
SamiUser::setPName(String* pName) {
    this->pName = pName;
}


String*
SamiUser::getPFirstName() {
    return pFirstName;
}
void
SamiUser::setPFirstName(String* pFirstName) {
    this->pFirstName = pFirstName;
}


String*
SamiUser::getPState() {
    return pState;
}
void
SamiUser::setPState(String* pState) {
    this->pState = pState;
}


IList*
SamiUser::getPPhoto() {
    return pPhoto;
}
void
SamiUser::setPPhoto(IList* pPhoto) {
    this->pPhoto = pPhoto;
}


IList*
SamiUser::getPCategories() {
    return pCategories;
}
void
SamiUser::setPCategories(IList* pCategories) {
    this->pCategories = pCategories;
}


IList*
SamiUser::getPLocations() {
    return pLocations;
}
void
SamiUser::setPLocations(IList* pLocations) {
    this->pLocations = pLocations;
}


SamiShowcaseDatatypePrimitives*
SamiUser::getPPrimitives() {
    return pPrimitives;
}
void
SamiUser::setPPrimitives(SamiShowcaseDatatypePrimitives* pPrimitives) {
    this->pPrimitives = pPrimitives;
}


SamiShowcaseDatatypeMath*
SamiUser::getPMath() {
    return pMath;
}
void
SamiUser::setPMath(SamiShowcaseDatatypeMath* pMath) {
    this->pMath = pMath;
}


SamiShowcaseDatatypeDate*
SamiUser::getPDate() {
    return pDate;
}
void
SamiUser::setPDate(SamiShowcaseDatatypeDate* pDate) {
    this->pDate = pDate;
}


DateTime*
SamiUser::getPCreateTimestamp() {
    return pCreateTimestamp;
}
void
SamiUser::setPCreateTimestamp(DateTime* pCreateTimestamp) {
    this->pCreateTimestamp = pCreateTimestamp;
}


DateTime*
SamiUser::getPModifyTimestamp() {
    return pModifyTimestamp;
}
void
SamiUser::setPModifyTimestamp(DateTime* pModifyTimestamp) {
    this->pModifyTimestamp = pModifyTimestamp;
}




} /* namespace Swagger */



