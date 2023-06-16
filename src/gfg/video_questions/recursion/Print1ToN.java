package gfg.video_questions.recursion;

public class Print1ToN {

    static void print1ToN(int n){
        if (n == 0)
            return;
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print1ToN(10);
    }
}
