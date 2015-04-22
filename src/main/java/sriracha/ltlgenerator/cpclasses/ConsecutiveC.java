/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sriracha.ltlgenerator.cpclasses;

import sriracha.ltlgenerator.proposition.Proposition;

/**
 * 
 * @author Luis Garnica <lagarnicachavira at miners.utep.edu>
 */
public class ConsecutiveC extends CPClass {
	
	
	public ConsecutiveC(Proposition s) {
        super(s);
        super.OnePropFormula = "([p1])";
        super.TwoPropFormula = "([p1]&X([p2]))";
        super.ThreePropFormula = "([p1]&X([p2]&X([p3])))";
    }

}
