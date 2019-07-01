<<<<<<< Updated upstream
package Chapter3;

import java.util.EmptyStackException;

//Solution for Problem 2
public class CustomStack<T> {

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        private StackNode<T> less;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;
    private StackNode<T> min;

    public T min() {
        if(min==null) {
            throw new EmptyStackException();
        }
        return min.data;
    }

    public T pop () {
        if (top==null){
            throw new EmptyStackException();
        }
        if (top==min){
            min = min.less;
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> t = new StackNode<>(item);
        if(top==null){
            min = t;
        } else if((int)t.data<(int)min.data){
            t.less = min;
            min = t;
        }
        t.next = top;
        top = t;
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
=======
package Chapter3;

public class CustomStack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;








}
>>>>>>> Stashed changes
