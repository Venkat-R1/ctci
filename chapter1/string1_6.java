import java.util.*;

public class string1_6 {

    private static String stringCompression(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = string.toCharArray();
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                count++;
                continue;
            }
            stringBuilder.append(charArray[i]);
            stringBuilder.append(count);
            count = 1;
        }
        stringBuilder.append(charArray[string.length() - 1]);
        stringBuilder.append(count);
        if (stringBuilder.toString().length() < string.length()) {
            return stringBuilder.toString();
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(stringCompression(input));
    }
}