import java.util.Scanner;

public class AverageTempMonth {
    public class AverageTempEachMonthQ1 {
        public static void main(String[] args) {
            double[]dailyTemp=new double[30];
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter daily temperature of a month");
            dailyTemp= keyboard.nextDouble();
            double[]averageTemp;
            double sum=0.0;
            for (int i = 0; i <30 ; i++) {
                sum+=dailyTemp[i];      //sum= sum(0)+dailyTemp.getSum
            }
            averageTemp=sum/30;
            System.out.println("The average monthly temperature is: "+averageTemp);
        }

    }

}
