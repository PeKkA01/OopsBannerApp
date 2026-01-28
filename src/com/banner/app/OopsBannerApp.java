package com.banner.app;

/**
 * UC7: Store Character Pattern in a Class
 * Uses a dedicated class to encapsulate
 * character banner patterns.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        });

        CharacterPattern sPattern = new CharacterPattern(new String[]{
                " ***** ",
                "*       ",
                " ***** ",
                "       *",
                "       *",
                "       *",
                " ***** "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("  ",
                    oPattern.getLine(i),
                    oPattern.getLine(i),
                    pPattern.getLine(i),
                    sPattern.getLine(i)
            ));
        }
    }

    /**
     * UC7 Helper Class to store banner pattern
     */
    static class CharacterPattern {

        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }
}
