package JavaProgs;

public class swap22 {
    int aa;    //global variable
    int bb;    //global variable
    int temp;

    // Method to swap values
    void swap(int a, int b){
        // Assigning local values to global variables
        this.aa = a;
        this.bb = b;

        // Swapping logic
        temp = this.aa;
        this.aa = this.bb;
        this.bb = temp;

        // Printing the swapped values
        System.out.println("After swap: a = " + this.aa + ", b = " + this.bb);
    }

    public static void main(String[] args) {
        swap22 ob = new swap22();
        ob.swap(10, 20);
        // The swapped values will be printed from within the swap method
    }
}
