package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Jacob Crewe
 */
public class Circuit {
    private static Circuit instance = null;
    ArrayList<Resistor> resistorList;
   
    public static Circuit getInstance() {
        if (instance == null){ 
            instance = new Circuit();
        }
        return instance;
    }
    private Circuit() {
        resistorList = new ArrayList<Resistor>();
    } //Yes, the constructor is PRIVATE!

    public void add(Resistor r){
        this.resistorList.add(r);
    }
    
    @Override
    public String toString() {
        String output ="";
      
        for(int i = 0; i < this.resistorList.size(); i++){
            output = output + this.resistorList.get(i).toString() + "\n";
        
        }
        
        return output;
    }
}
