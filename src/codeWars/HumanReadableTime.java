package codeWars;

public class HumanReadableTime {
    public static void main(String[] args) {

        String s = kata(3599949);
        System.out.println(s);


    }

    final static int SECONDS_IN_MINUTE = 60;
    final static int MINUTES_IN_HOUR = 60;
    final static int HOURS_DAILY = 24;
    int seconds;
    int minutes;
    int hours;

    public HumanReadableTime(int seconds, int minutes, int hours) {
        if (seconds < SECONDS_IN_MINUTE) this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public static String kata(int s){
        String time = String.format("%02d:%02d:%02d", (s / 3600), ((s % 3600) / 60), (s % 60));
        return time;
    }



    public static String calculateMinutes(int seconds) {
        StringBuilder sb = new StringBuilder();
        if (seconds < SECONDS_IN_MINUTE) {
            return sb.append(seconds).toString();
        } else if (seconds >= SECONDS_IN_MINUTE) {

            int mins = (int) Math.floor(seconds / SECONDS_IN_MINUTE);
            int sec = seconds % SECONDS_IN_MINUTE;
            sb.append(":");
            if (mins < MINUTES_IN_HOUR) {
                if (mins < 10) {
                    sb.append("0" + mins);
                } else {
                    sb.append(mins);
                }
            } else if (mins >= MINUTES_IN_HOUR) {

            }
            sb.append(":");
            if (sec < 10) {
                sb.append("0" + sec);
            } else {
                sb.append(sec);

            }

            return sb.toString();
        }
        return "";
    }

    public static int hourCalc(int input){
        if (input>359999){
           return 99;
        }
        else if (input>=3600){
            return  (int) Math.floor(input / 3600);
        }else{
            return 0;
        }
    }
    public static int minuteCalc(int input){
        int hrs = hourCalc(input);
        if (hrs>0){
            return (int) Math.floor((input -  (hrs*3600))/60);
        }else if (input>=60){
            return (int) Math.floor(input/60);
        }else
        return 0;
    }
    public static int secondsCalc(int input){
        int hrs = hourCalc(input);
        int mins = minuteCalc(input);

        if (input<60){
            return input;
        }else{
            return input - ((hrs*3600)+(mins*60));
        }
    }
    public static String makeReadable(int input){
        int hrs = hourCalc(input);
        int min = minuteCalc(input);
        int sec = secondsCalc(input);
        StringBuilder sb = new StringBuilder();

        if (input>=359999){
            return "99:59:59";
        }else if (input<359999){
        if (hrs<10){
            sb.append("0").append(hrs).append(":");
        }else{
            sb.append(hrs).append(":");
        }
        if (min<10){
            sb.append("0").append(min).append(":");
        }else{
            sb.append(min).append(":");
        }
        if (sec<10){
            sb.append("0").append(sec);
        }else{
            sb.append(sec);
        }
        }
        return sb.toString();
    }

    public static String timeCalculator(int input){
        int hrs = 0;
        int mins = 0;
        int secs = 0;
        int temp = 0;



        return "";
    }

    public static String calculateTime(int seconds) {
        int hrs = 0;
        int mins = 0;
        int secs = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();

        if (seconds > SECONDS_IN_MINUTE * MINUTES_IN_HOUR) {
            hrs = (int) Math.floor(seconds / SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
            if (hrs < 10) {
                sb.append("0" + hrs);
            } else {
                sb.append(hrs);
            }
            temp = seconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
            if (temp > SECONDS_IN_MINUTE) {
                mins = (int) Math.floor(temp / SECONDS_IN_MINUTE);
                sb.append(":");
                if (mins < 10) {
                    sb.append("0" + mins);
                } else {
                    sb.append(mins);
                }
            }
            secs = seconds- (hrs*MINUTES_IN_HOUR*SECONDS_IN_MINUTE + mins*SECONDS_IN_MINUTE);
            sb.append(":" + secs);
            System.out.println(seconds);

        }
        return sb.toString();
    }
}
