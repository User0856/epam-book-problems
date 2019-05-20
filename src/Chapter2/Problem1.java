package Chapter2;

import java.util.LinkedList;

public class Problem1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println("Initial:");
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i!=j && list.get(i)==list.get(j)){
                    list.remove(j);
                }

            }

        }


        System.out.println("with removed duplicates:");
        System.out.println(list);





    }




}
