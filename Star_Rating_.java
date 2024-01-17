/**
 * This Java program prompts the user to rate a dish and then displays a corresponding message based on
 * the rating.
 */
import java.util.Scanner;

public class Star_Rating_ {
public static void main (String[] args) {
String rating;
    int x; 


          System.out.println("-***Welcome to Taj Hotel***-");
           System.out.println("Please rate our Dishes\n");

         try(  Scanner scanner = new Scanner(System.in)){
       System.out.println("Enter Your Dish");
           rating = scanner.nextLine();

           System.out.println("Enter Your rating between 0 to 5");

           x = scanner.nextInt();
          
           if(x==5){
               System.out.println("Wonderful "+rating); 
           }
           else if(x==4){
            System.out.println("Awesome"+rating);
           }

           else if(x==3){
            System.out.println("Good "+rating);
           }


           else if(x==2){
            System.out.println("Average "+rating);
           }

           else if(x==1){

            System.out.println("Not Really Good!"+rating);
           }
          
           else {
             System.out.println("Zero Rating "+rating);
           }
           
       
    }
      
       }


    }


