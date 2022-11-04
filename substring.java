
/**
 * Write a description of class substring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class substring
{
    public static void main(String[] args){
    String str ="cat";
        for(int i=0;i<str.length();i++){
            for(int y =0; y<str.length()-i;y++){
                System.out.println(str.substring(y,i+y));
            }
        }        
    }

        
    }
    // instance variables - replace the example below with your own

