public class TempOFAnyGivenDay {
    double[] dailyTemp = new double[365]; double hotestDay; double coldestDay; DailyTemperature(double[] temp) {

        dailyTemp = temp; }



    //returns coldest temprature of a month public double coldestDayOfMonth(LocalDate d) {

    int month = d.getMonthValue(); int previousDays = 0; //calculate previous days of the year for (int i = 1; i < month; i++) {

    LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i); previousDays += ld.getDayOfMonth(); }

    coldestDay = dailyTemp[previousDays]; //find the coldest day of the month for (int i = previousDays; i < d.getDayOfMonth(); i++) {

            if (coldestDay > dailyTemp[i]) {

        coldestDay = dailyTemp[i]; }

}



        return coldestDay; }



                //retuns hotest temperature of a month public double hotestDayOfMonth(LocalDate d) {

                int month = d.getMonthValue(); int previousDays = 0; //calculate previous days of the year for (int i = 1; i < month; i++) {

                LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i); previousDays += ld.getDayOfMonth(); }



                hotestDay = dailyTemp[previousDays]; //find the hotest day of the month for (int i = previousDays; i < d.getDayOfMonth(); i++) {

                if (hotestDay < dailyTemp[i]) {

        hotestDay = dailyTemp[i]; }

        }



        return hotestDay; }



        //returns average temperature of a month public double calcAverageOfMonth(LocalDate d) {

        int month = d.getMonthValue(); int previousDays = 0; double sumTemp = 0; //calculate previous days for (int i = 1; i < month; i++) {

        LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i); previousDays += ld.getDayOfMonth(); }



        //calculate average temperature of the given month //sum all daily temperatures for (int i = previousDays; i < d.getDayOfMonth(); i++) {

        sumTemp += dailyTemp[i]; }



//calculate average double averageTemp = sumTemp/d.getDayOfMonth(); return averageTemp; }



public static void main(String[] args) {

        //test data double[] dailyTempOfYear = new double[365]; for (int i = 0; i < 365; i++) {

        dailyTempOfYear[i] = (i+365)%100; System.out.println(""+dailyTempOfYear[i]); }



        for (int i = 0; i < 365; i++) {

        System.out.println(dailyTempOfYear[i]); }

        LocalDate ld = LocalDate.now(); DailyTemperature tempOfYear = new DailyTemperature(dailyTempOfYear); System.out.println("hotest day of month:"+tempOfYear.hotestDayOfMonth(LocalDate.now())); System.out.println("coldest day of month:"+tempOfYear.coldestDayOfMonth(LocalDate.now())); System.out.println("average temperature of month:"+tempOfYear.calcAverageOfMonth(LocalDate.now())); }




        }
