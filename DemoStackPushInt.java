/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostackpushint;
import java.util.*;
/**
 *
 * @author User
 */
public class DemoStackPushInt {
    
public static void main(String args[])
{
Stack<Integer> STACK = new Stack<Integer>();

STACK.push(10);
STACK.push(15); STACK.push(30); STACK.push(20); STACK.push(5);
System.out.println("Stack Awal: " + STACK);

STACK.push(1254); STACK.push(4521);
System.out.println("Update Stack: " + STACK);
}


    
}
