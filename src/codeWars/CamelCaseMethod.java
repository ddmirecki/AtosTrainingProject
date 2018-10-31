package codeWars;

public class CamelCaseMethod {
    public static void main(String[] args) {
        String s = "z";
        String s1 = camelCase(s);
        System.out.println(s1);
    }

    public static String camelCase(String str) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")){
                String first = split[i].substring(0, 1).toUpperCase();
                String rest = split[i].substring(1);
                sb.append(first+rest);
            }
        }

        return sb.toString();
    }


}
