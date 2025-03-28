class Complex {
    private double real;
    private double imag;

    // Method to set data
    public void setData(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    // Method to add two complex numbers
    public Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        // Setting data for the complex numbers
        c1.setData(3.5, 2.5);
        c2.setData(1.5, 4.5);

        // Displaying the numbers
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();

        // Adding two complex numbers
        c3 = c3.add(c1, c2);

        // Displaying the result
        System.out.print("Sum: ");
        c3.display();
    }
}


