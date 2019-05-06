package Chapter1;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("insert String: ");
        String s1 = cs.nextLine();
        String s2 = cs.nextLine();
        System.out.println(compare(s1, s2));


    }

    public static String compare(String s1, String s2){
        int minLength = 0;
        if(s1.length()<s2.length()){
            minLength = s1.length();
        } else{
            minLength = s2.length();
        }

        int count = 0;
        if(Math.abs(s1.length()-s2.length())>1){
            return "Strings are more then 1 modification away";
        } else if((Math.abs(s1.length()-s2.length())==1)){
            count++;
        }
        for (int i = 0; i < minLength; i++) {
             if(s1.charAt(i)!=s2.charAt(i)){
                 count++;
             }
        }
        if(count>1){
            return "Strings are more then 1 modification away";
        }

        return "Strings are 1 or less modifications away";
        
    }





}
