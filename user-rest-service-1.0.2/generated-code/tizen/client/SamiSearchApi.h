#ifndef SamiSearchApi_H_
#define SamiSearchApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiUser.h"
using Tizen::Base::String;
using Tizen::Base::Long;


using namespace Tizen::Net::Http;

namespace Swagger {


class SamiSearchApi {
public:
  SamiSearchApi();
  virtual ~SamiSearchApi();

  
  IList* 
  searchUsersWithCompletion(String* query, void (* handler)(IList*, SamiError*));
  
  SamiUser* 
  saveUserWithCompletion(Long* _id, String* name, void (* handler)(SamiUser*, SamiError*));
  
  static String getBasePath() {
    return L"http://localhost/";
  }

private:
  SamiApiClient* client;
};



} /* namespace Swagger */

#endif /* SamiSearchApi_H_ */
