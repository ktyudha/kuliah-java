/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perc6yudhap1abstract;

abstract class ClassA {
    int x, y;
    void cetak1(int x, int y) {
    }
    abstract void cetak2();
    abstract void cetak3();
}
class ClassB extends ClassA {
    void cetak2() {
        System.out.println("this is method 2 od class B");
    }
    void cetak3() {
        System.out.println("this iss method 3 of class B");
    }
}
class ClassC extends ClassA {
      void cetak2() {
        System.out.println("this is method 2 od class C");
    }
    void cetak3() {
        System.out.println("this iss method 3 of class c");
    }
}
public class Perc6yudhap1abstract {

    public static void main(String[] args) {
        ClassA obj1 = new ClassB();
        obj1.cetak2();
        obj1.cetak3();
        ClassA obj2 = new ClassC();
        obj2.cetak2();
        obj2.cetak3();
    }
    
}
