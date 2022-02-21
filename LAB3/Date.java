import java.time.LocalDate;
import java.time.Period;
public class Date{
   public static void main(String[] args) {
      LocalDate date1 = LocalDate.of(2020, 3, 30);
      LocalDate date2 = LocalDate.of(2022, 1, 29);
      System.out.println("Date 1 = "+date1);
      System.out.println("Date 2 = "+date2);
      Period p = Period.between(date1, date2);
      System.out.println("Years (Difference) = "+p.getYears());
      System.out.println("Month (Difference) = "+p.getMonths());
      System.out.println("Days (Difference) = "+p.getDays());
   }
}