
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (April Howard)
 * @version (02/05/2020)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input.equals("Alice") || input.equals("Bob")) {
            return "Hello " + input;
        } 
      
        else if (input.equals("Bobert") || input.equals("Cynthia")){
            return "I DON'T KNOW YOU, YOU ARE SCARY";
       
        }
      
        else {
            return "I DON'T KNOW YOU, YOU ARE SCARY";
    }
       
}
}  
        
        
            
      
   

