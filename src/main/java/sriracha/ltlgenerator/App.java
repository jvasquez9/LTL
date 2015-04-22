package sriracha.ltlgenerator;

import sriracha.ltlgenerator.cpclasses.AtLeastOneC;
import sriracha.ltlgenerator.cpclasses.ConsecutiveC;
import sriracha.ltlgenerator.cpclasses.ConsecutiveE;
import sriracha.ltlgenerator.cpclasses.EventualE;
import sriracha.ltlgenerator.cpclasses.CPClass;
import sriracha.ltlgenerator.pattern.Pattern;
import sriracha.ltlgenerator.proposition.LProposition;
import sriracha.ltlgenerator.proposition.PProposition;
import sriracha.ltlgenerator.proposition.QProposition;
import sriracha.ltlgenerator.proposition.RProposition;
import sriracha.ltlgenerator.scope.Scope;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This sucks!" );
        
        //Propositions
        LProposition l = new LProposition(3);
        RProposition r = new RProposition(3);
        PProposition p = new PProposition(3);
        QProposition q = new QProposition(3);
        
        
        ConsecutiveC cpL = new ConsecutiveC(l);
        ConsecutiveC cpR = new ConsecutiveC(r);
        ConsecutiveC cpP = new ConsecutiveC(p);
        ConsecutiveC cpQ = new ConsecutiveC(q);
        
        Pattern pat = new Pattern(cpL.getCPFormula(), cpR.getCPFormula(), cpP.getCPFormula(), cpQ.getCPFormula());
        System.out.println(pat.getResponseBeforeRc());
        
        
        //Scope s = new Scope(cpL.getCPFormula(), cpR.getCPFormula(), pat.getResponseBeforeRc(), cpQ.getCPFormula());
        
        //System.out.println(s.getFormulaBetweenLANDR());
       
        
    }
    
    
}
