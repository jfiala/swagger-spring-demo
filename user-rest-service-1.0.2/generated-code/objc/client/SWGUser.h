#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGShowcaseDatatypeMath.h"
#import "SWGCategory.h"
#import "SWGShowcaseDatatypeDate.h"
#import "SWGLocation.h"
#import "SWGShowcaseDatatypePrimitives.h"





@protocol SWGUser
@end
  
@interface SWGUser : SWGObject


/* ID of the user [optional]
 */
@property(nonatomic) NSNumber<Optional>* _id;

/* Name of the user [optional]
 */
@property(nonatomic) NSString<Optional>* name;

/* First name of the user [optional]
 */
@property(nonatomic) NSString<Optional>* firstName;

/*  [optional]
 */
@property(nonatomic) NSString<Optional>* state;

/* demo for java.lang.Byte[] [optional]
 */
@property(nonatomic) NSArray<Optional>* photo;

/* demo for java.util.List [optional]
 */
@property(nonatomic) NSArray<Optional, SWGCategory>* categories;


@property(nonatomic) NSArray<Optional, SWGLocation>* locations;


@property(nonatomic) SWGShowcaseDatatypePrimitives<Optional, SWGShowcaseDatatypePrimitives>* primitives;


@property(nonatomic) SWGShowcaseDatatypeMath<Optional, SWGShowcaseDatatypeMath>* math;


@property(nonatomic) SWGShowcaseDatatypeDate<Optional, SWGShowcaseDatatypeDate>* date;

/* created [optional]
 */
@property(nonatomic) NSDate<Optional>* createTimestamp;

/* last modified [optional]
 */
@property(nonatomic) NSDate<Optional>* modifyTimestamp;


@end


