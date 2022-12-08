package day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3Part2 {
    public static void run(){
        int totalSum = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> results = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get("day3\\input.txt"))) {

            results = lines.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> elfGroup = new ArrayList<>();
        int counter = 0;

        for (String line: results) {

            elfGroup.add(line);
            counter++;

            if (counter == 3) {
                // compare 3 list items for common character
                // add to total sum

            }
        }

        System.out.println(totalSum);

    }
}