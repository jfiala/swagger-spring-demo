#ifndef SamiUsercompletepostcompleteApi_H_
#define SamiUsercompletepostcompleteApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"


using namespace Tizen::Net::Http;

namespace Swagger {


class SamiUsercompletepostcompleteApi {
public:
  SamiUsercompletepostcompleteApi();
  virtual ~SamiUsercompletepostcompleteApi();

  
  SamiUser* 
  saveUserCompleteWithCompletion(SamiUser* body, void (* handler)(SamiUser*, SamiError*));
  
  static String getBasePath() {
    return L"http://localhost/";
  }

private:
  SamiApiClient* client;
};



} /* namespace Swagger */

#endif /* SamiUsercompletepostcompleteApi_H_ */
