public class MySignleton {

    private static MySignleton mySignleton;

    private MySignleton(){

    }

    public static MySignleton getInstance(){
        if(mySignleton == null){
            synchronized (MySignleton.class){
                if(mySignleton == null){
                    mySignleton = new MySignleton();
                }
            }
        }
        return mySignleton;
    }
}
