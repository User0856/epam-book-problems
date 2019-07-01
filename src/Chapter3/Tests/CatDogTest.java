package Chapter3.Tests;

import Chapter3.CatDogQueue;

public class CatDogTest {

    public static void main(String[] args) {
        CatDogQueue queue = new CatDogQueue();

        for (int i=0; i<10; i++){
            queue.enqueue("cat");
            queue.enqueue("dog");
        }

        System.out.println("Queue is filled");

        System.out.printf("cat: " + queue.dequeueCat() + "\n");
        System.out.printf("cat: " + queue.dequeueCat() + "\n");
        System.out.printf("dog: " + queue.dequeueDog() + "\n");
        System.out.printf("cat: " + queue.dequeueCat() + "\n");
        System.out.printf("dog: " + queue.dequeueDog() + "\n");
        System.out.printf("dog: " + queue.dequeueDog() + "\n");
        System.out.printf("dog: " + queue.dequeueDog() + "\n");
        System.out.printf("dog: " + queue.dequeueDog() + "\n");
        System.out.printf("some animal: " + queue.dequeueAny() + "\n");
        System.out.printf("some animal: " + queue.dequeueAny() + "\n");
        System.out.printf("some animal: " + queue.dequeueAny() + "\n");
        System.out.printf("some animal: " + queue.dequeueAny() + "\n");
        System.out.printf("some animal: " + queue.dequeueAny() + "\n");





    }

}
