#include "SamiUserwithresponseentityApi.h"

#include "SamiHelpers.h"
#include "SamiError.h"

using namespace Tizen::Base;

namespace Swagger {



SamiUserwithresponseentityApi::SamiUserwithresponseentityApi() {

}

SamiUserwithresponseentityApi::~SamiUserwithresponseentityApi() {

}


void
getUserResponseEntityProcessor(HttpResponse* pHttpResponse, void (* handler)(void*, SamiError*)) {
  int code = pHttpResponse->GetHttpStatusCode();

  if(code >= 200 && code < 300) {
    ByteBuffer* pBuffer = pHttpResponse->ReadBodyN();
    IJsonValue* pJson = JsonParser::ParseN(*pBuffer);

    SamiObject* out = null;
    jsonToValue(out, pJson, L"SamiObject*", L"SamiObject");

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

SamiObject* 
SamiUserwithresponseentityApi::getUserResponseEntityWithCompletion(Long* _id, void (* success)(SamiObject*, SamiError*)) {
  client = new SamiApiClient();

  client->success(&getUserResponseEntityProcessor, (void(*)(void*, SamiError*))success);
  HashMap* headerParams = new HashMap(SingleObjectDeleter);
  headerParams->Construct();

  

  HashMap* queryParams = new HashMap(SingleObjectDeleter);
  queryParams->Construct();

  
    queryParams->Add(new String("id"), _id);
  
  

  String* mBody = null;

  

  String url(L"/user_with_responseentity");

  

  client->execute(SamiUserwithresponseentityApi::getBasePath(), url, "GET", (IMap*)queryParams, mBody, (IMap*)headerParams, null, L"application/json");
  return null;
}




} /* namespace Swagger */
