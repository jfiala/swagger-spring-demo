using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;



namespace io.swagger.Model {
  public class User {
    

    /* ID of the user */
    
    public long? Id { get; set; }

    

    /* Name of the user */
    
    public string Name { get; set; }

    

    /* First name of the user */
    
    public string FirstName { get; set; }

    

    /*  */
    
    public string State { get; set; }

    

    /* demo for java.lang.Byte[] */
    
    public List<string> Photo { get; set; }

    

    /* demo for java.util.List */
    
    public List<Category> Categories { get; set; }

    

    
    public List<Location> Locations { get; set; }

    

    
    public ShowcaseDatatypePrimitives Primitives { get; set; }

    

    
    public ShowcaseDatatypeMath Math { get; set; }

    

    
    public ShowcaseDatatypeDate Date { get; set; }

    

    /* created */
    
    public DateTime CreateTimestamp { get; set; }

    

    /* last modified */
    
    public DateTime ModifyTimestamp { get; set; }

    

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class User {\n");
      
      sb.Append("  Id: ").Append(Id).Append("\n");
      
      sb.Append("  Name: ").Append(Name).Append("\n");
      
      sb.Append("  FirstName: ").Append(FirstName).Append("\n");
      
      sb.Append("  State: ").Append(State).Append("\n");
      
      sb.Append("  Photo: ").Append(Photo).Append("\n");
      
      sb.Append("  Categories: ").Append(Categories).Append("\n");
      
      sb.Append("  Locations: ").Append(Locations).Append("\n");
      
      sb.Append("  Primitives: ").Append(Primitives).Append("\n");
      
      sb.Append("  Math: ").Append(Math).Append("\n");
      
      sb.Append("  Date: ").Append(Date).Append("\n");
      
      sb.Append("  CreateTimestamp: ").Append(CreateTimestamp).Append("\n");
      
      sb.Append("  ModifyTimestamp: ").Append(ModifyTimestamp).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  
  
}