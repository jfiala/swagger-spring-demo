#include "SamiSearchApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {



SamiSearchApi::SamiSearchApi() {

}

SamiSearchApi::~SamiSearchApi() {

}


void
searchUsersProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    ByteBuffer* pBuffer = pHttpResponse->ReadBodyN();
    IJsonValue* pJson = JsonParser::ParseN(*pBuffer);

    IList* out = new ArrayList();
    jsonToValue(out, pJson, L"IList*", L"SamiUser");

    if (pJson) {
      if (pJson->GetType() == JSON_TYPE_OBJECT) {
         JsonObject* pObject = static_cast< JsonObject* >(pJson);
         pObject->RemoveAll(true);
      }
      else if (pJson->GetType() == JSON_TYPE_ARRAY) {
         JsonArray* pArray = static_cast< JsonArray* >(pJson);
         pArray->RemoveAll(true);
      }
      handler(out, null);
    }
    else {
      SamiError* error = new SamiError(0, new String(L"No parsable response received"));
      handler(null, error);
    }
    
  }
  else {
    SamiError* error = new SamiError(code, new String(pHttpResponse->GetStatusText()));
    handler(null, error);
    
  }
}

IList* 
SamiSearchApi::searchUsersWithCompletion(String* query, void (* success)(IList*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&searchUsersProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  

  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
    queryParams->Add(new String("query"), query);
  
  

  String* mBody = null;

  

  String url(L"/search");

  

  client->execute(SamiSearchApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}


void
saveUserProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    ByteBuffer* pBuffer = pHttpResponse->ReadBodyN();
    IJsonValue* pJson = JsonParser::ParseN(*pBuffer);

    SamiUser* out = new SamiUser();
    jsonToValue(out, pJson, L"SamiUser*", L"SamiUser");

    if (pJson) {
      if (pJson->GetType() == JSON_TYPE_OBJECT) {
         JsonObject* pObject = static_cast< JsonObject* >(pJson);
         pObject->RemoveAll(true);
      }
      else if (pJson->GetType() == JSON_TYPE_ARRAY) {
         JsonArray* pArray = static_cast< JsonArray* >(pJson);
         pArray->RemoveAll(true);
      }
      handler(out, null);
    }
    else {
      SamiError* error = new SamiError(0, new String(L"No parsable response received"));
      handler(null, error);
    }
    
  }
  else {
    SamiError* error = new SamiError(code, new String(pHttpResponse->GetStatusText()));
    handler(null, error);
    
  }
}

SamiUser* 
SamiSearchApi::saveUserWithCompletion(Long* _id, String* name, void (* success)(SamiUser*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&saveUserProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  

  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
    queryParams->Add(new String("id"), _id);
  
  
    queryParams->Add(new String("name"), name);
  
  

  String* mBody = null;

  

  String url(L"/search");

  

  client->execute(SamiSearchApi::getBasePath(), url, "POST", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}




} /* namespace Swagger */
