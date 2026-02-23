/**
 * OOPSBannerApp UC3 - Banner Display Application
 *
 * This class demonstrates the creation of a visual banner displaying the word "OOPS"
 * using ASCII art composed of asterisks (*) and spaces.
 *
 * Refactoring Note:
 * This version replaces string concatenation (+) with String.join() for better
 * memory efficiency and cleaner code structure.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // UC3: Print "OOPS" using String.join() for efficiency
        
        // Line 1
        System.out.println(String.join("", "    ***    " , "    ***    " , " *******    "   , "    ***** "));
        
        // Line 2
        System.out.println(String.join("", "  **   **  " , "  **   **  " , " **     **  "   , "  **      "));
        
        // Line 3
        System.out.println(String.join("", " **     ** " , " **     ** " , " **      ** "   , "**        "));
        
        // Line 4
        System.out.println(String.join("", " **     ** " , " **     ** " , " **     **  "   , " **       "));
        
        // Line 5
        System.out.println(String.join("", " **     ** " , " **     ** " , " *******    "   , "   ***    "));
        
        // Line 6
        System.out.println(String.join("", " **     ** " , " **     ** " , " **         "   , "      **  "));
        
        // Line 7
        System.out.println(String.join("", " **     ** " , " **     ** " , " **         "   , "       ** "));

        //Line 8
        System.out.println(String.join("", "  **   **  " , "  **   **  " , " **         "   , "     **   "));

        //Line 9
        System.out.println(String.join("", "    ***    " , "    ***    " , " **         "   , "*****     "));
    }
}