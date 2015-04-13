
#include "SamiShowcaseDatatypeDate.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiShowcaseDatatypeDate::SamiShowcaseDatatypeDate() {
    init();
}

SamiShowcaseDatatypeDate::~SamiShowcaseDatatypeDate() {
    this->cleanup();
}

void
SamiShowcaseDatatypeDate::init() {
    pDate = null;
    
}

void
SamiShowcaseDatatypeDate::cleanup() {
    if(pDate != null) {
        
        delete pDate;
        pDate = null;
    }
    
}


SamiShowcaseDatatypeDate*
SamiShowcaseDatatypeDate::fromJson(String* json) {
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
SamiShowcaseDatatypeDate::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pDateKey = new JsonString(L"date");
        IJsonValue* pDateVal = null;
        pJsonObject->GetValue(pDateKey, pDateVal);
        if(pDateVal != null) {
            
            pDate = new DateTime();
            jsonToValue(pDate, pDateVal, L"DateTime", L"DateTime");
        }
        delete pDateKey;
        
    }
}

SamiShowcaseDatatypeDate::SamiShowcaseDatatypeDate(String* json) {
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
SamiShowcaseDatatypeDate::asJson ()
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
SamiShowcaseDatatypeDate::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    
    JsonString *pDateKey = new JsonString(L"date");
    pJsonObject->Add(pDateKey, toJson(getPDate(), "DateTime", ""));

    
    return pJsonObject;
}


DateTime*
SamiShowcaseDatatypeDate::getPDate() {
    return pDate;
}
void
SamiShowcaseDatatypeDate::setPDate(DateTime* pDate) {
    this->pDate = pDate;
}




} /* namespace Swagger */



