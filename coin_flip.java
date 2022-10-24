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
}