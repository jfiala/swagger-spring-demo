/*
 * SamiShowcaseDatatypePrimitives.h
 * 
 * 
 */

#ifndef SamiShowcaseDatatypePrimitives_H_
#define SamiShowcaseDatatypePrimitives_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Double;
using Tizen::Base::Long;
using Tizen::Base::String;
using Tizen::Base::Boolean;
using Tizen::Base::Integer;



namespace Swagger {

class SamiShowcaseDatatypePrimitives: public SamiObject {
public:
    SamiShowcaseDatatypePrimitives();
    SamiShowcaseDatatypePrimitives(String* json);
    virtual ~SamiShowcaseDatatypePrimitives();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiShowcaseDatatypePrimitives* fromJson(String* obj);

    
    String* getPSingleByte();
    void setPSingleByte(String* pSingleByte);
    
    Integer* getPTinyNumber();
    void setPTinyNumber(Integer* pTinyNumber);
    
    Integer* getPCounter();
    void setPCounter(Integer* pCounter);
    
    Long* getPId();
    void setPId(Long* pId);
    
    Long* getPBudgetFloat();
    void setPBudgetFloat(Long* pBudgetFloat);
    
    Double* getPBudget();
    void setPBudget(Double* pBudget);
    
    Boolean* getPDeleted();
    void setPDeleted(Boolean* pDeleted);
    
    String* getPSingleCharacter();
    void setPSingleCharacter(String* pSingleCharacter);
    

private:
    String* pSingleByte;
    Integer* pTinyNumber;
    Integer* pCounter;
    Long* pId;
    Long* pBudgetFloat;
    Double* pBudget;
    Boolean* pDeleted;
    String* pSingleCharacter;
    
};

} /* namespace Swagger */

#endif /* SamiShowcaseDatatypePrimitives_H_ */


