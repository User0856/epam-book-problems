package Chapter3;

import java.util.EmptyStackException;

public class StackInside<T> {

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;


        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> bottom;
    private StackNode<T> top;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void linkToNext(StackInside st){
        this.top.next = st.bottom;
    }

    public T pop () {
        if (top==null){
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public void push(T item){
        StackNode<T> t = new StackNode<>(item);
        if(top==null){
            bottom = t;
        }
        t.next = top;
        top = t;
        size++;
    }

    public T peek() {
        if (top==null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }


}
