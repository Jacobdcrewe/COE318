package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Jacob Crewe
 */
public class AnalogCircuit {
    
    //creating instance variables
    private static AnalogCircuit instance = null;
    ArrayList<Object> circuitList;
   
    //tests if there is an empty spot and if there is input a new circuit
    public static AnalogCircuit getInstance() {
        if (instance == null){ 
            instance = new AnalogCircuit();
        }
        return instance;
    }
    
    //creating array list for circuits
    private AnalogCircuit() {
        circuitList = new ArrayList<Object>();
    }

    //adds resistor to arraylist
    public void addR(Resistor r){
        circuitList.add(r);
    }
    
    //adds voltage source to arraylist
    public void addV(Voltage v) {
        circuitList.add(v);
    }
    
    //creates output of the entire arraylist in string format
    @Override
    public String toString() {
        String output ="";
      
        for(int i = 0; i < this.circuitList.size(); i++){
            output = output + this.circuitList.get(i).toString() + "\n";
        
        }
        
        return output;
    }
}
