/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIANA
 */
public class Transition {
   public String tag;
   public List<Arc> arce=new ArrayList<>();
    
    Location loc;
    int capacitate;
    
    public Transition(String tag, List<Arc> arce)
    {
        this.tag = tag;
        this.arce = arce;
    }
    
    public ArrayList<Location> LocatieArce()
    {
        ArrayList<Location> locList=new ArrayList<>();
        for(Arc arc:arce)
        {
            locList.add(arc.loc);
        }
        return locList;
    }
     public boolean isValid()
   {
       for(Arc arc : arce)
       {
           if(arc.isValid()==false)
           {
               return false;
           }
       }
       return true;
   }
     
    public void update()
   {
       for(Arc arc:arce)
       {
            arc.Update();
       }
      
   }
   
  
}
