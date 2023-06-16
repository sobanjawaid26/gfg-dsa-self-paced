package gfg.video_questions.mathematics;

public class TrailingZeroesInFactorial {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int countZero = 0;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        while(fact % 10 == 0){
            countZero++;
            fact = fact / 10;
        }
        System.out.println(countZero);
    }
}
