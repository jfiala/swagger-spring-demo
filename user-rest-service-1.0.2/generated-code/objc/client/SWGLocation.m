

#import "SWGLocation.h"

@implementation SWGLocation
  
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"street": @"street", @"zip": @"zip", @"city": @"city", @"country": @"country", @"latitude": @"latitude", @"longitude": @"longitude" }];
}


@end

