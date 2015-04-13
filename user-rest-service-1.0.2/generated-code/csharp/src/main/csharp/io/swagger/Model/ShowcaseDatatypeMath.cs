using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;



namespace io.swagger.Model {
  public class ShowcaseDatatypeMath {
    

    
    public long? BigInteger { get; set; }

    

    
    public double? BigDecimal { get; set; }

    

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ShowcaseDatatypeMath {\n");
      
      sb.Append("  BigInteger: ").Append(BigInteger).Append("\n");
      
      sb.Append("  BigDecimal: ").Append(BigDecimal).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  
  
}