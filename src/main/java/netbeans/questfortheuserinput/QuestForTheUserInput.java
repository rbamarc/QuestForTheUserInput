package netbeans.questfortheuserinput;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class QuestForTheUserInput {

    public static void main(String[] args) {
        //Creating a new scanner object to get user input
        Scanner inputReader = new Scanner(System.in);
        
        // initializing variables needed 
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        //we can use the scanners readLine to assign value to our strings
        //because its return type is string
        System.out.println("What is your name??");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your Quest??");
        yourQuest = inputReader.nextLine();
        
        //when we get to our double type, we can use Scanners
        //nextDouble method
        //or we can use Double.parseDouble to convert the nextLine's string
        System.out.println("What is the airspeed velocity of an unladen swallow??");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How would you know " + velocityOfSwallow + " is correct, " + yourName +"?");
        System.out.println("You don't even know if the swallow is African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
        
    }
}
