

#import "SWGShowcaseDatatypePrimitives.h"

@implementation SWGShowcaseDatatypePrimitives
  
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"singleByte": @"singleByte", @"tinyNumber": @"tinyNumber", @"counter": @"counter", @"id": @"_id", @"budgetFloat": @"budgetFloat", @"budget": @"budget", @"deleted": @"deleted", @"singleCharacter": @"singleCharacter" }];
}


@end

