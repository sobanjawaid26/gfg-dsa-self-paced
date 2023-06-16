package gfg.video_questions.arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        int[] arr2 = {5,0,6,2,3};
        int res = trapRainWaterNaive(arr2);
        int res2 = trapRainWaterOpt(arr2);

        System.out.println(res);
        System.out.println(res2);
    }

    static int trapRainWaterOpt(int[] arr){
        int n = arr.length;
        int res = 0;
        int lMax[] = new int[n], rMax[] = new int[n];

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++){
            lMax[i] = Integer.max(arr[i], lMax[i - 1]);
            // {5,5,6,6,6}
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--){
            rMax[i] = Integer.max(arr[i], rMax[i + 1]);
            // {6,6,6,3,3}
        }
        for (int i = 1; i< n-1; i++){
            res = res + (Integer.max(lMax[i], rMax[i]) - arr[i]);
        }
        return res;
    }

    static int trapRainWaterNaive(int[] arr){
        int res = 0;
        for (int i = 1; i< arr.length - 1; i++){
            int lMax = arr[i];
            for (int j = 0; j<i; j++){
                lMax = Integer.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i+1;j<arr.length;j++){
                rMax = Integer.max(rMax, arr[j]);
            }
            res = res + (Integer.min(lMax,rMax) - arr[i]);
        }
        return res;
    }
}
