package gfg.video_questions.recursion;

public class RecursionPractice2 {

    static int func(int n){
        if (n == 1)
            return 0;
        else
            return 1 + func(n / 2);
    }

    public static void main(String[] args) {
        int res = func(16);
        System.out.println(res);
    }
}
