import java.io.*;
import java.util.*;

public class wordCompositionProblem {
    

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        System.out.println("Enter words alphabetically sorted:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> dictionary = new HashSet<>();
        List<String> sortedWords = new ArrayList<>();
        String line;
        while (!(line = reader.readLine()).equals("")) {
            dictionary.add(line.trim());
            sortedWords.add(line.trim());
        }
        sortedWords.sort((a, b) -> Integer.compare(b.length(), a.length()));
        String lcw = null, secondlcw = null;
        for (String word : sortedWords) {
            if (isCompoundWord(word, dictionary)) {
                if (lcw == null) {
                    lcw = word;
                } else if (secondlcw == null) {
                    secondlcw = word;
                    break;
                }
            }
        }
        System.out.println("Longest compounded word: " + (lcw != null ? lcw : "None"));
        System.out.println("Second longest compounded word: " + (secondlcw != null ? secondlcw : "None"));
        long endTime = System.nanoTime();
        System.out.printf("Time taken: %.6f seconds%n", (endTime - startTime) / 1e9);
    }
    private static boolean isCompoundWord(String word, Set<String> dictionary) {
        int length = word.length();
        for (int i = 1; i < length; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if (dictionary.contains(prefix) && 
                (dictionary.contains(suffix) || isCompoundWord(suffix, dictionary))) {
                return true;
            }
        }
        return false;
    }

}
