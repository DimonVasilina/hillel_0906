package hw34Stream;

import java.util.stream.Collectors;

public class StreamSotring {


    public static void main(String[] args) {
        String eng = "ealgbkjdfvbjkhfdkbljvd";
        sortedLetters(eng);
    }

    public static void sortedLetters (String input) {
        String sortedLetters = input.chars()
                .mapToObj(c -> (char) c)
                //.distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(sortedLetters);
    }
}


