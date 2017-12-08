/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petri;

/**
 *
 * @author DIANA
 */
public class Arc {
    private int capacitate;
    private String directie;
    Location loc;
   
    
    public Arc(int capacitate,String directie, Location loc )
    {
       this.capacitate = capacitate;
       this.directie = directie;
       this.loc = loc;
    }
    
    public void Update()
    {
       if(directie=="IN")
           loc.setJetoane(capacitate);
       else 
       {
           loc.setJetoane(capacitate*2);
       }
    }
     
    public boolean isValid()
    {
       if(directie == "IN")
       {
            if(loc.getJetoane()>=capacitate)
                return true;
            else 
                return false;
       }
       else 
             return true;
      
    }
     
    /* public int getDirectie()
    {
        if (directie=="IN")
        {
            return 0;
        }
        if(directie=="OUT")
        {
            return 1;
        }
        
       
    }*/
    
    
}
