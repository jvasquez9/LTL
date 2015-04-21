/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sriracha.ltlgenerator.pattern;

import sriracha.ltlgenerator.scope.Scope;

/**
 * 
 * @author Luis Garnica <lagarnicachavira at miners.utep.edu>
 */
public class ConsecutiveE extends Pattern{

	
	 public ConsecutiveE(Scope s) {
	        super(s);
	        super.OnePropFormula = "(![p1])&((![p1])U([p1]))";
	        super.TwoPropFormula = "(![p1]&![p2])&((![p1]&![p2])U([p1]&![p2]&X([p2])))";
	        super.ThreePropFormula = "(![p1]&![p2]&![p3])&((![p1]&![p2]&![p3])U([p1]&![p2]&![p3]&X([p2]&![p3]&X([p3]))))";
	    }
}
