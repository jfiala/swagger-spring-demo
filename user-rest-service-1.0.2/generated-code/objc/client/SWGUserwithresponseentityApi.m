
#import "SWGUserwithresponseentityApi.h"
#import "SWGFile.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGVoid.h"




@implementation SWGUserwithresponseentityApi
static NSString * basePath = @"http://localhost/";

+(SWGUserwithresponseentityApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGUserwithresponseentityApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGUserwithresponseentityApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(void) setBasePath:(NSString*)path {
    basePath = path;
}

+(NSString*) getBasePath {
    return basePath;
}

-(SWGApiClient*) apiClient {
    return [SWGApiClient sharedClientFromPool:basePath];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(id) init {
    self = [super init];
    [self apiClient];
    return self;
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}



-(NSNumber*) getUserResponseEntityWithCompletionBlock: (NSNumber*) _id
        
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock
         {

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/user_with_responseentity", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    

    NSArray* requestContentTypes = @[@"application/json", ];
    NSString* requestContentType = [requestContentTypes count] > 0 ? requestContentTypes[0] : @"application/json";

    NSArray* responseContentTypes = @[@"*/*"];
    NSString* responseContentType = [responseContentTypes count] > 0 ? responseContentTypes[0] : @"application/json";

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(_id != nil) {
        
        queryParams[@"id"] = _id;
    }
    
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    

    id bodyDictionary = nil;
    
    

    NSMutableDictionary * formParams = [[NSMutableDictionary alloc]init];

    
    

    

    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    

    
    // non container response

    
    // primitive response
            // primitive response type
    return [client stringWithCompletionBlock: requestUrl 
                                              method: @"GET" 
                                         queryParams: queryParams 
                                                body: bodyDictionary 
                                        headerParams: headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock: ^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSObject *result = data ? [[NSObject  alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    
    
    

    
    // complex response
        

    

    
}





@end
