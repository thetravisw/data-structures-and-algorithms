package Whiteboard13_MultiBracket_Validation;

import java.util.Scanner;
import java.util.Stack;


public class MultiBracketValidation {

    public static boolean MultiBracketVal(String input){
        Stack<String> brackets = new Stack();
            for(int i=0; i < input.length(); i++) {
                String character = input.substring(i, i + 1);
                //  Add opening characters to stack.
                if (character.contentEquals("[") || character.contentEquals("{") || character.contentEquals("(")) {
                    brackets.push(character);

                    //  If you hit a closing character and the stack is empty, return false.
                } else if (character.contentEquals("]") ||character.contentEquals(")")||character.contentEquals("}")) {
                    if (brackets.isEmpty()) return false;
                }

                //if you hit a closing character, and the top of the stack matches it, pop it.
                if (character.contentEquals("]") && brackets.peek().contentEquals("[")) {
                    brackets.pop();
                } else if (character.contentEquals(")") && brackets.peek().contentEquals("(")) {
                    brackets.pop();
                } else if (character.contentEquals("}") && brackets.peek().contentEquals("{")) {
                    brackets.pop();
                }
            }

            //If the stack is now empty, everything closed out correctly.   If it isn't, something is unclosed.
        return brackets.isEmpty();
    }
}
