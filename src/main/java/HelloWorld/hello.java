package HelloWorld;

//import org.joda.time.LocalTime;
import java.util.Date;
import java.util.Calendar;

public class hello {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LocalTime currentTime = new LocalTime();
        java.util.Date currentTime = Calendar.getInstance().getTime();
        System.out.println("Hello world with Gradle!");
        System.out.println("The current local time is " + currentTime);
        System.out.println("Goodbye!");
    }
}
