 import java.util.Scanner;

   public class Calculator
   {
      public static void main(String[]args)
      {

      double num1,num2;                // Var to store numbers.
      char ciclo ='y', operation ='x'; // Var for cicles
       
		// create a new method scanner to ask numbers
      Scanner keyboard = new Scanner(System.in);

         
         //first while loop to ask if user wanna go over      
		   while (ciclo == 'y')
         {
         // ask for numbers
         System.out.print("Enter 1st nmber: ");
         num1 = keyboard.nextDouble();
         System.out.print("Enter 2nd number: ");
         num2 = keyboard.nextDouble();

         operation = 'x';   // Start Variable Operation different than options
      
				//second while loop to show simbols until the user enters one of the options shown
				while (operation != '+' && operation != '-' && operation != '*' && operation != '/')
            {
				//method scanner to ask signs
             Scanner op = new Scanner(System.in);
             System.out.println("Choose a sign");

             System.out.println("+");
             System.out.println("-");
             System.out.println("*");
             System.out.println("/");
             operation = op.next().charAt(0);

               // Procss of the program with switch statemnt
					switch (operation)
               {
               case '+':
               System.out.println("Result = " + (num1+num2));
               break;
               case '-':
               System.out.println("Result = " + (num1-num2));
               break;
               case '*':
               System.out.println("Result = " + (num1*num2));
               break;
               case '/':
               System.out.println("Result = " + (num1/num2));
               break;
               default: System.out.println("Please enter a number between 1 to 4 " );
               }
				
            }
				//Method Scannr to Ask if it wants to go over.
         Scanner over = new Scanner(System.in);
         System.out.println("Do you wanna go over? y/n");
         ciclo = over.next().charAt(0);
			
			System.out.println("Wilson :D");
         }
      }
	}
   