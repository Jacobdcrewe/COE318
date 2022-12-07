/**
 *
 * @author Jacob Crewe
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int mod, dgt;
    Counter lft;
    
    public Counter(int modulus, Counter left) {
        lft = left;
        mod = modulus;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return lft;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return dgt;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        dgt = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        dgt++;
        if(dgt == mod) {
            dgt = 0;
            if(lft != null) {
                lft.dgt++;
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (lft == null) {
            return dgt;
        } else {
            return mod*lft.dgt + dgt;
        }
        
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}