import java.sql.SQLOutput;
import java.util.Scanner;
public class nalla {
    public static void joke(String rep){
        Scanner num = new Scanner(System.in);
        if(rep.equals("yes")){
            System.out.println("OK");
            System.out.println("Do you know why humming bird always hums?");
            System.out.println();
            System.out.println();
            System.out.println("Because he forgets lyrics everytime.");
        }
        else if(rep.equals("no")){
            System.out.println("OK, Have a nice day.");
        }
        else{
            System.out.println("Invalid entry.");
            System.out.println("Enter again yes or no.");
            String p = num.next();
            joke(p);
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Hi, I am Jerry.");
        System.out.println("What is your name?");
        String name = num.nextLine();
        System.out.println("What is your age " + name + "?");
        int age = num.nextInt();
        System.out.println("Should I tell you a joke?   (Yes or no)");
        String rep = num.next();
        joke(rep);

    }
}
