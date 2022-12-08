package day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day3Part1 {
    public static void run(){
        int totalSum = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> results = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get("day3\\input.txt"))) {

            results = lines.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line: results) {

            char[] container1 = line.substring(0, (line.length()/2)).toCharArray();
            String container2 = line.substring((line.length()/2));

            for (char c1: container1) {
                if(container2.contains(String.valueOf(c1))) {
                    totalSum += alphabet.indexOf(c1) + 1;
                    break;
                    }
                }
            }

        System.out.println(totalSum);

    }
}