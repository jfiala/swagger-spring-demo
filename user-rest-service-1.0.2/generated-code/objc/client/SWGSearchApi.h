#import <Foundation/Foundation.h>
#import "SWGUser.h"

#import "SWGObject.h"



@interface SWGSearchApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGSearchApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;

/**

 search for users by name-part
 search for users

 @param query query
 

 return type: NSArray<SWGUser>*
 */
-(NSNumber*) searchUsersWithCompletionBlock :(NSString*) query 
    
    completionHandler: (void (^)(NSArray<SWGUser>* output, NSError* error))completionBlock;
    



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