package gfg.video_questions.recursion;

public class PalindromeString {

    static boolean isPalindrome(String str, int start, int end){
        if(start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) &&
                isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        boolean isP = isPalindrome("abccbaa", 0, 6);
        System.out.println(isP);
    }
}
