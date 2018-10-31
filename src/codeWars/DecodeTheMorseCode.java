package codeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeTheMorseCode {
    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));

    }
    static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " " };
    static String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "," };

    public static String decode(String morse){
        String s = "";
        Map<String, String> codes = new HashMap<>();
        for (int i = 0; i < alpha.length; i++) {
            codes.put(dottie[i], alpha[i]);
        }

        String s3 = morse.replaceAll("   ", " , ");
        String[] split = s3.split(" ");

        for (int i = 0; i < split.length; i++) {
            String s1 = codes.get(split[i]);
            s += s1;
        }







        return s;
    }
}
