import java.util.Random;
/**
 * Write a description of class Montehall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Montehall
{
    
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while(x<1001){
            Random r = new Random();
            int winningDoor = r.nextInt(3)+1;
            int chosenDoor = r.nextInt(3)+1;
            
            if(winningDoor == chosenDoor){
                y+=1; 
            }
            x+=1;
        }
        System.out.println(y);
    }
}
