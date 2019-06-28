package Chapter3;

import java.util.ArrayList;

public class SetOfStacks<T> {

    ArrayList<StackInside> list = new ArrayList<>();
    StackInside topStack;

    public void push(T item){
        if (list.size()==0){
            list.add(new StackInside());
            topStack = list.get(0);
        }
        if(topStack.getSize()<10){
            topStack.push(item);
        } else if(topStack.getSize()==10){
            list.add(new StackInside());
            topStack = list.get(list.size()-1);
            topStack.push(item);
            list.get(list.size()-2).linkToNext(list.get(list.size()-1));
        }
    }

    public T pop(){

        if(topStack.getSize()==0){
            list.remove(list.size()-1);
            topStack = list.get(list.size()-1);
        }
        return (T) topStack.pop();

    }

}
