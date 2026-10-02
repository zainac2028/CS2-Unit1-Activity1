import java.util.Scanner;

public class Main {

   public static void main(String []args) {
   
   String time = "5:45";
   String food1 = "yogurt";
   String food2 = "chicken";
   String adjective1 = "okay";
   String number = "3";
   String whatever1 = "on time";
   String class1 = "photography";
   String adjective2 = "love";
   String adjective3 = "okay";
   String class2 = "spanish";
   String whatever2 = "want to leave";
   String adjective4 = "tolerate";


   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a time: ");
   time = scan.nextLine();
   System.out.print("Enter a food: ");
   food1 = scan.nextLine();
   System.out.print("Enter a food: ");
   food2 = scan.nextLine();
   System.out.print("Enter an adjective: ");
   adjective1 = scan.nextLine();
   System.out.print("Enter a number: ");
   number = scan.nextLine();
   System.out.print("When did you get to school (early, late, on time, etc): ");
   whatever1 = scan.nextLine();
   System.out.print("Enter a class: ");
   class1 = scan.nextLine();
   System.out.print("Enter another adjective: ");
   adjective2 = scan.nextLine();
   System.out.print("Enter one more adjective: ");
   adjective3 = scan.nextLine();
   System.out.print("Enter another class: ");
   class2 = scan.nextLine();
   System.out.print("Enter one more adjective: ");
   whatever2 = scan.nextLine();
   System.out.print("Enter the last word (adjective, make it count): ");
   adjective4 = scan.nextLine();

   String sentence1 = "At " + time + " I woke up for school, and I ate " + food1 + " for breakfast. ";
   String sentence2 = "I packed " + food2 + "for lunch. ";
   String sentence3 = "I'm feeling very " + adjective1 + ". ";
   String sentence4 = "I leave at 6:40 to get on the " + number + " train. ";
   String sentence5 = "I get to school " + whatever1 + ". ";
   String sentence6 = "My first period class is " + class1 + ". ";
   String sentence7 = "I " + adjective2 + " this class. ";
   String sentence8 = "I had my lunch and it was absolutely " + adjective3 + ". ";
   String sentence9 = "My last period class is " + class2 + ". ";
   String sentence10 = "I really " + adjective4 + " this class. ";
   String sentence11 = "I " + whatever2 + " school. ";

   System.out.println(sentence1 + sentence2 + sentence3 + sentence4 + sentence5 + sentence6 + sentence7 + sentence8 + sentence9 + sentence10 + sentence11);


   }
}

//At --- I woke up for school, and I ate --- for breakfast. I packed -- for lunch. I'm feeling very ---. I leave at 6:40 to get on the --- train. I get to school ---. My first period class is ---. I --- this class. I had my lunch and it was absolutety ----. My last period class is ---. I really --- this class. I --- school.

