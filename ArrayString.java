
    // Java Program to add elements in a pre-allocated Array
import java.util.Arrays;
    public class ArrayString {
        public static void main(String[] args) {
            String[] sa = new String[7]; // Creating a new Array of Size 7
            sa[0] = "Array"; // Adding Array elements
            sa[1] = "Binary";
            sa[2] = "Constructor";
            sa[3] = "Declaration";
            sa[4] = "Extends";
            System.out.println("Original Array Elements:" + Arrays.toString(sa));
            int numberOfItems = 5;
            String newItem = "False"; // Expanding Array Elements Later
            String newItem2 ="Gig";
            sa[numberOfItems++] = newItem;
            sa[numberOfItems++] = newItem2;
            System.out.println("Array after adding two elements:" +
                    Arrays.toString(sa));
        }
    }
