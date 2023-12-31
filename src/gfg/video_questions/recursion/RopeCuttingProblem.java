package gfg.video_questions.recursion;

public class RopeCuttingProblem {

    static int maxPieces(int n, int a, int b, int c){
        if (n == 0)
            return 0;
        if(n < 0)
            return -1;
        int res = Integer.max(
                Integer.max(
                        maxPieces(n-a, a, b, c),
                        maxPieces(n-b, a, b, c)),
                maxPieces(n-c, a, b, c)
        );
        if(res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        int res = maxPieces(23, 11,9,12);
        System.out.println(res);
    }
}
