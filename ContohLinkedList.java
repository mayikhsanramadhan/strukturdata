/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlinkedlist;
import java.util.*;
/**
 *
 * @author User
 */
public class ContohLinkedList {
    public static void main(String[] args){
        
LinkedList<String> daftar = new LinkedList<String>();
daftar.add("A");
daftar.add("B"); daftar.addLast("C"); daftar.addFirst("D"); daftar.add(3, "B");
daftar.add("F");
daftar.add("G"); System.out.println("Linked list : " + daftar);
daftar.remove("B"); daftar.remove(3); daftar.removeFirst(); daftar.removeLast();
System.out.println("Linked list setelah dihapus: " + daftar);

boolean status = daftar.contains("E"); if(status)
System.out.println("Di List terdapat elemen 'E' "); else
System.out.println("Di List tidak terdapat elemen 'E'");

int size = daftar.size();
System.out.println("Ukuran dari linked list = " + size);

Object element = daftar.get(2);
System.out.println("elemen yang ditunjuk oleh get() : " + element); daftar.set(2, "Y");
System.out.println("Linked list pasca perubahan: " + daftar);
}

    
}
