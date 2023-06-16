package gfg.video_questions.mathematics;

public class PalindromeNumbers {

    public static void main(String[] args) {
        int num = 78987;
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int q = temp % 10;
            rev = rev * 10 + q;
            temp = temp / 10;
        }
        if(rev == num)
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }
}
