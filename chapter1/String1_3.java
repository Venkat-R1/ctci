import java.util.*;

public class String1_3 {

    private static String encode(String string, int bound) {
        char[] charArray = string.toCharArray();
        int space = countSpace(charArray, bound);
        for (int i = bound - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                charArray[i + space * 2] = charArray[i];
                continue;
            }
            int start = i + (--space * 2);
            charArray[start++] = '%';
            charArray[start++] = '2';
            charArray[start] = '0';
        }

        return String.valueOf(charArray);
    }

    private static int countSpace(char[] charArray, int bound) {
        int count = 0;
        for (int i = 0; i < bound - 1; i++) {
            if (charArray[i] == ' ')
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String value = "Mr John Smith is good        ";
        int bound = 21;
        System.out.println(encode(value, bound));
    }
}
