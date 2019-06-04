package Chapter2;

public class Problem6 {


    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(2);
        list1.insert(1);

        CustomLinkedList list2 = new CustomLinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.insert(2);
        list2.insert(3);

        System.out.println(checkIfPolindrom(list1));
        System.out.println(checkIfPolindrom(list2));



    }


    public static boolean checkIfPolindrom(CustomLinkedList list){

        String straight = "";
        for (int i = 0; i < list.size; i++) {
            straight = straight + list.get(i);
        }
        String reverse = "";
        for (int i = straight.length()-1; i >= 0; i--) {
            reverse = reverse + straight.charAt(i);
        }
        if(reverse.equals(straight)){
            return true;
        }
        return false;


    }





}
