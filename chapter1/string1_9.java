public class string1_9 {

    private static boolean isSubString(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        for(int i =0; i<=n-m; i++){
            int j;
            for(j=0; j<m; j++){
                if(s2.charAt(i+j) != s1.charAt(j)){
                    break;
                }
            }
            if(j==m) return true;
        }

        return false;
    }
    
    public static void main(String[] args){
        String s1= "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isSubString(s2, s1+s1));
    }
}
