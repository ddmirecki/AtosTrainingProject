public class Modifiers {

public static void foobar(){
    System.out.println("foobar");
}
    public static class PrivStatClass{
        public static int superint = 10;

        public PrivStatClass(int x){
            this.superint = x;
        }
        int[] arr = new int[]{superint};
        public void foo(){
            System.out.println(superint);
        }
    }

    PrivStatClass privStatClass = new PrivStatClass(10);

    public static void main(String[] args) {
    }

}
