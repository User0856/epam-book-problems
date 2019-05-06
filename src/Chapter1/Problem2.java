package Chapter1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("insert String: ");
        String s1 = cs.nextLine();
        String s2 = cs.nextLine();

        if(analyze(s1, s2)){
            System.out.println("Strings have same charset");
        } else {
            System.out.println("Strings have different charset");
        }



    }

    public static boolean analyze(String string1, String string2){
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2= new HashMap<>();
        char[] charArray = string1.toCharArray();
        for (char c : charArray) {
            if(hashMap1.containsKey(c)){
                hashMap1.put(c, hashMap1.get(c)+1);
            } else {
                hashMap1.put(c, 1);
            }
        }
        charArray = string2.toCharArray();
        for (char c : charArray) {
            if(hashMap2.containsKey(c)){
                hashMap2.put(c, hashMap1.get(c)+1);
            } else {
                hashMap2.put(c, 1);
            }
        }


        if(hashMap1.equals(hashMap2)){
            return true;
        }

        return false;
    }

}
