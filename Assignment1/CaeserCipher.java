
/**
 * Write a description of CaeserCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class CaeserCipher {
 public String encrypt(String input,int key)
    {
        StringBuilder encrypted= new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loAlphabet="abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet= alphabet.substring(key)+alphabet.substring(0,key);
        String loShifted=loAlphabet.substring(key)+loAlphabet.substring(0,key);
        for(int i=0; i<encrypted.length();i++)
        {
            char currChar= encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            int loIdx=loAlphabet.indexOf(currChar);
            
            if(idx!=-1 || loIdx!=-1 )
            {
                if(idx!=-1){
                char newChar= shiftedAlphabet.charAt(i);
                encrypted.setCharAt(i,newChar); }
                else
                {
                char newLoChar=loShifted.charAt(i);
                encrypted.setCharAt(i,newLoChar);
                }
            }
           }
            return encrypted.toString();
        
        
    }
    public void testCaeser()
    {
        int key=23;
        String message = "FIRST LEGION ATTACK EAST FLANK!";
        String encrypted= encrypt(message , key);
        System.out.println(encrypted);
        String decrypted= message;
        System.out.println(decrypted);
        
    }
}
