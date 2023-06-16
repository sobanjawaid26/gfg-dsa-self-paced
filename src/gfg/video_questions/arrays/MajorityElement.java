package gfg.video_questions.arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {6,8,4,8,8};

        int res = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i<arr.length; i++)
            if (arr[res] == arr[i])
                count++;

        if (count <= arr.length/2)
            System.out.println(-1);
        System.out.println(res);
    }
}
