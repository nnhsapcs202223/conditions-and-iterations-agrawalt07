import java.util.Scanner;

/**
 * Write a description of class Strings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Strings
{
    /*
     * This is an example of a "short circut".
     * For an AND operation, if the the left operand is false, the right operand will 
     *      not be evaluated. This is because we have already determined the AND
     *      operation will be false. 
     */
    
    
    
    /*
     * This is another "short circut example".
     * For an OR operation, if the left operand is true, the right operand will
     *      not be evaluated. This is because we have already determined the OR
     *      operation will be true
     */
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    if(s.nextLine().equals("kiwi") || s.next().equals("kiwi")){
        System.out.println("Good");
    }        
    }


}
