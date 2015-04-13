require "uri"


class UsercompletepostcompleteApi
  basePath = "http://localhost/"
  # apiInvoker = APIInvoker



  # create or update a user name by id
  # saveUserComplete
  # @param id id
  # @param user user
  # @return User
  def self.saveUserComplete (id, user, opts={})
    query_param_keys = [:id,:user]
    headerParams = {}

    
    
    # set default values and merge with input
    options = {
      :'id' => id,
      :'user' => user
      
    }.merge(opts)

    #resource path
    path = "/user_complete_post_complete".sub('{format}','json')
    
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

