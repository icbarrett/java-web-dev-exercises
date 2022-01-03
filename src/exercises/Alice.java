package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
    String firstLine = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or " +
                "conversation?";

    String lowerCaseText = firstLine.toLowerCase();
    System.out.println(lowerCaseText);

    Scanner input = new Scanner(System.in);

    System.out.println("What is your favorite term?");
    String term = input.nextLine().toLowerCase();

    Boolean searchResult = lowerCaseText.contains(term);

    System.out.println("Your search term in first sentence is " + searchResult);

    Integer index = lowerCaseText.indexOf(term);
    System.out.println("Your search term is at index " + index + "of the sentence.");

    Integer termLength = term.length();
    System.out.println("The length of your term in " + termLength);

    String newString = lowerCaseText.replace(term, "");
    System.out.println(newString);


    }
}
