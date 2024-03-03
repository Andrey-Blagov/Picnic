import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Задание 1: Подсчет количества слов
            int wordCount = WordCount.countWords("input.txt");
            System.out.println("Количество слов в файле: " + wordCount);

            // Задание 2: Нахождение самого длинного слова
            String longestWord = LongestWord.findLongestWord("input.txt");
            System.out.println("Самое длинное слово в файле: " + longestWord);

            // Задание 3: Вычисление частоты слов
            Map<String, Integer> wordFrequencyMap = WordFrequency.calculateWordFrequency("input.txt");
            System.out.println("Частота слов в файле: " + wordFrequencyMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
