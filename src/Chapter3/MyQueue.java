package Chapter3;

public class MyQueue<T>{

    StackInside <T> stack1 = new StackInside<>();
    StackInside <T> stack2 = new StackInside<>();

    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    public void add(T item){

        if(stack1.getSize()==0){
            for (int i = stack2.getSize(); i > 0; i--){
                stack1.push(stack2.pop());
            }
        }
        stack1.push(item);
    }

    public T removeFirst(){
        if(stack1.getSize()==0){
            for (int i = stack2.getSize(); i > 0; i--){
                stack1.push(stack2.pop());
            }
        }
        return stack1.pop();
    }

    public T removeLast(){
        if(stack2.getSize()==0){
            for (int i = stack1.getSize(); i > 0; i--){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }








}
