import java.util.*;

public class krotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int k= 0;
        String s = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
            int digit = Character.getNumericValue(ch);
            k = k + digit * digit;
            }
            if(Character.isAlphabetic(ch)){
            s = s + ch;
        }
        }
        int m = s.length();
        if(k>m){

            k=k%m;
        }
        if(k%2==0){
            System.out.println(s.substring(m-k) + s.substring(0,m-k));
        }
        else{
            System.out.println(s.substring(k) + s.substring(0,k));
        }
    }
}