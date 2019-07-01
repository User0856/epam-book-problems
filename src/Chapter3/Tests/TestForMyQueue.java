package Chapter3.Tests;

import Chapter3.MyQueue;

import java.util.Scanner;

public class TestForMyQueue {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 6 int items for queue");
        for(int i=0; i<6; i++){
            queue.add(sc.nextInt());
        }
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());



    }


}
