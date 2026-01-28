package com.banner.app;

/**
 * UC5: Render OOPS as Banner using Inline Array Initialization
 * Demonstrates concise array declaration and initialization
 * using String.join() and prints using a loop.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
                String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*     *", "*      "),
                String.join("  ", "*     *", "*     *", "*     *", " ***** "),
                String.join("  ", "*     *", "*     *", " ***** ", "       *"),
                String.join("  ", "*     *", "*     *", "*       ", "       *"),
                String.join("  ", "*     *", "*     *", "*       ", "       *"),
                String.join("  ", " ***** ", " ***** ", "*       ", " ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
