import java.util.*;
public class permutations {
    public static void findPermutation(String str, String ans){
        //base case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i=0; i<str.length(); i++){
            char cur = str.charAt(i);  //remove character
            String Newstr = str.substring(0, i) +str.substring(i+1);
            findPermutation(Newstr, ans + cur);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findPermutation(str, "");
    }
}