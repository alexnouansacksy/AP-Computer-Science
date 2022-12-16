import static java.lang.System.out;
public class Xmas {
    public static void main(String[] args) {
        out.println("\n\n");
        int branches = 16;
        int num = 1;
        String[] types = {".", ".", ".", ".",
                "~", "~", "~", "~",
                "'", "'", "'", "'", "O"};
        for (int r = branches + 1; r >= 1; r--) {
            if (num == 1) {
                for (int c = 0; c < r; c++)
                    out.print(" ");
                out.print("*\n");
                num += 2;
            } else {
                for (int x = 0; x < r; x++)
                    out.print(" ");
                for (int y = 0; y < num; y++) {
                    int index = (int) (Math.random() * types.length);
                    out.print(types[index]);
                }
                out.print("\n");
                num += 2;
            }
        }
        for (int x = 0; x < branches + 1; x++)
            out.print(" ");
        out.print("|\n");
        for (int x = 0; x < branches + 1; x++)
            out.print(" ");
        out.print("|\n\nHappy holidays from Java!");
    }
}
/*



                 *
                .'~
               ~'~~O
              ...'~.~
             ~~~'O.'~'
            '.~O.O'''~'
           ..~.'.'.O~~'~
          O'~~.'~~~~'~'~'
         ~''.'~~~'O''.''~'
        O'~.''.~.'.'~.~..'~
       ''~'...~~.~..'~~.'..'
      '.~~O.'.''.O'~O'''.O.~'
     ~~O..~.~~..~'O~'...O.~...
    'O.~'~.'.'.~~.'.'.'...~'~'.
   .~O'''.~'.'''~.'~O~.OO~~'.~O~
  'O.~''~'..'.~.~'~'~.~~..~'.'~'~
 ...~..~'....'''...'~..~.'.'.'O'~O
                 |
                 |

Happy holidays from Java!
Process finished with exit code 0
 */