/**
 * OOPSBannerApp UC4 - Banner Display Application
 *
 * This class demonstrates the creation of a visual banner displaying the word "OOPS"
 * using ASCII art.
 *
 * Refactoring Note:
 * This version stores the banner lines in a String array and uses an enhanced for-loop
 * to print them. This improves modularity and makes the code easier to maintain.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // UC4: Store lines in an array and use a loop to print
        
        String[] bannerLines = {
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

        // Enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}