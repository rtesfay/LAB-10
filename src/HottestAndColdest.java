import java.util.Scanner;

    import java.util.Scanner;

    public class HottestColdestTempQ1
    {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double[]dailyTemp=new double[365];
            for (int i = 0; i < dailyTemp.length; i++) {
                System.out.println("Daily temperature: "+ (i+1)+": ");
                dailyTemp[i] =scanner.nextDouble();
                boolean isHottest=false;
                String hottest, coldest;
                dailyTemp[0]=hottest;
                dailyTemp[1]=coldest;
                dailyTemp[i];
                if (dailyTemp[i]>dailyTemp[0]) {
                    isHottest=true;            }
                System.out.println("The hottest temperature is: "+Math.abs(dailyTemp[i]));
                if (dailyTemp[i]<dailyTemp[1]){
                    isHottest=false;                }
                System.out.println("The coldest temperature is: "+Math.abs(dailyTemp[i]));
            }

        }

    }
