package Chapter1;

import java.util.Iterator;
import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            String s = sc.nextLine();
            System.out.println(compress(s));
        }


    }

    public static String compress(String s){
        String compressed;
        StringBuilder builder = new StringBuilder();
        int count  = 1;

        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-1){
                builder.append(s.charAt(i));
                compressed = builder.toString();
                if(compressed.length() == s.length()){
                    return s;
                } else {
                    return compressed;
                }

            }
            if(s.charAt(i)==s.charAt(i+1)){
                Character duplicated = s.charAt(i);
                int j = i+1;
                count++;
                while (j<s.length()-1 && s.charAt(j+1)==duplicated){
                    j++;
                    count++;
                    if(j>s.length()){
                        break;
                    }
                }

                builder.append("" + count + duplicated);
                i = j;

            } else {
//                if(i==1){
//                    builder.append(s.charAt(i-1));
//                }

                builder.append(s.charAt(i));
            }
            count=1;
        }

        compressed = builder.toString();
        if(compressed.length() == s.length()){
            return s;
        } else {
            return compressed;
        }
    }


}
