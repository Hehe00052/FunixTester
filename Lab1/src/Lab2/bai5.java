package Lab2;

public class bai5 {
    public static void main(String[] args) {
        String input = "xinchao";
        
        String firstLetter = input.substring(0, 1); // Get the first letter
        String restOfTheString = input.substring(1); // Get the rest of the string
        
        firstLetter = firstLetter.toUpperCase(); // Capitalize the first letter
        
        String result = firstLetter + restOfTheString; // Combine the strings
        
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + result);
    }
}
