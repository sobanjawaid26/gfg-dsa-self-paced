package gfg.video_questions.recursion;

public class RecursionPractice1 {

    static void func1(int n){
        if (n == 0)
            return;
        System.out.println(n);
        func1(n - 1);
        System.out.println(n);
    }

    static void func2(int n){
        if (n == 0)
            return;
        func2(n - 1);
        System.out.println(n);
        func2(n - 1);
    }

    public static void main(String[] args) {
        func1(3);
        System.out.println("-------------------------------------------------------");
        func2(3);
    }
}
