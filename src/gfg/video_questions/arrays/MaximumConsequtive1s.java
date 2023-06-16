package gfg.video_questions.arrays;

public class MaximumConsequtive1s {

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1};

        int res = 0, curr = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                curr = 0;
            else {
                curr++;
                res = Integer.max(curr, res);
            }
        }
        System.out.println(res);
    }
}
