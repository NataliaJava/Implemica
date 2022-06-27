package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //read string with keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //reader maybe throws IOException
        System.out.println("Enter the string:");
        String str1 = reader.readLine();
        System.out.println(Task1.checkString(str1)); //checks the input string for correctness and output true or false
        //example:
        String str2 = "()(())()";
        System.out.println(Task1.checkString(str2)); //true
        String str3 = "))(())()(";
        System.out.println(Task1.checkString(str3)); //false
    }
}