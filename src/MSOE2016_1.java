// Alex Nouansacksy
// MSOE2016_1
// 11/15/2022
import java.util.*;
import static java.lang.System.out;
public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter a lowercase word: ");
        String phrase = keyboard.nextLine();
      
        String[] word = new String[phrase.length()];
        for (int lcv = 0; lcv < word.length; lcv++) {
          word[lcv] = phrase.substring(lcv, lcv+1);
        }
      
        String[] palindrome = new String[phrase.length()];
        int lcv2 = 0;
        for (int lcv = phrase.length(); lcv > 0; lcv--) {
          palindrome[lcv2] = phrase.substring(lcv - 1, lcv);
            lcv2++;
        }
      
        String original = "";
        String thePalindrome = "";

        for (int lcv = 0; lcv < word.length; lcv ++) {
          original += word[lcv];
        }

      for (int lcv = 0; lcv < palindrome.length; lcv ++) {
          thePalindrome += palindrome[lcv];
        }
      
        if (original.equals(thePalindrome)) out.print("That word is a palindrome");
        else out.print("That word is not a palindrone");
          
    }
}

/*
Enter a lower case word: alex
That word is not a palindrone

Enter a lower case word: deed
That word is a palindrone
*/
