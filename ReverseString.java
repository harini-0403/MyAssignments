package week1.day4;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Testleaf";   // given string
        char[] charArray = input.toCharArray(); // convert to char array

        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
