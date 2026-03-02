/**
 * OOPSBannerApp UC5 - Banner Display Application
 *
 * Refactoring Note:
 * This iteration introduces inline array initialization. By combining the 
 * array declaration and the String.join() method calls in a single statement,
 * we eliminate repetitive assignment lines, making the code much more concise.
 *
 * @author Nafees
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // UC5: Combine array declaration and initialization with String.join()
        String[] bannerLines = new String[] {
        String.join("", "    ***    " , "    ***    " , " *******    "   , "    ***** "),
        String.join("", "  **   **  " , "  **   **  " , " **     **  "   , "  **      "),
        String.join("", " **     ** " , " **     ** " , " **      ** "   , "**        "),
        String.join("", " **     ** " , " **     ** " , " **     **  "   , " **       "),
        String.join("", " **     ** " , " **     ** " , " *******    "   , "   ***    "),
        String.join("", " **     ** " , " **     ** " , " **         "   , "      **  "),
        String.join("", " **     ** " , " **     ** " , " **         "   , "       ** "),
        String.join("", "  **   **  " , "  **   **  " , " **         "   , "     **   "),
        String.join("", "    ***    " , "    ***    " , " **         "   , "*****     ")
        };

        // Enhanced for-loop to iterate through the array and display the pattern
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}