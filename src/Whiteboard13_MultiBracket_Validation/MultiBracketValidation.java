package Whiteboard13_MultiBracket_Validation;

import java.util.Scanner;
import java.util.Stack;


public class MultiBracketValidation {
    public static void main(String[] args) {
        System.out.println(MultiBracketVal("()"));
    }
    public static boolean MultiBracketVal(String input){
        Scanner scanner = new Scanner(input);
        Stack<String> brackets = new Stack();
        while (scanner.hasNext()) {
            String word = scanner.next();
            for(int i=0; i < word.length(); i++){
                String character = word.substring(i,i+1);
                if (character.contentEquals("[") || character.contentEquals ("{") || character.contentEquals("(")){
                    brackets.push(character);
                } else if (character.contentEquals("]") || character.contentEquals ("}") || character.contentEquals(")")){
                    String comparison = brackets.peek();
                    if (comparison.contentEquals("[") && character.contentEquals("]")
                    {
                        brackets.pop();
                    }
                }
            }
        }
        return brackets.isEmpty();
    }
}
