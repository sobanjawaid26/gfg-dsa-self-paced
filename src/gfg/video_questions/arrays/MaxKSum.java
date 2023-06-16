package gfg.video_questions.arrays;

public class MaxKSum {

    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int n = arr.length;
        int k = 3;

        int curr = 0;
        for (int i = 0; i < k; i++)
            curr += arr[i];
        int res = curr;
        for (int i = k; i < n; i++){
            curr = curr + arr[i] - arr[i - k];
            res = Integer.max(res, curr);
        }
        System.out.println(res);
    }
}
