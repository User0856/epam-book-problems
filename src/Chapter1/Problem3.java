package Chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("insert String: ");
        String s = cs.nextLine();

        System.out.println(replace(s));


    }

    public static String replace(String string){

        int count = 0;
        for (int i=0; i<string.length(); i++){
            if(string.charAt(i)==' '){
                count++;
            }
        }
        char[] charArray = new char[string.length()+count*2];

        for (int i=1, j=0; i<string.length(); i++){
            if(string.charAt(i-1)!=' '){
                charArray[j]=string.charAt(i-1);
                j++;
            } else if(string.charAt(i-1)==' ' && string.charAt(i)!=' '){
                charArray[j]='%';
                charArray[j+1]='2';
                charArray[j+2]='0';
                j=j+3;
            } else if(string.charAt(i-1)==' ' && string.charAt(i)==' '){
                i++;
                j++;
            }
        }

        String s1 = new String(charArray);
        return s1;

    }

}
