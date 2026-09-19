import java.util.*;

public class GroupWords {

    static Map<Character, List<String>> groupWords(String[] words) {
        Map<Character, List<String>> groupedWords = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            char firstCharacter = Character.toLowerCase(word.charAt(0));

            groupedWords
                .computeIfAbsent(firstCharacter, key -> new ArrayList<>())
                .add(word);
        }

        return groupedWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int numberOfWords = scanner.nextInt();

        String[] words = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }

        Map<Character, List<String>> result = groupWords(words);

        System.out.println("\nGrouped words:");
        for (Map.Entry<Character, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}