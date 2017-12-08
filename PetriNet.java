/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author DIANA
 */
public abstract  class PetriNet {
    List<Transition> ListaTranzitii=new ArrayList<>();
    
    String StareCurenta()
    {
        for(Transition transition : ListaTranzitii)
        {
            ArrayList<Location> locList = new ArrayList<>();
            locList=transition.LocatieArce();
            
            for(Location loc : locList)
            {
                if(loc.jetoane==1)
                {
                    return loc.tag;
                }
            }
        }
        return "eroare" ;
    }
    
    
    void execute(String tag)
    {
        System.out.println("Current State: " + StareCurenta());
		List<Transition> validTransitions = new ArrayList<>();

		for(Transition transition : ListaTranzitii)
		{
			if(transition.tag == tag && transition.isValid())
			{
				validTransitions.add(transition);
			}
		}
		
		for(Transition transition : validTransitions)
		{
			transition.update();
		}
    }
    
}
