/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sriracha.ltlgenerator.pattern;

import sriracha.ltlgenerator.scope.Scope;

/**
 * 
 * @author John Vasquez
 */
public class EventualC extends Pattern {

	public EventualC(Scope s) {
		super(s);
		super.OnePropFormula = "[p1]";
		super.TwoPropFormula = "([p1]&X(![p2]U([p2])))";
		super.ThreePropFormula = "([p1]&X(![p2]U([p2]&X(![p3]U([p3])))))";
	}

	
	

}
