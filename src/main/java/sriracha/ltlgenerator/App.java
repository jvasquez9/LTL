package sriracha.ltlgenerator;

import sriracha.ltlgenerator.pattern.AtLeastOneC;
import sriracha.ltlgenerator.pattern.ConsecutiveE;
import sriracha.ltlgenerator.pattern.EventualE;
import sriracha.ltlgenerator.scope.LScope;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This sucks!" );
        
        LScope s = new LScope(3);
        ConsecutiveE cp = new ConsecutiveE(s);
        System.out.println(cp.getCPFormula());
       
        
    }
    
    
}
