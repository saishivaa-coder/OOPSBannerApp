/**
 * UC7 - OOPS Banner Application
 * Demonstrates encapsulation of character patterns using an inner static class.
 */
public class UC7_OOPS_Banner {

    /**
     * Inner Static Class that encapsulates
     * a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         *
         * @param character the character represented
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to retrieve character.
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to retrieve character pattern.
         *
         * @return 7-line string pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Main method to assemble and print OOPS banner.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap objects
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[]{
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        // Array of CharacterPatternMap objects for OOPS
        CharacterPatternMap[] word = {
                letterO, letterO, letterP, letterS
        };

        // Assemble banner using StringBuilder
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                lineBuilder.append(cp.getPattern()[i]).append(" ");
            }

            banner[i] = lineBuilder.toString();
        }

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
