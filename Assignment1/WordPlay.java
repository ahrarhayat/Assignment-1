
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class WordPlay {
public boolean isVowel(char ch)
{
  char chNew=  Character.toLowerCase(ch);
    if(chNew == 'a' || chNew =='e' || chNew =='i'|| chNew =='o'||chNew =='u')
    {
    return true;
}

return false;
}
public void testIsVowel()
{
    char ch = 'A';
    boolean result = isVowel(ch);
    System.out.println(result);
}
public String replaceVowels(String phrase, char ch)
{
    StringBuilder str = new StringBuilder(phrase);
          for(int i=0; i<phrase.length();i++)
          {
            char currChar= phrase.charAt(i);
            boolean result = isVowel(currChar);
            if(result == true)
            {
             str.setCharAt(i,ch);
            }
            
           }
    return str.toString();
}
public void testReplaceVowels()
{
    char ch = '*';
    String phrase = "Hey there!";
    String result = replaceVowels(phrase,ch);
    System.out.println(result);
}
public String emphasize(String phrase, char ch)
{
 StringBuilder str = new StringBuilder(phrase);
          for(int i=0; i<phrase.length();i++)
          {
            char currChar= phrase.charAt(i);
            char newChar= Character.toLowerCase(currChar);
            if(newChar==ch)
            {
            
             if(i%2==0)
             {
             str.setCharAt(i,'*');
            }
            else
            {
             str.setCharAt(i,'+');
            }

           }
        }
    return str.toString();
}
public void testEmphasize()
{
    char ch = 'a';
    String phrase = "Mary Bella Abracadabra";
    String result = emphasize(phrase,ch);
    System.out.println(result);
}
}
