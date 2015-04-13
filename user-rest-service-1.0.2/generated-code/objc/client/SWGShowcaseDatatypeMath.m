

#import "SWGShowcaseDatatypeMath.h"

@implementation SWGShowcaseDatatypeMath
  
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"bigInteger": @"bigInteger", @"bigDecimal": @"bigDecimal" }];
}


@end

