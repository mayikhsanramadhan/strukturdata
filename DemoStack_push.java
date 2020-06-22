/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostack_push;
import java.util.*;
/**
 *
 * @author User
 */
public class DemoStack_push {
    public static void main(String[] args) {
Stack<String> STACK = new Stack<String>();

STACK.push("Minggu"); STACK.push("Senin"); STACK.push("Selasa"); STACK.push("Rabu"); STACK.push("Kamis");

System.out.println("Stack Awal: " + STACK);

STACK.push("Jumat"); STACK.push("Sabtu");

System.out.println("Updata Stack: " + STACK);
}


    
}
