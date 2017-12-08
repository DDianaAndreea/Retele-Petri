/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petri;

import java.util.ArrayList;


/**
 *
 * @author DIANA
 */
public class CoffeeMachinePetri extends PetriNet {
    public CoffeeMachinePetri()
    { 
        final Location S0 = new Location("0", 1);
	final Location S1 = new Location("5", 0);
	final Location S2 = new Location("10", 0);
	final Location S3 = new Location("15", 0);
	
	Transition tr1; 
        tr1 = new Transition("5", new ArrayList<Arc>(){private boolean add; 
{ 
            add = add(new Arc(1,"IN", S1));
            add = add(new Arc(1, "OUT", S0));
        }}
        );
	ListaTranzitii.add(tr1);
		
		
	Transition tr2 = new Transition("5", new ArrayList<Arc>() {{ 
            add(new Arc(1, "IN", S2));
            add(new Arc(1, "out", S1));
            }}		
	);
	ListaTranzitii.add(tr2);
		
	Transition tr3 = new Transition("5", new ArrayList<Arc>() {{ 
            add(new Arc(1, "IN", S3));
            add(new Arc(1, "OUT", S2));
            }}		
	);
	ListaTranzitii.add(tr3);
		
	Transition tr4 = new Transition("10", new ArrayList<Arc>() {{ 
            add(new Arc(1, "IN", S1));
            add(new Arc(1, "OUT", S0));
            }}		
	);
	ListaTranzitii.add(tr4);

	Transition tr5 = new Transition("10", new ArrayList<Arc>() {{ 
            add(new Arc(1, "IN", S3));
            add(new Arc(1, "OUT", S1));
            }}		
	);
	ListaTranzitii.add(tr5);
		
       
    }
    
}
