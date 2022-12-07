package coe318.lab7;
/**
 *
 * @author Jacob Crewe
 */
public class Resistor {
    //instance variables
    public double resistance;
    private int node1, node2;
    private static int resistorNum = 1;
    public int id;
    //when resistor is called gives value to the instance variables from whats input
    public Resistor(int node1, int node2, double resistance) {
        //if the resistance or any of the nodes are negative returns an exception
        if(resistance < 0) {
            throw new IllegalArgumentException("Resitance can't be negative");
        }
        if(node1 < 0) {
            throw new IllegalArgumentException("Node1 can't be negative");
        }
        if(node2 < 0) {
            throw new IllegalArgumentException("Node2 can't be negative");
        }
        
        //setting values of instance variables to the input values
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        //giving an id for the resistor
        this.id = resistorNum;
        resistorNum++;
    }
    
    //creates an array for the nodes
    public int [] getNodes() {
        int[] nodes = {node1,node2};
        return nodes;
    }
    
    //returns the resistors values in string format
    @Override
    public String toString() {
        return "R" + id + " " + node1 + " " + node2 + " " + resistance;
    }
}
