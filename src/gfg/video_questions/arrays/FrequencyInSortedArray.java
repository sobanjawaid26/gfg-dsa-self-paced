package gfg.video_questions.arrays;

public class FrequencyInSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30, 30};
        int count = 1;
        for (int i = 1; i< arr.length; i++){
            if(arr[i -1] != arr[i]){
                System.out.println(arr[i - 1] + " : " + count);
                count = 1;
            } else {
                count++;
            }

            if(i == arr.length - 1)
                System.out.println(arr[i] + " : " + count);
        }
    }
}
