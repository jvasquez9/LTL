/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sriracha.ltlgenerator.scope;

import java.util.ArrayList;

/**
 * 
 * @author Luis Garnica <lagarnicachavira at miners.utep.edu>
 */
public class RScope extends Scope {
	
	
	public RScope(int n) {
        super(n);
        super.propositions[0]= "n";
        super.propositions[1]= "m";
        super.propositions[2]= "o";
    }

}

