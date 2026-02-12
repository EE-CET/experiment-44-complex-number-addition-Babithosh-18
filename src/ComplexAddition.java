import java.util.Scanner;

class Complex {
    

    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)

	 int real, imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

}

public class ComplexAddition {
    
        // TODO: Read real1, imag1
        // TODO: Read real2, imag2
        
        // TODO: Create two Complex objects
        
        // TODO: Add them
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        // Correct Output Format: a + bi
        System.out.println(result.real + " + " + result.imag + "i");

        sc.close();
    }
}
