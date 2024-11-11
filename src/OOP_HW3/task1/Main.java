package OOP_HW3.task1;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();

        Pupil[] pupilsArray = {pupil1, pupil2, pupil3};

        ClassRoom classRoom = new ClassRoom(pupilsArray);
        classRoom.showPupils();
    }
}