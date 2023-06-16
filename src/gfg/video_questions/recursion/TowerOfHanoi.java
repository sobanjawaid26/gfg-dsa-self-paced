package gfg.video_questions.recursion;

public class TowerOfHanoi {

    static void towerOfHanoi(int n, char A, char B, char C){

        if (n == 1){
            System.out.println("Move 1 from " + A + " to " + B);
            return;
        }
        towerOfHanoi(n-1, A, C, B);
        System.out.println("Move " + n +" from " + A + " to " + C);
        towerOfHanoi(n-1, B, A, C);
    }

    public static void main(String[] args) {
        towerOfHanoi(2, 'A', 'B', 'C');
    }
}
