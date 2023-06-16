package gfg.video_questions.arrays;

public class MaxSumOfSubarray {

    public static void main(String[] args) {

        int[] arr = {-3, 8, -2, 4, -5, 6};

        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i< arr.length;i++){
            maxEnding = Integer.max(maxEnding + arr[i], arr[i]);
            System.out.println(maxEnding);
            res = Integer.max(res, maxEnding);
            System.out.println(res);
            System.out.println();
        }
        System.out.println(res);
    }
}
