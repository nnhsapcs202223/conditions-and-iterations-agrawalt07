
/**
 * Write a description of class diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class diamond
{

    public static void main(String[] args){
        int z = 10;
        for(int i = 1; i<=(2*z-1); i+=2){
            System.out.println("");
            for(int y = 0; y<=((2*z-1)-i)/2; y++){
                System.out.print(" ");
            }
            for(int x = 0; x<i; x++){
                System.out.print("*");
            }
        }
        for(int i = (2*z-1); i>=0; i-=2){
            System.out.println("");
            for(int y = 0; y<=((2*z-1)-i)/2; y++){
                System.out.print(" ");
            }
            for(int x = 0; x<i;x++){
                System.out.print("*");
            }
        }
    }
    
}