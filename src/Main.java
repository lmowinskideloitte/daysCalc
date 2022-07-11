import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {

        Date userDate = getDate();
        Date currDate = new Date();

        long daysDiff = getDaysDiff(userDate, currDate);
        System.out.println("The number of days between dates: " + daysDiff);
    }

    public static Date getDate() throws ParseException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a date [yyyy-mm-dd]: ");
        String userDateRaw = scan.nextLine();

        return new SimpleDateFormat("yyyy-MM-dd").parse(userDateRaw);
    }

    public static long getDaysDiff(Date dateBefore, Date dateAfter) {
        long userDateMs = dateBefore.getTime();
        long currDateMs = dateAfter.getTime();

        long timeDiff = Math.abs(currDateMs - userDateMs);
        return TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
    }
}