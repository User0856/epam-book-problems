package Chapter2;

public class Problem5 {

    public static void main(String[] args) {

        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList list2 = new CustomLinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        System.out.println("List 1:");
        for (int i = 0; i < list1.size; i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\nList 2:");
        for (int i = 0; i < list1.size; i++) {
            System.out.print(list2.get(i)+" ");
        }
        System.out.println("\nSum when reverse order: ");
        System.out.println(calculateIfReverse(list1, list2));


        System.out.println("Sum when straight order: ");
        System.out.println(calculate(list1, list2));

    }

    public static int calculateIfReverse(CustomLinkedList list1, CustomLinkedList list2){

        int number1 = 0;
        String temp1 = "";
        for (int i = 0; i < list1.size; i++) {
            temp1 = temp1 + list1.get(i);
        }
        String reverse = "";
        for (int i = temp1.length()-1; i >= 0; i--) {
            reverse = reverse + temp1.charAt(i);
        }
        number1 = Integer.parseInt(reverse);

        int number2 = 0;
        temp1 = "";
        for (int i = 0; i < list2.size; i++) {
            temp1 = temp1 + list2.get(i);
        }
        reverse = "";
        for (int i = temp1.length()-1; i >= 0; i--) {
            reverse = reverse + temp1.charAt(i);
        }
        number2 = Integer.parseInt(reverse);

        return number1+number2;

    }

    public static int calculate(CustomLinkedList list1, CustomLinkedList list2){

        int number1 = 0;
        String temp1 = "";
        for (int i = 0; i < list1.size; i++) {
            temp1 = temp1 + list1.get(i);
        }

        number1 = Integer.parseInt(temp1);

        int number2 = 0;
        temp1 = "";
        for (int i = 0; i < list2.size; i++) {
            temp1 = temp1 + list2.get(i);
        }

        number2 = Integer.parseInt(temp1);

        return number1+number2;

    }


}
