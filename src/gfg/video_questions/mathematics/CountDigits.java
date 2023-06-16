package gfg.video_questions.mathematics;

public class CountDigits {
    /*
    ip - 9235
    op - 4
     */

    public static void main(String[] args) {
        int n = 9235;
        int temp = n;
        int res = 0;
        // first method
        while(temp > 0){
            temp = temp/10;
            res++;
        }
        System.out.println(res);
        // last method
        System.out.println(String.valueOf(n).length());
    }
}
