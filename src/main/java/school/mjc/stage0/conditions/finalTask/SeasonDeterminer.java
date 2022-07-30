package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer { ;

    public void tellTheSeason(int monthNumber) {

       String  season = switch (monthNumber) {

           case 12 -> "Winter";
           case 1 -> "Winter";
           case 2 -> "Winter";
           case 3 ->  "Spring";
           case 4 ->  "Spring";
           case 5 ->  "Spring";
           case 6 ->  "Summer";
           case 7 ->  "Summer";
           case 8 ->  "Summer";
           case 9 -> "Autumn";
           case 10 -> "Autumn";
           case 11 -> "Autumn";
           default -> "Wrong month number";


       };
        System.out.println(season);
    }
}
