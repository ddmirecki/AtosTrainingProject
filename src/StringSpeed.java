import java.time.LocalDateTime;

public class StringSpeed {

    public void usingString(){
        long timeStart = System.currentTimeMillis();
        String s = "text";

        for (int i = 0; i <100_000 ; i++) {
            s = s + i;
        }
        long timeEnd = System.currentTimeMillis();
        long timeTaken = timeEnd - timeStart;
        System.out.println(timeStart);
        System.out.println(timeEnd);
        System.out.println(timeTaken);
        System.out.println(s);

    }

    public void usingStringBuilder(){
        long timeStart = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000 ; i++) {
            sb.append(i);
        }
        String endString = sb.toString();
        long timeEnd = System.currentTimeMillis();
        long timeTaken = timeEnd - timeStart;
        System.out.println(timeStart);
        System.out.println(timeEnd);
        System.out.println(timeTaken);
        System.out.println(endString);

    }

    public void usingStringBuffer(){
        long timeStart = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100_000 ; i++) {
            sb.append(i);
        }
        String endString = sb.toString();
        long timeEnd = System.currentTimeMillis();
        long timeTaken = timeEnd - timeStart;
        System.out.println(timeStart);
        System.out.println(timeEnd);
        System.out.println(timeTaken);
        System.out.println(endString);

    }
}
