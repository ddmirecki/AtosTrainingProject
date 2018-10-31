package abstractInterfaceClass;

public abstract class Sound implements Speaker {


    public String checkSound(){
        String soundType;
        if(makeSound().equals("tekno")){
            soundType = "this is tekno";
        }else{
            soundType = "it ain't no tekno";
        }
        return soundType;

    }

}
