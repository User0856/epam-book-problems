package Chapter3;

import java.util.Deque;
import java.util.LinkedList;

public class CatDogQueue {

    private static class Animal{
        private String type;

        public int getId() {
            return id;
        }

        private int id;

        public Animal(String type){
            this.type = type;
        }
        private Animal next;
        private Animal prev;
    }

    private int catID = 0;
    private int dogID = 0;

    private LinkedList<Animal> cats = new LinkedList<>();
    private LinkedList<Animal> dogs = new LinkedList<>();
    private Animal head;

    public void enqueue(String type){
        Animal animal = new Animal(type);
        if(animal.type=="cat"){
            cats.add(animal);
            animal.id=catID++;
        } else if(animal.type=="dog"){
            dogs.add(animal);
            animal.id=dogID++;
        }
    }


    public int dequeueCat(){
        return cats.pollFirst().id;
    }

    public int dequeueDog() {
        return dogs.pollFirst().id;
    }

    public int dequeueAny(){
        if(cats.peekFirst().id<dogs.peekFirst().id){
            return cats.pollFirst().id;
        } else {
            return dogs.pollFirst().id;
        }
    }


}
