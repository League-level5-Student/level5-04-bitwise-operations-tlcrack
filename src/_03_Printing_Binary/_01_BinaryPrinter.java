package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	//System.out.println(b%2);
        // Shift b seven bits to the right
    	//int c = b>>7;
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	//c&=1;
        // Print the result using System.out.print (NOT System.out.println)
    	//System.out.print(c);
        //Use this method to print the remaining 7 bits of b
    	for(int i = 0; i < 8; i++) {
    		int j = b>>(7-i);
    		j&=1;
    		System.out.print(j);
    	}
    	//System.out.println("");
    }

    public void printShortBinary(short s) {
        // Create 2 byte variables
    	byte b = 0;
    	byte c = 0;
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	
    	/*for(int i = 0; i < 8; i++) {
    		b = (byte) (s>>(15-i));
    		b&=1;
    	}*/
    	b = (byte) (s>>8);
    	/*for(int i = 0; i < 8; i++) {
    		c = (byte) (s>>(7-i));
    		c&=1;
    	}*/
    	c = (byte) s;
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	printByteBinary(b);
    	printByteBinary(c);
    }

    public void printIntBinary(int i) {
        // Create 2 short variables
    	short s;
    	short t;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	s = (short) (i>>16);
    	t = (short) i;
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	printShortBinary(s);
    	printShortBinary(t);
    	
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int i;
    	int j;
    	
    	i = (int) (l>>32);
    	j = (int) l;

    	printIntBinary(i);
    	printIntBinary(j);
    }

    public static void main(String[] args) {
        // Test your methods here
    	_01_BinaryPrinter bp = new _01_BinaryPrinter();
    	bp.printByteBinary((byte) 63);
    	System.out.println("");
    	bp.printShortBinary((short) 3000);
    	System.out.println("");
    	bp.printIntBinary(1000000000);
    	System.out.println("");
    	bp.printLongBinary((long) (1*Math.pow(10, 15)));
    	System.out.println("");
    	
    }
}
