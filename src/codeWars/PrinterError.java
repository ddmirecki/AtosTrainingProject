package codeWars;

public class PrinterError {
    public static void main(String[] args) {
        String s = "aaaxbbbbyyhwawiwjjjwwm";
        String s1 = printerError(s);
        System.out.println(s1);

    }

    public static String printerError(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='n' || chars[i]=='o' || chars[i]=='p' || chars[i]=='q' || chars[i]=='r' || chars[i]=='s' || chars[i]=='t' || chars[i]=='u' || chars[i]=='v' || chars[i]=='w' || chars[i]=='x' || chars[i]=='y'|| chars[i]=='z'){
                counter++;
            }
        }

        return counter + "/" + chars.length;
    }


}
