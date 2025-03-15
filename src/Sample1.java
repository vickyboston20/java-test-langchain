package src;

public class Sample1 {
    // Declare a private integer variable for the BIN number.
    private int binNumber = 8;

    public Sample1() {
    }

    public int getBinNumber() {
        return binNumber;
    }

    public static void main(String[] args) {
        Sample1 s = new Sample1();
        System.out.println("binNumber: " + s.getBinNumber());
    }
}
