/*
 * SamiShowcaseDatatypeMath.h
 * 
 * 
 */

#ifndef SamiShowcaseDatatypeMath_H_
#define SamiShowcaseDatatypeMath_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Double;
using Tizen::Base::Long;



namespace Swagger {

class SamiShowcaseDatatypeMath: public SamiObject {
public:
    SamiShowcaseDatatypeMath();
    SamiShowcaseDatatypeMath(String* json);
    virtual ~SamiShowcaseDatatypeMath();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiShowcaseDatatypeMath* fromJson(String* obj);

    
    Long* getPBigInteger();
    void setPBigInteger(Long* pBigInteger);
    
    Double* getPBigDecimal();
    void setPBigDecimal(Double* pBigDecimal);
    

private:
    Long* pBigInteger;
    Double* pBigDecimal;
    
};

} /* namespace Swagger */

#endif /* SamiShowcaseDatatypeMath_H_ */


