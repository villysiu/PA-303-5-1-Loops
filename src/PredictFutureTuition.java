public class PredictFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while(tuition < 20000){
            tuition *= 1.07;
            year++;
        }
        System.out.println("In "+ year +" years, the tuition will double.");

    }
}
