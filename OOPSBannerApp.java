import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Store Character Pattern using Map
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create Map of character patterns
    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] space = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        map.put('O', O);
        map.put('P', P);
        map.put('S', S);
        map.put(' ', space);

        return map;
    }

    // Get pattern using Map
    public static String[] getCharacterPattern(char ch, Map<Character, String[]> map) {

        if (map.containsKey(ch)) {
            return map.get(ch);
        }

        return map.get(' ');
    }

    // Print banner message
    public static void printMessage(String message, Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);

                String[] pattern = getCharacterPattern(ch, map);

                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> map = createCharacterPatternMap();

        String message = "OOPS";

        printMessage(message, map);
    }
}