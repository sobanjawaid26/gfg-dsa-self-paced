package gfg.video_questions.arrays;

public class MaxDifference {

    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        int res = arr[1] - arr[0];
        int min = arr[0];
        for (int i = 1; i< arr.length; i++){
            res = Integer.max(res, arr[i] - min);
            min = Integer.min(min, arr[i]);
        }
        System.out.println(res);
    }
}
