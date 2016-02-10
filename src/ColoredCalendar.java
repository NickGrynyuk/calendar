
import java.time.*;
import java.util.*;
public class ColoredCalendar{
  

  public static void main(String args[]){


 
  
    GregorianCalendar now = new GregorianCalendar();
    int today = now.get(Calendar.DAY_OF_MONTH);
    int month = now.get(Calendar.MONTH);
    now.set(Calendar.DAY_OF_MONTH, 1);
    int weekday = now.get(Calendar.DAY_OF_WEEK);
    int FirstDayOfWeek = now.getFirstDayOfWeek();
    int in = 0;
    while (weekday != FirstDayOfWeek){
        in++; 
        now.add(Calendar.DAY_OF_MONTH, -1);
        weekday = now.get(Calendar.DAY_OF_WEEK);
    }
System.out.println("\033[34;1m DAY:"+today);
System.out.print("\033[34;1m"+DayOfWeek.of(1)+"  ");
System.out.print("\033[34;1m"+DayOfWeek.of(2)+"  ");
System.out.print("\033[34;1m"+DayOfWeek.of(3)+"  ");
System.out.print("\033[34;1m"+DayOfWeek.of(4)+"  ");
System.out.print("\033[34;1m"+DayOfWeek.of(5)+"  ");
System.out.print("\033[35;1m"+DayOfWeek.of(6)+"  ");
System.out.println("\033[35;1m"+DayOfWeek.of(7)+"  ");
   
    for(int i = 1; i<=in; i++)
        System.out.print(" ");

    now.set(Calendar.DAY_OF_MONTH, 1);
    do{
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%8d", day);
       
        if(day == today)
             System.out.print("#");
        else
            System.out.print(" ");
        now.add(Calendar.DAY_OF_MONTH, 1);
        weekday = now.get(Calendar.DAY_OF_WEEK);
        if (weekday == FirstDayOfWeek)
            System.out.println();
    }
    while(now.get(Calendar.MONTH) == month);
    if(weekday != FirstDayOfWeek)
        System.out.println();

}
}