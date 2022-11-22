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
        Random r = new Random();int i =0;int y =0;
        for(int x=0;x<=1000;x++){
            int winningDoor = r.nextInt(3)+1;
            int chosenDoor = r.nextInt(3)+1;
            if(winningDoor == chosenDoor){i+=1;}
            else{y+=1;}
        }
        System.out.println("Stayed the same: "+i+" Changed: "+y); 
        
    }
}
