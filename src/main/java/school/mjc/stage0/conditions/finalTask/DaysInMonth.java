package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year >= 0  && month > 0 && month <13) {
            boolean leap = false;
            if (year % 4 == 0) {

                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                } else
                    leap = true;
            } else
                leap = false;

            int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};

            if((leap == true ) && month == 2)
                System.out.println(29);
            else
                System.out.println(days[month-1]);


        }else {
            System.out.println("invalid date");
        }
    }
}
