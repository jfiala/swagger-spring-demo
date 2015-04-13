

#import "SWGUser.h"

@implementation SWGUser
  
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"name": @"name", @"firstName": @"firstName", @"state": @"state", @"photo": @"photo", @"categories": @"categories", @"locations": @"locations", @"primitives": @"primitives", @"math": @"math", @"date": @"date", @"createTimestamp": @"createTimestamp", @"modifyTimestamp": @"modifyTimestamp" }];
}


@end

