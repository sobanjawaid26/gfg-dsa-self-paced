package gfg.video_questions.recursion;

public class SumOfDigits {

    static int getSum(int n){
        if(n == 0)
            return 0;
        else
            return getSum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int sum = getSum(12345);
        System.out.println(sum);
    }
}
