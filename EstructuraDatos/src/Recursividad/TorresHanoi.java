package Recursividad;

public class TorresHanoi {
    public static void main(String[] args) {
        TorresHanoi object = new TorresHanoi();
        object.hanoiTowers(3,1,2,3);
        System.out.println("Congratulations you made a flawless game!");
    }

    // Creating the recursive method to solve the towers of hanoi
    public void hanoiTowers (int disks, int tower1, int tower2, int tower3) {
        // Base case
        if (disks == 1) {
            System.out.println("Move tower disk " + tower1 + " to tower " + tower3);
        }
        // Domain (problem - 1)
        else {
            hanoiTowers(disks - 1, tower1, tower3, tower2);
            System.out.println("Move tower disk " + tower1 + " to tower " + tower3);
            hanoiTowers(disks - 1, tower2, tower1, tower3);
        }
    }

}
