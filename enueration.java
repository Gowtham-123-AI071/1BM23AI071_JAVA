import java.util.Scanner;
public class enueration {
    public enum DayofWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkday(){
            return(this != SATURDAY && this != SUNDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("It's Monday a Workday?" + DayofWeek.MONDAY.isWorkday());
        System.out.println("Is  Saturday a Workday?"+ DayofWeek.SATURDAY.isWorkday());
    }
}



//output
// It's Monday a Workday?true
//Is  Saturday a Workday?false
