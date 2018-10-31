package codeWars;

import java.util.Queue;
import java.util.Stack;

public class CheckingGroups {
    public static void main(String[] args) {

        String s = "(())";
        boolean b = groupCheck(s);
        System.out.println(b);


    }

//    public static boolean groupCheck(String s){
//        int round = 0;
//        int square = 0;
//        int bracket = 0;
//
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i]=='(')round++;
//            if (chars[i]=='[')square++;
//            if (chars[i]=='{')bracket++;
//            if (chars[i]==')')round--;
//            if (chars[i]==']')square--;
//            if (chars[i]=='}')bracket--;
//
//            if (round<0||square<0||bracket<0){
//                return false;
//            }
//            if (round>1||square>1||bracket>1){
//                return false;
//            }
//        }
//        if (round==0&&square==0&&bracket==0){
//            return true;
//        }else{
//            return false;
//        }
//
//
//
//    }

    public static boolean groupCheck(String s) {
        int round = 0;
        int square = 0;
        int bracket = 0;
        int openRoundPosition = 0;
        int squareOpenPosition = 0;
        int bracketOpenPosition = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                round++;
                openRoundPosition = i;
            }
            if (chars[i] == '[') {
                square++;
                squareOpenPosition = i;
            }
            if (chars[i] == '{') {
                bracket++;
                bracketOpenPosition = i;
            }
            if (chars[i] == ')') {
                round--;
                if (((i + 1) - openRoundPosition) % 2 != 0 ) {
                    return false;
                }
            }
            if (chars[i] == ']') {
                square--;
                if (((i + 1) - squareOpenPosition) % 2 != 0) {
                    return false;
                }
            }
            if (chars[i] == '}') {
                bracket--;
                if (((i + 1) - bracketOpenPosition) % 2 != 0) {
                    return false;
                }
            }

            if (round < 0 || square < 0 || bracket < 0) {
                return false;
            }

        }
        if (round == 0 && square == 0 && bracket == 0) {
            return true;
        } else {
            return false;
        }


    }
}


