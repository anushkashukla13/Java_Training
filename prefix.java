// Longest Common Prefix.

import java.util.*;

public class prefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of strings
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        // Take strings input
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Call function
        String result = longestCommonPrefix(strs);

        // Output
        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}