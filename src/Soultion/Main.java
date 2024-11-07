package Soultion;

import static java.lang.System.out;

public class Main
{
    public static void main(String[] args)
    {
        /**
         * Generics:
         * Enables types (classes and interfaces) to be parameters when defining 
         * classes, interfaces, and methods.
         * 
         * A benefit is to eliminate the need to create multiple versions of
         * methods or classes for various data types. Use ONE version for all
         * reference data types.
         */
        
        // Initializing different arrays with different types of elements
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};
        
        // Displaying the content of each array using the displayArray method
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        
        // Adding a blank line for better output formatting
        out.println();
        
        // Getting and displaying the first element of each array using the getFirst method
        out.println(getFirst(intArray));
        out.println(getFirst(doubleArray));
        out.println(getFirst(charArray));
        out.println(getFirst(stringArray));
    }
    
    /**
     * A generic method that prints the elements of an array of any reference type.
     * 
     * @param <ArrayOfThings>
     * @param array The array to display
     */
    public static <ArrayOfThings> void displayArray(ArrayOfThings[] array)
    {
        // Loop through the array and print each element
        for (ArrayOfThings x : array)
        {
            out.print(
                    x + " "
            );
        }
        
        // Print a newline after displaying all elements of the array
        out.println();
    }
    
    /**
     * A generic method that returns the first element of an array of any reference type.
     * 
     * @param <ArrayOfThings>
     * @param array The array from which to get the first element
     * @return The first element of the array
     */
    public static <ArrayOfThings> ArrayOfThings getFirst(ArrayOfThings[] array)
    {
        // Return the first element of the array
        return array[0];
    }
}
