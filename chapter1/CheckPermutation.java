import java.util.*;

public class CheckPermutation {

    private static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (map.containsKey(c) && map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aab";
        System.out.println("result " + check(s1, s2));
    }
}

// abc, cab