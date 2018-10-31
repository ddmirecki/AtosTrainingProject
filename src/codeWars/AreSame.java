package codeWars;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        boolean b1 = areSameUp(a, b);
        System.out.println(b1);
        boolean b2 = areSameDown(a, b);
        System.out.println(b2);

        boolean b3 = comp(a, b);
        System.out.println(b3);

    }


    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }
        if (a.length == 0 || b.length == 0) {
            return false;
        }
        if (areSameDown(a, b) == true && areSameUp(a, b) == true) {
            return true;
        }

        return false;
    }


    public static boolean areSameDown(int[] a, int[] b) {
        boolean same = false;
        boolean power = false;
        int counter = 0;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Math.pow(a[j], 2) == b[i]) {
                    power = true;
                }
            }
            if (power == true) {
                counter++;
            } else {
                same = false;
            }
            power = false;
        }
        if (counter == b.length) {
            same = true;
        }
        return same;
    }

    public static boolean areSameUp(int[] a, int[] b) {
        boolean same = false;
        boolean modulos = false;
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] % a[i] == 0) {
                    modulos = true;
                }
            }
            if (modulos == true) {
                counter++;
            } else {
                same = false;
            }
            modulos = false;
        }
        if (counter == a.length) {
            same = true;
        }
        return same;
    }

    public boolean doesItModulo(int a, int b) {
        boolean modulo;
        if (a % b == 0) {
            modulo = true;
        } else {
            modulo = false;
        }
        return modulo;
    }

    public static void squareInts(int a, int b) {
        Math.pow(2, a);
    }

    public static boolean isSquared(int a, int b) {
        boolean isSquared;
        if (Math.pow(2, a) == b) {
            isSquared = true;
        } else {
            isSquared = false;
        }

        return isSquared;
    }
}
