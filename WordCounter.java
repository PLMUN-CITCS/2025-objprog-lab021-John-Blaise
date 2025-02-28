import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();  

        String[] words = input.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("The number of words is: " + wordCount);
        
        scanner.close();
    }
}