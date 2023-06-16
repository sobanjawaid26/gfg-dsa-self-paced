package gfg.video_questions.recursion;

public class NaturalNumSum {

    static int sumNaturalNum(int n) {
        if(n <= 1)
            return n;
        return n + sumNaturalNum(n - 1);
    }

    public static void main(String[] args) {
        int sum = sumNaturalNum(5);
        System.out.println(sum);
    }
}
