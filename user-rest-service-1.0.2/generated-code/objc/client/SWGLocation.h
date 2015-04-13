#import <Foundation/Foundation.h>
#import "SWGObject.h"





@protocol SWGLocation
@end
  
@interface SWGLocation : SWGObject



@property(nonatomic) NSString<Optional>* street;


@property(nonatomic) NSString<Optional>* zip;


@property(nonatomic) NSString<Optional>* city;


@property(nonatomic) NSString<Optional>* country;

/* demo for java.math.BigDecimal [optional]
 */
@property(nonatomic) NSNumber<Optional>* latitude;

/* demo for java.lang.Double [optional]
 */
@property(nonatomic) NSNumber<Optional>* longitude;


@end


