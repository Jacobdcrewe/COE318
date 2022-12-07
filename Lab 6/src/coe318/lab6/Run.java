package coe318.lab6;

/**
 *
 * @author Jacob Crewe
 */
public class Run {
    
    public static void main(String[] args) {
        
        Circuit cir = Circuit.getInstance();
        
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        System.out.println(first.toString() + ", " + second.toString() + ", " + third.toString());

        Resistor r1 = new Resistor(3.3, first, second);
        Resistor r2 = new Resistor(27.7, second, third);
        System.out.println("Input:\n"+ r1.toString() + "\n" + r2.toString());
        
        cir.add(r1);
        cir.add(r2);
        System.out.println("\nOutput:\n" + cir.toString());
    }
    
}
