package OOP_HW4.task2;

public class Player implements Playable,Recordable{
    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}
