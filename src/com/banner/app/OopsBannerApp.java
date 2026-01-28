package com.banner.app;

/**
 * UC3: Render OOPS as Banner using String.join()
 * Refactors UC2 by replacing string concatenation
 * with String.join() for better readability and efficiency.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** "
        ));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*      "
        ));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        ));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                " ***** ",
                "       *"
        ));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*       ",
                "       *"
        ));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*       ",
                "       *"
        ));

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                "*       ",
                " ***** "
        ));
    }
}
