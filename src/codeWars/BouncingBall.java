package codeWars;

public class BouncingBall {

    public static void main(String[] args) {
        int i = bouncingBall(30.0, 0.66, 1.5);
        System.out.println(i);
        double log = Math.log(1.5/30);
        double s = Math.log(0.66);
        System.out.println(s);
        System.out.println(log);
        double w = log/s;
        System.out.println(w);
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int numberOfBounces = 1;
        if (bounce<=0 || bounce>=1 || h <= 0 || window >= h){
            return -1;
        }
        double firstBounce = h * bounce;
        do {
            if (firstBounce > window) {
                numberOfBounces += 2;
            }
            firstBounce = firstBounce * bounce;


        }while (firstBounce > window);
        return numberOfBounces;
    }
}
