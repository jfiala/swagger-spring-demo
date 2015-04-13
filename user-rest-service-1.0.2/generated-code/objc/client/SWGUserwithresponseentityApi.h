#import <Foundation/Foundation.h>
#import "SWGVoid.h"

#import "SWGObject.h"



@interface SWGUserwithresponseentityApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGUserwithresponseentityApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;

/**

 getUserResponseEntity
 getUserResponseEntity

 @param _id id
 

 return type: NSObject*
 */
-(NSNumber*) getUserResponseEntityWithCompletionBlock :(NSNumber*) _id 
    
    completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;
    





@end