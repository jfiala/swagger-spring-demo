
#import "SWGSearchApi.h"
#import "SWGFile.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"
#import "SWGUser.h"




@implementation SWGSearchApi
static NSString * basePath = @"http://localhost/";

+(SWGSearchApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGSearchApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGSearchApi alloc] init];
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



-(NSNumber*) searchUsersWithCompletionBlock: (NSString*) query
        
        completionHandler: (void (^)(NSArray<SWGUser>* output, NSError* error))completionBlock
         {

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/search", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    

    NSArray* requestContentTypes = @[@"application/json", ];
    NSString* requestContentType = [requestContentTypes count] > 0 ? requestContentTypes[0] : @"application/json";

    NSArray* responseContentTypes = @[@"*/*"];
    NSString* responseContentType = [responseContentTypes count] > 0 ? responseContentTypes[0] : @"application/json";

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if(query != nil) {
        
        queryParams[@"query"] = query;
    }
    
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    

    id bodyDictionary = nil;
    
    

    NSMutableDictionary * formParams = [[NSMutableDictionary alloc]init];

    
    

    

    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    
    // response is in a container
        // array container response type
    return [client dictionary: requestUrl 
                       method: @"GET" 
                  queryParams: queryParams 
                         body: bodyDictionary 
                 headerParams: headerParams
           requestContentType: requestContentType
          responseContentType: responseContentType
              completionBlock: ^(NSDictionary *data, NSError *error) {
                if (error) {
                    completionBlock(nil, error);
                    return;
                }
                
                if([data isKindOfClass:[NSArray class]]){
                    NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[data count]];
                    for (NSDictionary* dict in (NSArray*)data) {
                        
                        
                        SWGUser* d = [[SWGUser alloc] initWithDictionary:dict error:nil];
                        
                        [objs addObject:d];
                    }
                    completionBlock((NSArray<SWGUser>*)objs, nil);
                }
                
                
            }];
    

    

    
}


-(NSNumber*) saveUserWithCompletionBlock: (NSNumber*) _id
         name: (NSString*) name
        
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock
         {

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/search", basePath];

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
    if(name != nil) {
        
        queryParams[@"name"] = name;
    }
    
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    

    id bodyDictionary = nil;
    
    

    NSMutableDictionary * formParams = [[NSMutableDictionary alloc]init];

    
    

    

    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    

    
    // non container response

    

    
    // complex response
        
    // comples response type
    return [client dictionary: requestUrl
                       method: @"POST"
                  queryParams: queryParams
                         body: bodyDictionary
                 headerParams: headerParams
           requestContentType: requestContentType
          responseContentType: responseContentType
              completionBlock: ^(NSDictionary *data, NSError *error) {
                if (error) {
                    completionBlock(nil, error);
                    
                    return;
                }
                SWGUser* result = nil;
                if (data) {
                    result = [[SWGUser  alloc]  initWithDictionary:data error:nil];
                }
                completionBlock(result , nil);
                
              }];
    

    

    
}





@end
