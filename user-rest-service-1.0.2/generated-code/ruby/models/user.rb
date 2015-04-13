


class User
  attr_accessor :id, :name, :first_name, :state, :photo, :categories, :locations, :primitives, :math, :date, :create_timestamp, :modify_timestamp
  # :internal => :external
  def self.attribute_map
    {
      :id => :'id',
      :name => :'name',
      :first_name => :'firstName',
      :state => :'state',
      :photo => :'photo',
      :categories => :'categories',
      :locations => :'locations',
      :primitives => :'primitives',
      :math => :'math',
      :date => :'date',
      :create_timestamp => :'createTimestamp',
      :modify_timestamp => :'modifyTimestamp'
      
    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    
    if self.class.attribute_map[:"name"]
      @name = attributes["name"]
    end
    
    if self.class.attribute_map[:"first_name"]
      @first_name = attributes["firstName"]
    end
    
    if self.class.attribute_map[:"state"]
      @state = attributes["state"]
    end
    
    if self.class.attribute_map[:"photo"]
      if (value = attributes["photo"]).is_a?(Array)
        @photo = value
      end
    end
    
    if self.class.attribute_map[:"categories"]
      if (value = attributes["categories"]).is_a?(Array)
        @categories = value.map{ |v| Category.new(v) }
      end
    end
    
    if self.class.attribute_map[:"locations"]
      if (value = attributes["locations"]).is_a?(Array)
        @locations = value.map{ |v| Location.new(v) }
      end
    end
    
    if self.class.attribute_map[:"primitives"]
      @primitives = attributes["primitives"]
    end
    
    if self.class.attribute_map[:"math"]
      @math = attributes["math"]
    end
    
    if self.class.attribute_map[:"date"]
      @date = attributes["date"]
    end
    
    if self.class.attribute_map[:"create_timestamp"]
      @create_timestamp = attributes["createTimestamp"]
    end
    
    if self.class.attribute_map[:"modify_timestamp"]
      @modify_timestamp = attributes["modifyTimestamp"]
    end
    
  end

  def to_body
    body = {}
    self.class.attribute_map.each_pair do |key, value|
      body[value] = self.send(key) unless self.send(key).nil?
    end
    body
  end
end


