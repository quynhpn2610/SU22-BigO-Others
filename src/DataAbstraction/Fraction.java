// Write a program to sum up and shorten two fractions

package DataAbstraction;

public class Fraction {
    // Attribute
    private int num;
    private int denom;

    // Constructor
    public Fraction(){
        this.num = 0;
        this.denom = 1;
    }

    public Fraction(int a, int b) {
        this.num = a;
        this.denom = b;
    }

    // Function to reduce fractions
    public void reduceFraction(){
        if (this.num == 0){
            this.denom = 1;
        }
        int x = gcd(Math.abs(this.num), Math.abs(this.denom));
        this.num = this.num/x;
        this.denom = this.denom/x;
    }

    private int gcd(int a, int b){
        int r = 0;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Function to calculate sum
    public Fraction sumFraction(Fraction p2){
        Fraction p3 = new Fraction();
        p3.num = this.num * p2.denom + this.denom * p2.num;
        p3.denom = this.denom * p2.denom;
        p3.reduceFraction();
        return p3;
    }


    // toString
    @Override
    public String toString(){
        return String.format("%d %d", this.num, this.denom);
    }
}
