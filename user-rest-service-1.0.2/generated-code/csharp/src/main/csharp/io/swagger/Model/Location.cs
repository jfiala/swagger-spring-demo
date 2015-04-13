using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;



namespace io.swagger.Model {
  public class Location {
    

    
    public string Street { get; set; }

    

    
    public string Zip { get; set; }

    

    
    public string City { get; set; }

    

    
    public string Country { get; set; }

    

    /* demo for java.math.BigDecimal */
    
    public double? Latitude { get; set; }

    

    /* demo for java.lang.Double */
    
    public double? Longitude { get; set; }

    

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Location {\n");
      
      sb.Append("  Street: ").Append(Street).Append("\n");
      
      sb.Append("  Zip: ").Append(Zip).Append("\n");
      
      sb.Append("  City: ").Append(City).Append("\n");
      
      sb.Append("  Country: ").Append(Country).Append("\n");
      
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  
  
}