package com.banner.app;

/**
 * UC4: Render OOPS as Banner using String Array and Loop
 * Stores banner lines in a String array and
 * prints them using a loop for better modularity.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = new String[7];

        bannerLines[0] = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** "
        );

        bannerLines[1] = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*      "
        );

        bannerLines[2] = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        );

        bannerLines[3] = String.join("  ",
                "*     *",
                "*     *",
                " ***** ",
                "       *"
        );

        bannerLines[4] = String.join("  ",
                "*     *",
                "*     *",
                "*       ",
                "       *"
        );

        bannerLines[5] = String.join("  ",
                "*     *",
                "*     *",
                "*       ",
                "       *"
        );

        bannerLines[6] = String.join("  ",
                " ***** ",
                " ***** ",
                "*       ",
                " ***** "
        );

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
