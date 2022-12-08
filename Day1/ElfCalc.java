package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElfCalc {
    public static void run() { 
        List<Integer> elves = new ArrayList<>();
        int currentElf = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("Day1\\elf_list.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("\n", "");
        
                if (line.isEmpty()) {
                    elves.add(currentElf);
                    currentElf = 0;
                } else {
                    currentElf += Integer.parseInt(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Collections.sort(elves);
        
        int sum = 0;
        for (int i = elves.size() - 3; i < elves.size(); i++) {
            sum += elves.get(i);
        }
        
        System.out.println(sum);
    }
}