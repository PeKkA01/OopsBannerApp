package com.banner.app;

/**
 * UC6: Refactor Banner Logic into Methods
 * Banner creation logic is moved into helper methods
 * to improve modularity, reusability, and readability.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = buildOOPSBanner();

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Builds and returns the OOPS banner lines.
     *
     * @return String array representing OOPS banner
     */
    private static String[] buildOOPSBanner() {

        return new String[] {
                String.join("  ", getOPattern()[0], getOPattern()[0], getPPattern()[0], getSPattern()[0]),
                String.join("  ", getOPattern()[1], getOPattern()[1], getPPattern()[1], getSPattern()[1]),
                String.join("  ", getOPattern()[2], getOPattern()[2], getPPattern()[2], getSPattern()[2]),
                String.join("  ", getOPattern()[3], getOPattern()[3], getPPattern()[3], getSPattern()[3]),
                String.join("  ", getOPattern()[4], getOPattern()[4], getPPattern()[4], getSPattern()[4]),
                String.join("  ", getOPattern()[5], getOPattern()[5], getPPattern()[5], getSPattern()[5]),
                String.join("  ", getOPattern()[6], getOPattern()[6], getPPattern()[6], getSPattern()[6])
        };
    }

    /**
     * Returns banner pattern for letter O
     */
    private static String[] getOPattern() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    /**
     * Returns banner pattern for letter P
     */
    private static String[] getPPattern() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    /**
     * Returns banner pattern for letter S
     */
    private static String[] getSPattern() {
        return new String[] {
                " ***** ",
                "*       ",
                " ***** ",
                "       *",
                "       *",
                "       *",
                " ***** "
        };
    }
}
