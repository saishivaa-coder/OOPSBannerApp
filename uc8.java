import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - OOPS Banner Application
 * Uses HashMap for character pattern storage
 * and a reusable rendering function.
 */
public class UC8_OOPS_Banner {

    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patternMap = buildCharacterPatterns();

        // Render the word "OOPS"
        renderBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns a HashMap containing
     * banner patterns for supported characters.
     *
     * @return Map of Character to 7-line String pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        return map;
    }

    /**
     * Renders a banner word using stored character patterns.
     *
     * @param message    Word to display
     * @param patternMap Map containing character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        final int HEIGHT = 7;

        for (int row = 0; row < HEIGHT; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append(" ");
                } else {
                    // Handle unsupported characters
                    lineBuilder.append("         ").append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}
