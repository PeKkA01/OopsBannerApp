package com.banner.app;

import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 * Stores banner patterns in a Map and renders
 * the word "OOPS" dynamically.
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatternMap();
        printBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns character-to-pattern mappings.
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        });

        map.put('S', new String[]{
                " ***** ",
                "*       ",
                " ***** ",
                "       *",
                "       *",
                "       *",
                " ***** "
        });

        return map;
    }

    /**
     * Renders the banner for a given word.
     *
     * @param word the word to render
     * @param patternMap character pattern map
     */
    private static void printBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}
