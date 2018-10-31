package codeWars;

public class FindNextSquare {
    public static void main(String[] args) {
        double a = 1.7;
        double b = 2d;
        double c = Math.ceil(b) -b;



        System.out.println(findNextSquare1(169));


    }

    public static long findNextSquare1(long sq){
        double a = Math.sqrt(sq);
        double next = -1;
        long solution = -1;
        if ((Math.ceil(a) - a)==0){
            next = Math.pow((a+1), 2);
            solution = (long) next;
        }else{
            return -1;
        }


        return solution;
    }
}
