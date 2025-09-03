package week1.day4;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Testleaf";  
        char[] charArray = input.toCharArray(); 
        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
