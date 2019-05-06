package Chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("insert String: ");
        String s = cs.nextLine();

        if(analyze(s)){
            System.out.println("All characters are unique");
        } else {
            System.out.println("Not all characters are unique");
        }

        if(analyzeWithoutDataStructures(s)){
            System.out.println("All characters are unique");
        } else {
            System.out.println("Not all characters are unique");
        }


    }

    public static boolean analyze(String string){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            hashMap.put(c, 0);
        }

        if(hashMap.size()==string.length()){
            return true;
        }
        return false;
    }


    public static boolean analyzeWithoutDataStructures(String string){

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                 if(i!=j && string.charAt(i)==string.charAt(j)){
                     return false;
                 }
            }
        }
        return true;
    }



}
