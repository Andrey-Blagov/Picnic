import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
    public static String findLongestWord(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        String longestWord = "";

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        reader.close();
        return longestWord;
    }
}
