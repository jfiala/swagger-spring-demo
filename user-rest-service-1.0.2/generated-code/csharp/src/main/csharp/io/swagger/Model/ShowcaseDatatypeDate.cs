using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;



namespace io.swagger.Model {
  public class ShowcaseDatatypeDate {
    

    
    public DateTime Date { get; set; }

    

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ShowcaseDatatypeDate {\n");
      
      sb.Append("  Date: ").Append(Date).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  
  
}