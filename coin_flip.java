 import java.util.*;
/**
 * Write a description of class coin_flip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class coin_flip
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    int x = (int) (Math.random()*2)+1;
    
    
    if(x==1){
        System.out.println("You got heads");
    }        
    else{
        System.out.println("You got tails");        
    }
    

    int y = (int) (Math.random()*4)+1;
}
    public static boolean doublesAreEqual(double num1, double num2){
      final double EPSILON = 1e-6;
      if(Math.abs(num1 - num2) < EPSILON){
          return true; 
      }
      else{
          return false;
      }
      //don't have to use an if statement
      //return (Math.abs(num1-num2)<EPSILON);
    }
    public static void stringExample(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words: ");
        str1 = s.next();
        str2 = s.next();
        /*
         * The equality operator (==) returns true of the two variables (e.g., str1 and str2) contain the same value. For variables a class type, including String, this means 
         *      that they contain the same reference. That is, they refer to the same object in memory, not that the two  strings have the same sequence of characters. 
         */
        if(str1.toLowerCase() == str2.toLowerCase()){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables are "equal". What "equals" means is defined by the class. For strings, it means that the two 
         *      objects have the same reference of characters
         */
        
        if(str1.equals(str2)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        
        /*
         * If we want to check if strings are not equals, we use
         *      the logical complement operator (i.e. !)
         */
        
        if (! str1.equals(str2)){{
            System.out.println("string are NOT equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the  
         *      compareTo method of the String class.
         *      
         * compareTo returns an int value:
         *      0: if the strings are equal (same sequence of characters)
         *      <0: if str1<str2 lexicographically
         *      >0: if str1>ste2 lexicographically
         */
        int result = str1.compareTo(str2);
        String firstStr = null;
        if (result<0){
            String firstStr = str1;
        }
        else if(result>0){
            String firstStr = str2;
        }
        
        if(firstStr != null){
            System.out.println("The first string is: "+firstStr);
        }
        else{
            System.out.println("Strings are equal");
        }
        
        }
    }
}
}