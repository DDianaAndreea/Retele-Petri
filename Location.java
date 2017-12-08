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
public class Location {
    String tag;
    int jetoane;
    
    public Location(String tag, int jetoane)
    {
        this.tag = tag;
        this.jetoane = jetoane;
    }
    public int getJetoane()
    {
        return jetoane;
    }
    public void setJetoane(int capacitate)
    {
        jetoane = jetoane - capacitate;
    }
}
