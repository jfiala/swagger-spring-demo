

#import "SWGShowcaseDatatypeDate.h"

@implementation SWGShowcaseDatatypeDate
  
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"date": @"date" }];
}


@end

