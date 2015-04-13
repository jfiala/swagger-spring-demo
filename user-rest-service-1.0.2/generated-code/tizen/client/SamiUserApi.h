#ifndef SamiUserApi_H_
#define SamiUserApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"
using Tizen::Base::Long;
#include "SamiVoid.h"
using Tizen::Base::String;


using namespace Tizen::Net::Http;

namespace Swagger {


class SamiUserApi {
public:
  SamiUserApi();
  virtual ~SamiUserApi();

  
  SamiUser* 
  getUserWithCompletion(Long* _id, void (* handler)(SamiUser*, SamiError*));
  
  SamiUser* 
  saveUserWithCompletion(Long* _id, String* name, void (* handler)(SamiUser*, SamiError*));
  
  static String getBasePath() {
    return L"http://localhost/";
  }

private:
  SamiApiClient* client;
};



} /* namespace Swagger */

#endif /* SamiUserApi_H_ */
