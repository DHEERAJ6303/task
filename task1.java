package task1;
import java.util.Scanner;
public class Task1 {

 
  


        public static void main(String[] args) {
int initialMinutes;
int minutes;
int hours;
int days;
int years;
System.out.println("INPUT MINUTES");
       try (Scanner in = new Scanner(System.in)) {
           initialMinutes = in.nextInt();
       }

hours = initialMinutes / 60;
System.out.println(hours);
days = hours / 24;
System.out.println(days);
years = days / 365;
System.out.println(years);
minutes = initialMinutes % 60;
hours = hours % 24;
days = days % 365;

System.out.printf("%d minutes is %d years, %d days, %d hours and %d minutes", initialMinutes, years, days, hours, minutes);
    
        
   
}
}
