#ifndef SamiUsercompletepostcompleteApi_H_
#define SamiUsercompletepostcompleteApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"
using Tizen::Base::Long;
using Tizen::Base::String;


using namespace Tizen::Net::Http;

namespace Swagger {


class SamiUsercompletepostcompleteApi {
public:
  SamiUsercompletepostcompleteApi();
  virtual ~SamiUsercompletepostcompleteApi();

  
  SamiUser* 
  saveUserCompleteWithCompletion(Long* _id, String* user, void (* handler)(SamiUser*, SamiError*));
  
  static String getBasePath() {
    return L"http://localhost/";
  }

private:
  SamiApiClient* client;
};



} /* namespace Swagger */

#endif /* SamiUsercompletepostcompleteApi_H_ */
