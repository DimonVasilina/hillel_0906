package hw34;

import java.util.stream.Collectors;

public class StreamSotring {


    public static void main(String[] args) {
        String eng = "ealgbkjdfvbjkhfdkbljvd";
        printSortedLetters(eng);
    }

    public static void printSortedLetters(String input) {
        String sortedLetters = input.chars()
                .mapToObj(c -> (char) c)
                //.distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(sortedLetters);
    }
}


