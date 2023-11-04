package Basic.StringProject;

import java.util.HashSet;
import java.util.Set;

public class NonDuplicateCharactersFinder {
    public static void main(String[] args) {
        String s = "statistic";

        Set<Character> nonDuplicateChars = findNonDuplicateCharacters(s);

        System.out.println("Non-duplicate characters: " + nonDuplicateChars);
    }

    private static Set<Character> findNonDuplicateCharacters(String str) {
        Set<Character> allChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!allChars.add(c)) {
                // If it's not added to the set, it's a duplicate
                duplicateChars.add(c);
            }
        }

        // Remove duplicates from allChars, leaving non-duplicates
        allChars.removeAll(duplicateChars);

        return allChars;
    }
}

