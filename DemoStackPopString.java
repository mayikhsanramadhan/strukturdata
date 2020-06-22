/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostackpopstring;
import java.util.*;
/**
 *
 * @author User
 */
public class DemoStackPopString {
    public static void main(String[] args) {
Stack<String> STACK = new Stack<String>();

STACK.push("Minggu"); STACK.push("Senin"); STACK.push("Selasa"); STACK.push("Rabu"); STACK.push("Kamis");

System.out.println("Stack Awal: " + STACK);

System.out.println("Pop Element: " +
STACK.pop());
System.out.println("Pop Element: " +
STACK.pop());

System.out.println("Update Stack "
+ STACK);
}

    
}
