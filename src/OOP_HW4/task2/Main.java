package OOP_HW4.task2;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Програвання:");
        player.play();
        player.pause();
        player.stop();

        System.out.println("\nЗапис:");
        player.record();
        player.pause();
        player.stop();
    }
}
