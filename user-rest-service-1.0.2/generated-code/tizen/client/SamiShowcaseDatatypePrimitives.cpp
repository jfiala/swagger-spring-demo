
#include "SamiShowcaseDatatypePrimitives.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiShowcaseDatatypePrimitives::SamiShowcaseDatatypePrimitives() {
    init();
}

SamiShowcaseDatatypePrimitives::~SamiShowcaseDatatypePrimitives() {
    this->cleanup();
}

void
SamiShowcaseDatatypePrimitives::init() {
    pSingleByte = null;
    pTinyNumber = null;
    pCounter = null;
    pId = null;
    pBudgetFloat = null;
    pBudget = null;
    pDeleted = null;
    pSingleCharacter = null;
    
}

void
SamiShowcaseDatatypePrimitives::cleanup() {
    if(pSingleByte != null) {
        
        delete pSingleByte;
        pSingleByte = null;
    }
    if(pTinyNumber != null) {
        
        delete pTinyNumber;
        pTinyNumber = null;
    }
    if(pCounter != null) {
        
        delete pCounter;
        pCounter = null;
    }
    if(pId != null) {
        
        delete pId;
        pId = null;
    }
    if(pBudgetFloat != null) {
        
        delete pBudgetFloat;
        pBudgetFloat = null;
    }
    if(pBudget != null) {
        
        delete pBudget;
        pBudget = null;
    }
    if(pDeleted != null) {
        
        delete pDeleted;
        pDeleted = null;
    }
    if(pSingleCharacter != null) {
        
        delete pSingleCharacter;
        pSingleCharacter = null;
    }
    
}


SamiShowcaseDatatypePrimitives*
SamiShowcaseDatatypePrimitives::fromJson(String* json) {
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
SamiShowcaseDatatypePrimitives::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pSingleByteKey = new JsonString(L"singleByte");
        IJsonValue* pSingleByteVal = null;
        pJsonObject->GetValue(pSingleByteKey, pSingleByteVal);
        if(pSingleByteVal != null) {
            
            pSingleByte = new String();
            jsonToValue(pSingleByte, pSingleByteVal, L"String", L"String");
        }
        delete pSingleByteKey;
        JsonString* pTinyNumberKey = new JsonString(L"tinyNumber");
        IJsonValue* pTinyNumberVal = null;
        pJsonObject->GetValue(pTinyNumberKey, pTinyNumberVal);
        if(pTinyNumberVal != null) {
            
            pTinyNumber = new Integer();
            jsonToValue(pTinyNumber, pTinyNumberVal, L"Integer", L"Integer");
        }
        delete pTinyNumberKey;
        JsonString* pCounterKey = new JsonString(L"counter");
        IJsonValue* pCounterVal = null;
        pJsonObject->GetValue(pCounterKey, pCounterVal);
        if(pCounterVal != null) {
            
            pCounter = new Integer();
            jsonToValue(pCounter, pCounterVal, L"Integer", L"Integer");
        }
        delete pCounterKey;
        JsonString* pIdKey = new JsonString(L"id");
        IJsonValue* pIdVal = null;
        pJsonObject->GetValue(pIdKey, pIdVal);
        if(pIdVal != null) {
            
            pId = new Long();
            jsonToValue(pId, pIdVal, L"Long", L"Long");
        }
        delete pIdKey;
        JsonString* pBudgetFloatKey = new JsonString(L"budgetFloat");
        IJsonValue* pBudgetFloatVal = null;
        pJsonObject->GetValue(pBudgetFloatKey, pBudgetFloatVal);
        if(pBudgetFloatVal != null) {
            
            pBudgetFloat = new Long();
            jsonToValue(pBudgetFloat, pBudgetFloatVal, L"Long", L"Long");
        }
        delete pBudgetFloatKey;
        JsonString* pBudgetKey = new JsonString(L"budget");
        IJsonValue* pBudgetVal = null;
        pJsonObject->GetValue(pBudgetKey, pBudgetVal);
        if(pBudgetVal != null) {
            
            pBudget = new Double();
            jsonToValue(pBudget, pBudgetVal, L"Double", L"Double");
        }
        delete pBudgetKey;
        JsonString* pDeletedKey = new JsonString(L"deleted");
        IJsonValue* pDeletedVal = null;
        pJsonObject->GetValue(pDeletedKey, pDeletedVal);
        if(pDeletedVal != null) {
            
            pDeleted = new Boolean(false);
            jsonToValue(pDeleted, pDeletedVal, L"Boolean", L"Boolean");
        }
        delete pDeletedKey;
        JsonString* pSingleCharacterKey = new JsonString(L"singleCharacter");
        IJsonValue* pSingleCharacterVal = null;
        pJsonObject->GetValue(pSingleCharacterKey, pSingleCharacterVal);
        if(pSingleCharacterVal != null) {
            
            pSingleCharacter = new String();
            jsonToValue(pSingleCharacter, pSingleCharacterVal, L"String", L"String");
        }
        delete pSingleCharacterKey;
        
    }
}

SamiShowcaseDatatypePrimitives::SamiShowcaseDatatypePrimitives(String* json) {
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
SamiShowcaseDatatypePrimitives::asJson ()
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
SamiShowcaseDatatypePrimitives::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    
    JsonString *pSingleByteKey = new JsonString(L"singleByte");
    pJsonObject->Add(pSingleByteKey, toJson(getPSingleByte(), "String", ""));

    
    JsonString *pTinyNumberKey = new JsonString(L"tinyNumber");
    pJsonObject->Add(pTinyNumberKey, toJson(getPTinyNumber(), "Integer", ""));

    
    JsonString *pCounterKey = new JsonString(L"counter");
    pJsonObject->Add(pCounterKey, toJson(getPCounter(), "Integer", ""));

    
    JsonString *pIdKey = new JsonString(L"id");
    pJsonObject->Add(pIdKey, toJson(getPId(), "Long", ""));

    
    JsonString *pBudgetFloatKey = new JsonString(L"budgetFloat");
    pJsonObject->Add(pBudgetFloatKey, toJson(getPBudgetFloat(), "Long", ""));

    
    JsonString *pBudgetKey = new JsonString(L"budget");
    pJsonObject->Add(pBudgetKey, toJson(getPBudget(), "Double", ""));

    
    JsonString *pDeletedKey = new JsonString(L"deleted");
    pJsonObject->Add(pDeletedKey, toJson(getPDeleted(), "Boolean", ""));

    
    JsonString *pSingleCharacterKey = new JsonString(L"singleCharacter");
    pJsonObject->Add(pSingleCharacterKey, toJson(getPSingleCharacter(), "String", ""));

    
    return pJsonObject;
}


String*
SamiShowcaseDatatypePrimitives::getPSingleByte() {
    return pSingleByte;
}
void
SamiShowcaseDatatypePrimitives::setPSingleByte(String* pSingleByte) {
    this->pSingleByte = pSingleByte;
}


Integer*
SamiShowcaseDatatypePrimitives::getPTinyNumber() {
    return pTinyNumber;
}
void
SamiShowcaseDatatypePrimitives::setPTinyNumber(Integer* pTinyNumber) {
    this->pTinyNumber = pTinyNumber;
}


Integer*
SamiShowcaseDatatypePrimitives::getPCounter() {
    return pCounter;
}
void
SamiShowcaseDatatypePrimitives::setPCounter(Integer* pCounter) {
    this->pCounter = pCounter;
}


Long*
SamiShowcaseDatatypePrimitives::getPId() {
    return pId;
}
void
SamiShowcaseDatatypePrimitives::setPId(Long* pId) {
    this->pId = pId;
}


Long*
SamiShowcaseDatatypePrimitives::getPBudgetFloat() {
    return pBudgetFloat;
}
void
SamiShowcaseDatatypePrimitives::setPBudgetFloat(Long* pBudgetFloat) {
    this->pBudgetFloat = pBudgetFloat;
}


Double*
SamiShowcaseDatatypePrimitives::getPBudget() {
    return pBudget;
}
void
SamiShowcaseDatatypePrimitives::setPBudget(Double* pBudget) {
    this->pBudget = pBudget;
}


Boolean*
SamiShowcaseDatatypePrimitives::getPDeleted() {
    return pDeleted;
}
void
SamiShowcaseDatatypePrimitives::setPDeleted(Boolean* pDeleted) {
    this->pDeleted = pDeleted;
}


String*
SamiShowcaseDatatypePrimitives::getPSingleCharacter() {
    return pSingleCharacter;
}
void
SamiShowcaseDatatypePrimitives::setPSingleCharacter(String* pSingleCharacter) {
    this->pSingleCharacter = pSingleCharacter;
}




} /* namespace Swagger */



