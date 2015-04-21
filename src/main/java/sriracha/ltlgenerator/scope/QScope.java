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
public class QScope extends Scope {
	
	
	public QScope(int n) {
        super(n);
        super.propositions[0]= "d";
        super.propositions[1]= "e";
        super.propositions[2]= "h";
    }

}
