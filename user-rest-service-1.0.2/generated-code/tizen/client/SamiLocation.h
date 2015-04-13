/*
 * SamiLocation.h
 * 
 * Location object
 */

#ifndef SamiLocation_H_
#define SamiLocation_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Double;
using Tizen::Base::String;



namespace Swagger {

class SamiLocation: public SamiObject {
public:
    SamiLocation();
    SamiLocation(String* json);
    virtual ~SamiLocation();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiLocation* fromJson(String* obj);

    
    String* getPStreet();
    void setPStreet(String* pStreet);
    
    String* getPZip();
    void setPZip(String* pZip);
    
    String* getPCity();
    void setPCity(String* pCity);
    
    String* getPCountry();
    void setPCountry(String* pCountry);
    
    Double* getPLatitude();
    void setPLatitude(Double* pLatitude);
    
    Double* getPLongitude();
    void setPLongitude(Double* pLongitude);
    

private:
    String* pStreet;
    String* pZip;
    String* pCity;
    String* pCountry;
    Double* pLatitude;
    Double* pLongitude;
    
};

} /* namespace Swagger */

#endif /* SamiLocation_H_ */


