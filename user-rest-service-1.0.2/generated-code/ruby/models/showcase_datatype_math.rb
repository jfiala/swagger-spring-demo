


class ShowcaseDatatypeMath
  attr_accessor :big_integer, :big_decimal
  # :internal => :external
  def self.attribute_map
    {
      :big_integer => :'bigInteger',
      :big_decimal => :'bigDecimal'
      
    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    
    if self.class.attribute_map[:"big_integer"]
      @big_integer = attributes["bigInteger"]
    end
    
    if self.class.attribute_map[:"big_decimal"]
      @big_decimal = attributes["bigDecimal"]
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


