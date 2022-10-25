
    import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



    public class Main extends Divide {
        public static void main(String[] args) {
            Logger logger = Logger.getLogger("MyLog");
            FileHandler fh;

            try {


                fh = new FileHandler("/Users/olnandtaa/Desktop/teachmeskills/testcalc3/logfile.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);

                logger.info("Test Log");

            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            logger.info("Success");


            Scanner scanner = new Scanner (System.in);
            System.out.println("Enter a and b: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(Divide(a, b));

        }
    }




