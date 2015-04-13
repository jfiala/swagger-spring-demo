


class ShowcaseDatatypeDate
  attr_accessor :date
  # :internal => :external
  def self.attribute_map
    {
      :date => :'date'
      
    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    
    if self.class.attribute_map[:"date"]
      @date = attributes["date"]
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


