package coe318.lab7;

import java.util.Scanner;

/**
 *
 * @author Jacob Crewe
 */
public class UserMain {
    //instance variables
    private static int n1, n2;
    //regex for integers and double values. Checks if a string matches the need for a double or int
    private static final String regexInt ="[0-9]*", regexD = "^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$";
    private static double val;

    public static void main (String[] args) {
        //begin scanner
        Scanner userIn = new Scanner(System.in);
        String scanString ="";
        
        AnalogCircuit c = AnalogCircuit.getInstance();
        System.out.println("Input:");
        
        //while loop so the program will continue to ask for input
        while(true){
            scanString = userIn.nextLine();
            
            //array for the input. The array is split by spaces
            String out[] = scanString.split(" ");

            //checks for any input that isnt end or spice
            if(!scanString.equals("end") && !scanString.equals("spice")) {
                //if there are less than or more than 4 inputs an error is returned
                if(out.length < 4 || out.length > 4) {
                    scanString = "";
                    throw new IllegalArgumentException("Please input a choice of voltage source or resistor followed by two nodes and a value.(4 different values). Or input the command 'end' or 'spice'");
                }
                
                //checks if the nodes and resistor values are integers and doubles
                if(out[1].matches(regexInt) && out[2].matches(regexInt) && out[3].matches(regexD)){
                    //converts the values to integers and doubles
                    n1 = Integer.parseInt(out[1]);
                    n2 = Integer.parseInt(out[2]);
                    val = Double.parseDouble(out[3]);
                    //checks for voltage or resistor. If v choses voltage, if r chooses resistor
                    if(scanString.indexOf("v")==0) {
                        Voltage v = new Voltage(n1, n2, val);
                        c.addV(v);
                    } else if(scanString.indexOf("r")==0) {
                        Resistor r = new Resistor(n1, n2, val);
                        c.addR(r);
                    //if anything but v or r is chosen an error is output
                    } else {
                        scanString = "";
                        throw new IllegalArgumentException("Please input a choice for voltage or resitance denoting it as 'v' or 'r' respectively.");
                    }
                //error if the nodes and resistors dont match the regex
                } else if (!out[1].matches(regexInt) && !out[2].matches(regexInt)){
                     throw new IllegalArgumentException("Please input an integer for the nodes.");
                } else if (!out[3].matches(regexD)){
                     throw new IllegalArgumentException("Please input a double for the value of the resistor/voltage source or input a 0 beginning for a value between 0 & 1");
                }
            //if end is input end the program
            } else if(scanString.equals("end")) {
                break;
            //if spice is input output the circuit
            } else if(scanString.equals("spice")){
                System.out.println(c.toString());
            }
            

        }; 
        System.out.println("All Done!");
    }
}
