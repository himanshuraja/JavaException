import java.util.regex.Pattern;
import java.io.InputStream; 
import java.util.Scanner;
public class NumberFormatException{

static int input;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer number: ");

        String inputString = scan.next();

        try {
            input = Integer.parseInt();
            System.out.println("You've entered number: " + input);
        } catch (NumberFormatException e) {
            if(inputString.equals("") || inputString == null) {
                System.out.println("empty input"); 
            } else if(inputString.length == 1) {
                System.out.println("char input");
            } else {
                System.out.println("string input");
            }
        }
    }}
