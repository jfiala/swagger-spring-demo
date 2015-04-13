/*
 * SamiShowcaseDatatypeDate.h
 * 
 * 
 */

#ifndef SamiShowcaseDatatypeDate_H_
#define SamiShowcaseDatatypeDate_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::DateTime;



namespace Swagger {

class SamiShowcaseDatatypeDate: public SamiObject {
public:
    SamiShowcaseDatatypeDate();
    SamiShowcaseDatatypeDate(String* json);
    virtual ~SamiShowcaseDatatypeDate();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiShowcaseDatatypeDate* fromJson(String* obj);

    
    DateTime* getPDate();
    void setPDate(DateTime* pDate);
    

private:
    DateTime* pDate;
    
};

} /* namespace Swagger */

#endif /* SamiShowcaseDatatypeDate_H_ */


