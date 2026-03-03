public class UC5_OOPS_Banner {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement
        String[] banner = {

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "  ****** ",
                        "  ****** "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *      "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *      "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        "  ****** ",
                        "  ***** "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " *       ",
                        "  ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
