


class ShowcaseDatatypePrimitives
  attr_accessor :single_byte, :tiny_number, :counter, :id, :budget_float, :budget, :deleted, :single_character
  # :internal => :external
  def self.attribute_map
    {
      :single_byte => :'singleByte',
      :tiny_number => :'tinyNumber',
      :counter => :'counter',
      :id => :'id',
      :budget_float => :'budgetFloat',
      :budget => :'budget',
      :deleted => :'deleted',
      :single_character => :'singleCharacter'
      
    }
  end

  def initialize(attributes = {})
    return if attributes.empty?
    # Morph attribute keys into undescored rubyish style
    
    if self.class.attribute_map[:"single_byte"]
      @single_byte = attributes["singleByte"]
    end
    
    if self.class.attribute_map[:"tiny_number"]
      @tiny_number = attributes["tinyNumber"]
    end
    
    if self.class.attribute_map[:"counter"]
      @counter = attributes["counter"]
    end
    
    if self.class.attribute_map[:"id"]
      @id = attributes["id"]
    end
    
    if self.class.attribute_map[:"budget_float"]
      @budget_float = attributes["budgetFloat"]
    end
    
    if self.class.attribute_map[:"budget"]
      @budget = attributes["budget"]
    end
    
    if self.class.attribute_map[:"deleted"]
      @deleted = attributes["deleted"]
    end
    
    if self.class.attribute_map[:"single_character"]
      @single_character = attributes["singleCharacter"]
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


