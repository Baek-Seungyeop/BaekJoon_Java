public class Programmers_250135 {

    static class Clock {
        int hour;
        int minute;
        int second;

        double hourRatio;
        double minuteRatio;
        double secondRatio;

        public Clock(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public void setRatio(int hour, int minute, int second) {
            this.hourRatio = hour * 24.0 + minute / 4.0 + second / 240.0;
            this.minuteRatio = minute * 60.0 + second / 10.0;
            this.secondRatio = second * 60.0;
        }

        public boolean checkAlarm() {
            return this.hourRatio == this.secondRatio || this.minuteRatio == this.secondRatio;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public double getHourRatio() {
            return hourRatio;
        }

        public double getMinuteRatio() {
            return minuteRatio;
        }

        public double getSecondRatio() {
            return secondRatio;
        }
    }

    public static int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        Clock start = new Clock(h1, m1, s1);
        Clock end = new Clock(h2, m2, s2);
        Clock time = new Clock(h1, m1, s1);

        int h = end.getHour() - start.getHour();
        int m = end.getMinute() - start.getMinute();
        int s = end.getSecond() - start.getSecond();
        int second = h * 60 * 60 + m * 60 + s;


        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, 5, 30, 0, 7, 0));
        System.out.println(solution(12, 0, 0, 12, 0, 30));
        System.out.println(solution(0, 6, 1, 0, 6, 6));
        System.out.println(solution(11, 59, 30, 12, 0, 0));
        System.out.println(solution(11, 58, 59, 11, 59, 0));
        System.out.println(solution(1, 5, 5, 1, 5, 6));
        System.out.println(solution(0, 0, 0, 23, 59, 59));
    }
}