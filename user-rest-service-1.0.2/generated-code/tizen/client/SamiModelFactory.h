#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SamiObject.h"

#include "SamiUser.h"
#include "SamiShowcaseDatatypePrimitives.h"
#include "SamiCategory.h"
#include "SamiShowcaseDatatypeDate.h"
#include "SamiShowcaseDatatypeMath.h"
#include "SamiLocation.h"

namespace Swagger {
  void*
  create(String type) {
    if(type.Equals(L"SamiUser", true)) {
      return new SamiUser();
    }
    if(type.Equals(L"SamiShowcaseDatatypePrimitives", true)) {
      return new SamiShowcaseDatatypePrimitives();
    }
    if(type.Equals(L"SamiCategory", true)) {
      return new SamiCategory();
    }
    if(type.Equals(L"SamiShowcaseDatatypeDate", true)) {
      return new SamiShowcaseDatatypeDate();
    }
    if(type.Equals(L"SamiShowcaseDatatypeMath", true)) {
      return new SamiShowcaseDatatypeMath();
    }
    if(type.Equals(L"SamiLocation", true)) {
      return new SamiLocation();
    }
    
    if(type.Equals(L"String", true)) {
      return new String();
    }
    if(type.Equals(L"Integer", true)) {
      return new Integer();
    }
    if(type.Equals(L"Long", true)) {
      return new Long();
    }
    if(type.Equals(L"DateTime", true)) {
      return new DateTime();
    }
    return null;
  }
} /* namespace Swagger */

#endif /* ModelFactory_H_ */
