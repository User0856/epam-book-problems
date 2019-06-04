package Chapter2;


/*
Solutions for problems 2.3, 2.3
Implemented in class CustomLinkedList
 */

public class CustomLinkedList {

    public int size = 0;
    public Node head;
    public class Node {
        public Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        size++;
    }
//for problem 2.2
    public Node getFromEnd(int k){

        Node temp = head;
        for (int i = 0; i < size-k; i++) {
             temp = temp.next;
        }
        return temp;

    }

//for problem 2.3
    public void delete(int d) {
        Node temp = head;
        boolean isHead = false;
        if (temp.data == d) {
            isHead = true;
            head = head.next;
        }
        else {
            Node temp2 = head;
            while (temp != null) {
                if (temp.data == d) {
                    isHead = false;
                    break;
                }
                temp2 = temp;
                temp = temp.next;
            }
            if (isHead) {
                temp2.next = temp.next;
            }
        }
        size--;
    }


    public void add(Object object) {
        Node last = null;
        Node temp = head;
        if(size==1){
           temp = new Node((int)object);
           head = temp;
        } else {
            try{
                while (temp.next != null) {
                    temp = temp.next;
                }
                last = temp;
                Node newLast = (Node) object;
                last.next = newLast;
            } catch (NullPointerException e) {
                System.out.println("null pointer...");
            }

        }



    }


    public int get(int index) {
        int count = 0;
        Node result = head;
        if(index==0){
            return head.data;
        }
        while(count!=index && index<size){
            result = result.next;
            count++;
        }
        if(count==index){
            return result.data;
        } else{
            System.out.println("there is no such index in List");
        }
        return 0;

    }

    public void add(int index, Object object) {
        Node temp = head;
        Node tempPrev = head;
        int count = 0;
        if(index==0){
            Node newHead = new Node((int)object);
            newHead.next = head;
            head = newHead;
        } else{
            while(index!=count && index<size){
                tempPrev = temp;
                temp = temp.next;
                count++;
            }
            Node newNode = new Node((int)object);
            tempPrev.next = newNode;
            newNode.next = temp;
        }


    }

}