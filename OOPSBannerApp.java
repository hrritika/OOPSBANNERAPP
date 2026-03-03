/**
 * OOPSBannerApp UC6 - Banner Display Application
 *
 * Refactoring Note:
 * This iteration introduces static helper methods to encapsulate the ASCII 
 * patterns for individual characters (O, P, S). This adheres to the DRY 
 * (Don't Repeat Yourself) principle and improves modularity and reuse.
 *
 * @author Nafees
 * @version 6.0
 */
public class OOPSBannerApp {

    // Helper method to generate the letter 'O'
    public static String[] getO() {
        return new String[] {
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "    ***    "
        };
    }

    // Helper method to generate the letter 'P'
    public static String[] getP() {
        return new String[] {
            " *******    ",
            " **     **  ",
            " **      ** ",
            " **     **  ",
            " *******    ",
            " **         ",
            " **         ",
            " **         ",
            " **         "
        };
    }

    // Helper method to generate the letter 'S'
    public static String[] getS() {
        return new String[] {
            "    ***** ",
            "  **      ",
            "**        ",
            " **       ",
            "   ***    ",
            "      **  ",
            "       ** ",
            "     **   ",
            "*****     "
        };
    }

    public static void main(String[] args) {
        // Retrieve the character patterns from our static methods
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // UC6: Build the banner by combining the array lines
        String[] bannerLines = new String[] {
            String.join("", o[0], o[0], p[0], s[0]),
            String.join("", o[1], o[1], p[1], s[1]),
            String.join("", o[2], o[2], p[2], s[2]),
            String.join("", o[3], o[3], p[3], s[3]),
            String.join("", o[4], o[4], p[4], s[4]),
            String.join("", o[5], o[5], p[5], s[5]),
            String.join("", o[6], o[6], p[6], s[6]),
            String.join("", o[7], o[7], p[7], s[7]),
            String.join("", o[8], o[8], p[8], s[8])
        };

        // Enhanced for-loop to display the final stitched pattern
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}