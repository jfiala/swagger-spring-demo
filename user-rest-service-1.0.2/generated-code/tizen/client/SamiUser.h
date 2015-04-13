/*
 * SamiUser.h
 * 
 * User object
 */

#ifndef SamiUser_H_
#define SamiUser_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiCategory.h"
using Tizen::Base::Long;
#include "SamiLocation.h"
using Tizen::Base::DateTime;
using Tizen::Base::String;
using Tizen::Base::Collection::IList;
#include "SamiShowcaseDatatypePrimitives.h"
#include "SamiShowcaseDatatypeDate.h"
#include "SamiShowcaseDatatypeMath.h"



namespace Swagger {

class SamiUser: public SamiObject {
public:
    SamiUser();
    SamiUser(String* json);
    virtual ~SamiUser();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiUser* fromJson(String* obj);

    
    Long* getPId();
    void setPId(Long* pId);
    
    String* getPName();
    void setPName(String* pName);
    
    String* getPFirstName();
    void setPFirstName(String* pFirstName);
    
    String* getPState();
    void setPState(String* pState);
    
    IList* getPPhoto();
    void setPPhoto(IList* pPhoto);
    
    IList* getPCategories();
    void setPCategories(IList* pCategories);
    
    IList* getPLocations();
    void setPLocations(IList* pLocations);
    
    SamiShowcaseDatatypePrimitives* getPPrimitives();
    void setPPrimitives(SamiShowcaseDatatypePrimitives* pPrimitives);
    
    SamiShowcaseDatatypeMath* getPMath();
    void setPMath(SamiShowcaseDatatypeMath* pMath);
    
    SamiShowcaseDatatypeDate* getPDate();
    void setPDate(SamiShowcaseDatatypeDate* pDate);
    
    DateTime* getPCreateTimestamp();
    void setPCreateTimestamp(DateTime* pCreateTimestamp);
    
    DateTime* getPModifyTimestamp();
    void setPModifyTimestamp(DateTime* pModifyTimestamp);
    

private:
    Long* pId;
    String* pName;
    String* pFirstName;
    String* pState;
    IList* pPhoto;
    IList* pCategories;
    IList* pLocations;
    SamiShowcaseDatatypePrimitives* pPrimitives;
    SamiShowcaseDatatypeMath* pMath;
    SamiShowcaseDatatypeDate* pDate;
    DateTime* pCreateTimestamp;
    DateTime* pModifyTimestamp;
    
};

} /* namespace Swagger */

#endif /* SamiUser_H_ */


