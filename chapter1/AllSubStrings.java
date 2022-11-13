import java.util.*;

public class AllSubStrings {
    
    private static List<String> getSubStrings(String s1){
        List<String> subStrings = new ArrayList<>();
        int n = s1.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                subStrings.add(s1.substring(i, j+1));
            }
        }
        System.out.println(subStrings);
        return subStrings;
    }

    public static void main(String[] args){
        getSubStrings("word");
    }
}
