/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sriracha.ltlgenerator.scope;

/**
 * 
 * @author Luis Garnica <lagarnicachavira at miners.utep.edu>
 */
public class LScope extends Scope {

    public LScope(int n) {
        super(n);
        super.propositions[0]= "j";
        super.propositions[1]= "k";
        super.propositions[2]= "l";
    }
    
}
