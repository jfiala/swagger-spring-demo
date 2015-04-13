require "uri"


class UsercompletepostcompleteApi
  basePath = "http://localhost/"
  # apiInvoker = APIInvoker



  # create or update a user name by id
  # saveUserComplete
  # @param body user
  # @return User
  def self.saveUserComplete (body, opts={})
    query_param_keys = []
    headerParams = {}

    
    
    # set default values and merge with input
    options = {
      :'body' => body
      
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
    
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array
      else 
        if body.respond_to?("to_body".to_sym)
          post_body = body.to_body
        else
          post_body = body
        end
      end
    end
    
    # form parameters
    form_parameter_hash = {}
    
    
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body, :form_params => form_parameter_hash }).make.body
     User.new(response)
    
    
  
  end

end

