package practice;

public class AnimalSingleToneClass {
    private static AnimalSingleToneClass single_instance=null;
    private AnimalSingleToneClass(){

    }
    public static AnimalSingleToneClass getInstance(){
        if(single_instance == null){
            single_instance=new AnimalSingleToneClass();
        }
        return single_instance;
    }
}
