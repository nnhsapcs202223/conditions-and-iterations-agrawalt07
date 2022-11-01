import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author gcschmit
 * @version 16nov2020
 */
public class Iterations
{
    public static void whileExample(){
        /*
         * while loop:
         *  evaluates a condition (i.e., boolean expression)
         *     if true, executes the body of the loop and re-evaluates the condition
         *     if false, skips the body of the code
         */
        
        int count = 1;                              //initialisation 
        
        while(count<=5){                            //condition
            
            System.out.println(count);              //body
            
            count++;                                //update the loop variable
        }
    }
    
   public static void whileExample2(){
       int count = 1;                               //initialization
       
       while(count!=50){
          
           System.out.println(count); 
           
           count+=2;
           
       }
   }
   
   public static void forExample(){
       /*
        * for loop: 
        *       Three parts of the for loop statement: 
        *           1. initialization - executed once
        *           2. condition - boolean expression evaluated at the start of each iteration
        *           3. update the loop variable - executed at the *end* of each iteration 
        *                                                         *before* evaluation the condition again 
        */
       for(int x = 0;                   //initialization 
           x<=5;                        //condition
           x+=2)                        //increment
           {              
           System.out.println(x);       //body
       }
       
       
       
       
   }
   

 public static void forExample2(){
         int x;
       for(x = 1;                   //initialization 
           x<=5;                        //condition
           x+=2)                        //increment
           {              
           System.out.println(x);       //body
       }
     
 }
 
 public static void offByOne(){
     /*
      * The infamous off-by-one error is common with for loops 
      *     executing one too many or one too few times.
      *     
      * Carefully ask: Should the initial value start at 0 or 1?
      *                Should the condition be < or <= ? 
      *                
      * By convention, for simple for loops, we start at 0 and we use < operator
      */
     
     // We want to print five "*" 
     
     for(int i =0;
     i<5;
     i++){
         System.out.println("*");
     }
 }
 
 public static void doWhile(){
     /*
      * do loop (do-while loop)
      * 
      *     1. Executes the body of the loop
      *     2. evaaluates the condition:
      *         if true, executes the body of the loop again
      *         if false, continues execution after the loop.
      */
     int count =1;
     
     do{
         System.out.println(count);
         count++;
     }
     while (count<=5);
 }
 
 public static int sum(){
     Scanner s = new Scanner(System.in);
     int sum = 0;
     int value;
     
     do{
         System.out.println("Enter a positive integer (-1 to quit): ");
         
         /*
          * Sentinal variable / value 
          * Value (e.g., -1) used to terminate a loop.
          * It is often entered by a user.
          */
         value = s.nextInt();
         if (value!=-1){
         sum+=value;
         }
     }
     while(value!=-1);
     return sum;
 }
}