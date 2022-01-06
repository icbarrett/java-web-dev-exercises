package exercises;

import org.launchcode.java.demos.lsn7interfaces.Ingredient;

import java.util.*;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<> (
                Arrays.asList(
                        1,
                        244,
                        3,
                        455,
                        5,
                        67,
                        7,
                        83,
                        94,
                        10
                        )
        );

//        System.out.println(sumEven(numList));

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("hello",
                "Mom",
                "Daddy",
                "kids",
                "pools",
                "snowy",
                "winter",
                "sledding",
                "sunny"
                )
        );

//        fiveWords(words);
        System.out.println("Enter the length of the word you are looking for:");
        int wordLength = input.nextInt();
        fiveWords(words, wordLength);




    }



    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0){
                total += i;
            }
        }
        return total;
    }

    public static void fiveWords(ArrayList<String> words, int length){
        for(String word: words){
            if (word.length() == length) {
                System.out.println(word);
            }
        }

    }



}
