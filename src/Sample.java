package src;

// Sample2.java
public class Sample {
    public static void main(String[] args) {
        // Use the BIN_NUMBER utility to format the BIN number as a 6-digit string, padded on the left with '0'
        String formattedBin = BinNumberUtil.BIN_NUMBER(6, '0', PaddingDirection.LEFT);
        System.out.println("Formatted BIN Number: " + formattedBin);
    }
}

// Enum for specifying padding direction.
enum PaddingDirection {
    LEFT, RIGHT
}

// Utility class for formatting BIN numbers.
class BinNumberUtil {
    /**
     * Formats the given number as a BIN number with a fixed length of 6.
     * The number is converted to a string and padded with the specified character.
     *
     * @param number  The number to format.
     * @param pad     The character to use for padding.
     * @param direction  The direction in which to pad (LEFT or RIGHT).
     * @return A 6-digit string representing the BIN number.
     */
    public static String BIN_NUMBER(int number, char pad, PaddingDirection direction) {
        int desiredLength = 6;
        String numberStr = String.valueOf(number);
        if (numberStr.length() >= desiredLength) {
            return numberStr;
        }
        int padCount = desiredLength - numberStr.length();
        StringBuilder padding = new StringBuilder();
        for (int i = 0; i < padCount; i++) {
            padding.append(pad);
        }
        if (direction == PaddingDirection.LEFT) {
            return padding.toString() + numberStr;
        } else {
            return numberStr + padding.toString();
        }
    }
}

