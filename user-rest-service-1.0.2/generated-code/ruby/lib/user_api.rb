require "uri"


class UserApi
  basePath = "http://localhost/"
  # apiInvoker = APIInvoker



  # read User by ID
  # pass ID to read user
  # @param id id
  # @return User
  def self.getUser (id, opts={})
    query_param_keys = [:id]
    headerParams = {}

    
    
    # set default values and merge with input
    options = {
      :'id' => id
      
    }.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end

    # header parameters
    headers = {}

    _header_accept = '*/*'
    if _header_accept != ''
      headerParams['Accept'] = _header_accept
    end 
    _header_content_type = ['application/json', ]
    headerParams['Content-Type'] = _header_content_type.length > 0 ? _header_content_type[0] : 'application/json'

    
    
    # http body (model)
    post_body = nil
    
    # form parameters
    form_parameter_hash = {}
    
    
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body, :form_params => form_parameter_hash }).make.body
     User.new(response)
    
    
  
  end


  # create or update a user name by id
  # saveUser
  # @param id id
  # @param name name
  # @return User
  def self.saveUser (id, name, opts={})
    query_param_keys = [:id,:name]
    headerParams = {}

    
    
    # set default values and merge with input
    options = {
      :'id' => id,
      :'name' => name
      
    }.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')
    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end

    # header parameters
    headers = {}

    _header_accept = '*/*'
    if _header_accept != ''
      headerParams['Accept'] = _header_accept
    end 
    _header_content_type = ['application/json', ]
    headerParams['Content-Type'] = _header_content_type.length > 0 ? _header_content_type[0] : 'application/json'

    
    
    # http body (model)
    post_body = nil
    
    # form parameters
    form_parameter_hash = {}
    
    
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body, :form_params => form_parameter_hash }).make.body
     User.new(response)
    
    
  
  end

end

