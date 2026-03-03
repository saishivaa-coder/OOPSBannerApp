public class UC4_OOPS_Banner {

    public static void main(String[] args) {

        // Step 1: Create a String array to store all 7 lines
        String[] banner = new String[7];

        // Step 2: Populate the array using String.join()

        banner[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  ****** ");

        banner[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *      ");

        banner[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *      ");

        banner[3] = String.join(" ",
                " *     * ",
                " *     * ",
                "  ****** ",
                "  ***** ");

        banner[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        banner[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        banner[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  ***** ");

        // Step 3: Use enhanced for-loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
