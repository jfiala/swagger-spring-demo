#!/usr/bin/env python
# coding: utf-8

"""
SearchApi.py
Copyright 2015 Reverb Technologies, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
"""
import sys
import os
import urllib

from models import *



class SearchApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    
    
    def searchUsers(self, **kwargs):
        """search for users by name-part

        Args:
            
            query, str: query (required)
            
            
        
        Returns: list[User]
        """

        allParams = ['query']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method searchUsers" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/search'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}
        formParams = {}
        files = {}
        bodyParam = None

        headerParams['Accept'] = '*/*'
        headerParams['Content-Type'] = 'application/json,'

        
        if ('query' in params):
            queryParams['query'] = self.apiClient.toPathValue(params['query'])
        

        

        

        

        

        postData = (formParams if formParams else bodyParam)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, files=files)

        
        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'list[User]')
        return responseObject
        
        
        
    
    def saveUser(self, **kwargs):
        """create or update a user name by id

        Args:
            
            id, long: id (required)
            
            
            name, str: name (required)
            
            
        
        Returns: User
        """

        allParams = ['id', 'name']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method saveUser" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/search'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}
        formParams = {}
        files = {}
        bodyParam = None

        headerParams['Accept'] = '*/*'
        headerParams['Content-Type'] = 'application/json,'

        
        if ('id' in params):
            queryParams['id'] = self.apiClient.toPathValue(params['id'])
        
        if ('name' in params):
            queryParams['name'] = self.apiClient.toPathValue(params['name'])
        

        

        

        

        

        postData = (formParams if formParams else bodyParam)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams, files=files)

        
        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'User')
        return responseObject
        
        
        
    



