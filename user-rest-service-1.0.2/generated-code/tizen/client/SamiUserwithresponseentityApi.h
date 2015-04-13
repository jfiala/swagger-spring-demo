#ifndef SamiUserwithresponseentityApi_H_
#define SamiUserwithresponseentityApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

using Tizen::Base::Long;
#include "SamiVoid.h"
#include "SamiObject.h"


using namespace Tizen::Net::Http;

namespace Swagger {


class SamiUserwithresponseentityApi {
public:
  SamiUserwithresponseentityApi();
  virtual ~SamiUserwithresponseentityApi();

  
  SamiObject* 
  getUserResponseEntityWithCompletion(Long* _id, void (* handler)(SamiObject*, SamiError*));
  
  static String getBasePath() {
    return L"http://localhost/";
  }

private:
  SamiApiClient* client;
};



} /* namespace Swagger */

#endif /* SamiUserwithresponseentityApi_H_ */
