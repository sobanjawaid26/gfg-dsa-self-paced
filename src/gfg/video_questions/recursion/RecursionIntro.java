package gfg.video_questions.recursion;

public class RecursionIntro {

    static void func1(){
        System.out.println("Func1");
    }

    static void func2(){
        System.out.println("Before Func1");
        func1();
        System.out.println("After Func1");
    }
    public static void main(String[] args) {
        System.out.println("Before Func2");
        func2();
        System.out.println("After Func2");
    }
}
