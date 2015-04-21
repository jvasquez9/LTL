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
public class ParallelC extends Pattern{
	
	public ParallelC(Scope s) {
        super(s);
        super.OnePropFormula = "[p1]";
        super.TwoPropFormula = "[p1]&[p2]";
        super.ThreePropFormula = "[p1]&[p2]&[p3]";
    }
    

}
