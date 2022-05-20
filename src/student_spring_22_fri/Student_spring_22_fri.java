
package student_spring_22_fri;
import java.util.Scanner;
/**
 * comments test
 * @author TheMu
 */
public class Student_spring_22_fri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String userWord = input.nextLine();
        
        char[] myLetters = new char[userWord.length()];
        myLetters = getChars(userWord);
        printChar(myLetters);
    }
    
    public static char[] getChars(String word){
        
        char[] arr = new char[word.length()];
        for(int i = 0; i < word.length(); i++){
            arr[i] = word.charAt(i);
        }
        return arr;
    }
    public static void printChar(char[] myChars){
        
        for(int i = myChars.length - 1; i >= 0; i--){
            System.out.printf("%2s", myChars[i]);
        }
        System.out.println();
    }
}