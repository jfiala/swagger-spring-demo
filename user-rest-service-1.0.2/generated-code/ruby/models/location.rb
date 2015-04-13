


class Location
  attr_accessor :street, :zip, :city, :country, :latitude, :longitude
  # :internal => :external
  def self.attribute_map
    {
      :street => :'street',
      :zip => :'zip',
      :city => :'city',
      :country => :'country',
      :latitude => :'latitude',
      :longitude => :'longitude'
      
    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    
    if self.class.attribute_map[:"street"]
      @street = attributes["street"]
    end
    
    if self.class.attribute_map[:"zip"]
      @zip = attributes["zip"]
    end
    
    if self.class.attribute_map[:"city"]
      @city = attributes["city"]
    end
    
    if self.class.attribute_map[:"country"]
      @country = attributes["country"]
    end
    
    if self.class.attribute_map[:"latitude"]
      @latitude = attributes["latitude"]
    end
    
    if self.class.attribute_map[:"longitude"]
      @longitude = attributes["longitude"]
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


