
#include "SamiLocation.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiLocation::SamiLocation() {
    init();
}

SamiLocation::~SamiLocation() {
    this->cleanup();
}

void
SamiLocation::init() {
    pStreet = null;
    pZip = null;
    pCity = null;
    pCountry = null;
    pLatitude = null;
    pLongitude = null;
    
}

void
SamiLocation::cleanup() {
    if(pStreet != null) {
        
        delete pStreet;
        pStreet = null;
    }
    if(pZip != null) {
        
        delete pZip;
        pZip = null;
    }
    if(pCity != null) {
        
        delete pCity;
        pCity = null;
    }
    if(pCountry != null) {
        
        delete pCountry;
        pCountry = null;
    }
    if(pLatitude != null) {
        
        delete pLatitude;
        pLatitude = null;
    }
    if(pLongitude != null) {
        
        delete pLongitude;
        pLongitude = null;
    }
    
}


SamiLocation*
SamiLocation::fromJson(String* json) {
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
SamiLocation::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pStreetKey = new JsonString(L"street");
        IJsonValue* pStreetVal = null;
        pJsonObject->GetValue(pStreetKey, pStreetVal);
        if(pStreetVal != null) {
            
            pStreet = new String();
            jsonToValue(pStreet, pStreetVal, L"String", L"String");
        }
        delete pStreetKey;
        JsonString* pZipKey = new JsonString(L"zip");
        IJsonValue* pZipVal = null;
        pJsonObject->GetValue(pZipKey, pZipVal);
        if(pZipVal != null) {
            
            pZip = new String();
            jsonToValue(pZip, pZipVal, L"String", L"String");
        }
        delete pZipKey;
        JsonString* pCityKey = new JsonString(L"city");
        IJsonValue* pCityVal = null;
        pJsonObject->GetValue(pCityKey, pCityVal);
        if(pCityVal != null) {
            
            pCity = new String();
            jsonToValue(pCity, pCityVal, L"String", L"String");
        }
        delete pCityKey;
        JsonString* pCountryKey = new JsonString(L"country");
        IJsonValue* pCountryVal = null;
        pJsonObject->GetValue(pCountryKey, pCountryVal);
        if(pCountryVal != null) {
            
            pCountry = new String();
            jsonToValue(pCountry, pCountryVal, L"String", L"String");
        }
        delete pCountryKey;
        JsonString* pLatitudeKey = new JsonString(L"latitude");
        IJsonValue* pLatitudeVal = null;
        pJsonObject->GetValue(pLatitudeKey, pLatitudeVal);
        if(pLatitudeVal != null) {
            
            pLatitude = new Double();
            jsonToValue(pLatitude, pLatitudeVal, L"Double", L"Double");
        }
        delete pLatitudeKey;
        JsonString* pLongitudeKey = new JsonString(L"longitude");
        IJsonValue* pLongitudeVal = null;
        pJsonObject->GetValue(pLongitudeKey, pLongitudeVal);
        if(pLongitudeVal != null) {
            
            pLongitude = new Double();
            jsonToValue(pLongitude, pLongitudeVal, L"Double", L"Double");
        }
        delete pLongitudeKey;
        
    }
}

SamiLocation::SamiLocation(String* json) {
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
SamiLocation::asJson ()
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
SamiLocation::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    
    JsonString *pStreetKey = new JsonString(L"street");
    pJsonObject->Add(pStreetKey, toJson(getPStreet(), "String", ""));

    
    JsonString *pZipKey = new JsonString(L"zip");
    pJsonObject->Add(pZipKey, toJson(getPZip(), "String", ""));

    
    JsonString *pCityKey = new JsonString(L"city");
    pJsonObject->Add(pCityKey, toJson(getPCity(), "String", ""));

    
    JsonString *pCountryKey = new JsonString(L"country");
    pJsonObject->Add(pCountryKey, toJson(getPCountry(), "String", ""));

    
    JsonString *pLatitudeKey = new JsonString(L"latitude");
    pJsonObject->Add(pLatitudeKey, toJson(getPLatitude(), "Double", ""));

    
    JsonString *pLongitudeKey = new JsonString(L"longitude");
    pJsonObject->Add(pLongitudeKey, toJson(getPLongitude(), "Double", ""));

    
    return pJsonObject;
}


String*
SamiLocation::getPStreet() {
    return pStreet;
}
void
SamiLocation::setPStreet(String* pStreet) {
    this->pStreet = pStreet;
}


String*
SamiLocation::getPZip() {
    return pZip;
}
void
SamiLocation::setPZip(String* pZip) {
    this->pZip = pZip;
}


String*
SamiLocation::getPCity() {
    return pCity;
}
void
SamiLocation::setPCity(String* pCity) {
    this->pCity = pCity;
}


String*
SamiLocation::getPCountry() {
    return pCountry;
}
void
SamiLocation::setPCountry(String* pCountry) {
    this->pCountry = pCountry;
}


Double*
SamiLocation::getPLatitude() {
    return pLatitude;
}
void
SamiLocation::setPLatitude(Double* pLatitude) {
    this->pLatitude = pLatitude;
}


Double*
SamiLocation::getPLongitude() {
    return pLongitude;
}
void
SamiLocation::setPLongitude(Double* pLongitude) {
    this->pLongitude = pLongitude;
}




} /* namespace Swagger */



