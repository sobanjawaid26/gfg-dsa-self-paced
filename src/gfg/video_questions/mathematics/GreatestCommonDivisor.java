package gfg.video_questions.mathematics;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 12, b = 15;
        while(a != b){
            System.out.println(a + " - " + b);
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println(a);
    }
}
