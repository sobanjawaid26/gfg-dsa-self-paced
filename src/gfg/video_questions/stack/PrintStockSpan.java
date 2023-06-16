package gfg.video_questions.stack;

import java.util.Stack;

public class PrintStockSpan {

    static void printSpan(int arr[], int n){
        Stack s = new Stack();
        s.push(0);
        System.out.println(1);

        for (int i = 1; i< n; i++){
            while(s.isEmpty() == false && arr[(int) s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i + 1 : i - (int)s.peek();
            System.out.println(span);
            s.push(i);
        }
    }

    public static void main(String[] args) {

    }
}
