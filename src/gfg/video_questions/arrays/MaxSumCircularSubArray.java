package gfg.video_questions.arrays;

public class MaxSumCircularSubArray {

    public static void main(String[] args) {
        int[] arr = {8,-4, 3, -5, 4};
        int res = overallSum(arr);
        System.out.println(res);
    }

    static int overallSum(int[] arr){
        int maxNormal = normalMaxSum(arr);
        if (maxNormal < 0)
            return maxNormal;

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++){
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + normalMaxSum(arr);
        return Integer.max(maxNormal, maxCircular);
    }

    static int normalMaxSum(int[] arr){
        int res = arr[0], maxEnding = arr[0];
        for (int i = 1; i< arr.length;i++){
            maxEnding = Integer.max(maxEnding + arr[i], arr[i]);
            res = Integer.max(res, maxEnding);
        }
        return res;
    }
}
