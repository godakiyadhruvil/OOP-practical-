
package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A(int a, int b, int c) {
        pubVar = a;
        protVar = b;
        privVar = c;
    }
}

package bpack;

import apack.A;

public class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("From Class B (Inheritance):");
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);
        // System.out.println("Private Variable: " + privVar); // Not accessible
    }
}

package cpack;

import apack.A;

public class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("From Class C (Object Creation):");
        System.out.println("Public Variable: " + obj.pubVar);
        // System.out.println("Protected Variable: " + obj.protVar); // Not accessible
        // System.out.println("Private Variable: " + obj.privVar);   // Not accessible
    }
}

package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        C c = new C();

        b.display();
        c.display();
    }
}
