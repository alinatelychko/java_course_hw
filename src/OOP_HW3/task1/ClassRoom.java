package OOP_HW3.task1;

public class ClassRoom {
    private Pupil[] pupils;
    
    public  ClassRoom (Pupil[] pupilsArray){
         this.pupils = new Pupil[4];

        for (int i = 0; i < pupilsArray.length && i < 4; i++) {
            pupils[i] = pupilsArray[i];
        }
    }



    public void showPupils (){
        for (int i = 0; i < pupils.length; i++) {
            Pupil pupil = pupils[i];
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
            
        }
    }
}
