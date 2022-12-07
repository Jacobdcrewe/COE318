package coe318.lab6;

/**
 *
 * @author Jacob Crewe
 */
public class Resistor {
    public double resistance;
    public Node node1, node2;
    public int id;
    private static int resistorNum = 1;
    public Resistor(double resistance, Node node1, Node node2) {
        if(resistance < 0) {
            throw new IllegalArgumentException("Resitance can't be negative");
        }
        if(node1 == null) {
            throw new IllegalArgumentException("Node1 can't be null");
        }
        if(node2 == null) {
            throw new IllegalArgumentException("Node2 can't be null");
        }
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id = resistorNum;
        resistorNum++;
    }
    
    public Node [] getNodes() {
        Node[] nodes = {node1,node2};
        return nodes;
    }
    
    @Override
    public String toString() {
        return "R" + id + ", " + node1 + ", " + node2 + ", " + resistance;
    }
}
