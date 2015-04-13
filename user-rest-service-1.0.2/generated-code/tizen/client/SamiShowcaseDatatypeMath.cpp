
#include "SamiShowcaseDatatypeMath.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiShowcaseDatatypeMath::SamiShowcaseDatatypeMath() {
    init();
}

SamiShowcaseDatatypeMath::~SamiShowcaseDatatypeMath() {
    this->cleanup();
}

void
SamiShowcaseDatatypeMath::init() {
    pBigInteger = null;
    pBigDecimal = null;
    
}

void
SamiShowcaseDatatypeMath::cleanup() {
    if(pBigInteger != null) {
        
        delete pBigInteger;
        pBigInteger = null;
    }
    if(pBigDecimal != null) {
        
        delete pBigDecimal;
        pBigDecimal = null;
    }
    
}


SamiShowcaseDatatypeMath*
SamiShowcaseDatatypeMath::fromJson(String* json) {
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
SamiShowcaseDatatypeMath::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pBigIntegerKey = new JsonString(L"bigInteger");
        IJsonValue* pBigIntegerVal = null;
        pJsonObject->GetValue(pBigIntegerKey, pBigIntegerVal);
        if(pBigIntegerVal != null) {
            
            pBigInteger = new Long();
            jsonToValue(pBigInteger, pBigIntegerVal, L"Long", L"Long");
        }
        delete pBigIntegerKey;
        JsonString* pBigDecimalKey = new JsonString(L"bigDecimal");
        IJsonValue* pBigDecimalVal = null;
        pJsonObject->GetValue(pBigDecimalKey, pBigDecimalVal);
        if(pBigDecimalVal != null) {
            
            pBigDecimal = new Double();
            jsonToValue(pBigDecimal, pBigDecimalVal, L"Double", L"Double");
        }
        delete pBigDecimalKey;
        
    }
}

SamiShowcaseDatatypeMath::SamiShowcaseDatatypeMath(String* json) {
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
SamiShowcaseDatatypeMath::asJson ()
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
SamiShowcaseDatatypeMath::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    
    JsonString *pBigIntegerKey = new JsonString(L"bigInteger");
    pJsonObject->Add(pBigIntegerKey, toJson(getPBigInteger(), "Long", ""));

    
    JsonString *pBigDecimalKey = new JsonString(L"bigDecimal");
    pJsonObject->Add(pBigDecimalKey, toJson(getPBigDecimal(), "Double", ""));

    
    return pJsonObject;
}


Long*
SamiShowcaseDatatypeMath::getPBigInteger() {
    return pBigInteger;
}
void
SamiShowcaseDatatypeMath::setPBigInteger(Long* pBigInteger) {
    this->pBigInteger = pBigInteger;
}


Double*
SamiShowcaseDatatypeMath::getPBigDecimal() {
    return pBigDecimal;
}
void
SamiShowcaseDatatypeMath::setPBigDecimal(Double* pBigDecimal) {
    this->pBigDecimal = pBigDecimal;
}




} /* namespace Swagger */



