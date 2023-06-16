package gfg.video_questions.stack;

public class StackImplementationUsingArray {

    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(5);
        s.push(15);
        s.push(25);
        //System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}

class MyStack {
    int[] arr;
    int capacity;
    int top;
    void push(int val){
        top++;
        arr[top] = val;
    }

    int peek(){
        return 1;
    }

    int pop(){
        int res = arr[top];
        top--;
        return res;
    }
    int size(){
        return top + 1;
    }
    boolean isEmpty(){
        return (top == -1);
    }
    MyStack(int c){
        top = -1;
        capacity = c;
        arr = new int[capacity];
    }
    MyStack(){}
}
