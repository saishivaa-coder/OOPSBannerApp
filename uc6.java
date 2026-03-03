public class UC6_OOPS_Banner {

    public static void main(String[] args) {

        // Get patterns for each character
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble banner using method calls during initialization
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
}
