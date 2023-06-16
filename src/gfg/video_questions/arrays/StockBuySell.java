package gfg.video_questions.arrays;

public class StockBuySell {

    public static void main(String[] args) {
        int[] stockPrice = {7,1,5,3,6,4};
        int profit = 0;
        for (int i = 1; i < stockPrice.length;i++){
            if (stockPrice[i] > stockPrice[i-1]) {
                profit += stockPrice[i] - stockPrice[i - 1];
            }
        }
        System.out.println(profit);
    }
}
