
package coe318.lab6;

/**
 *
 * @author Jacob Crewe
 */
public class Node {
    private int id;
    private static int nodeCount = 0;
    
    public Node() {
        this.id = nodeCount;
        nodeCount++;
    }
    @Override
    public String toString() {
        String output = this.id + "";
        return output;
    }
}
