using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;



namespace io.swagger.Model {
  public class ShowcaseDatatypePrimitives {
    

    
    public string SingleByte { get; set; }

    

    
    public int? TinyNumber { get; set; }

    

    
    public int? Counter { get; set; }

    

    
    public long? Id { get; set; }

    

    
    public long? BudgetFloat { get; set; }

    

    
    public double? Budget { get; set; }

    

    
    public bool? Deleted { get; set; }

    

    
    public string SingleCharacter { get; set; }

    

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ShowcaseDatatypePrimitives {\n");
      
      sb.Append("  SingleByte: ").Append(SingleByte).Append("\n");
      
      sb.Append("  TinyNumber: ").Append(TinyNumber).Append("\n");
      
      sb.Append("  Counter: ").Append(Counter).Append("\n");
      
      sb.Append("  Id: ").Append(Id).Append("\n");
      
      sb.Append("  BudgetFloat: ").Append(BudgetFloat).Append("\n");
      
      sb.Append("  Budget: ").Append(Budget).Append("\n");
      
      sb.Append("  Deleted: ").Append(Deleted).Append("\n");
      
      sb.Append("  SingleCharacter: ").Append(SingleCharacter).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  
  
}