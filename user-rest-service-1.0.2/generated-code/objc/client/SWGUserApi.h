#import <Foundation/Foundation.h>
#import "SWGVoid.h"
#import "SWGUser.h"

#import "SWGObject.h"



@interface SWGUserApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGUserApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;

/**

 read User by ID
 pass ID to read user

 @param _id id
 

 return type: SWGUser*
 */
-(NSNumber*) getUserWithCompletionBlock :(NSNumber*) _id 
    
    completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;
    



/**

 create or update a user name by id
 saveUser

 @param _id id
 @param name name
 

 return type: SWGUser*
 */
-(NSNumber*) saveUserWithCompletionBlock :(NSNumber*) _id 
     name:(NSString*) name 
    
    completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;
    





@end