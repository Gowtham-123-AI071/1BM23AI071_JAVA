package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A();
        // System.out.println("Default: " + obj.defaultVar); // ❌ Not accessible - different package
        // System.out.println("Protected: " + obj.protectedVar); // ❌ Not accessible via object
        // System.out.println("Private: " + obj.privateVar); // ❌ Not accessible - private
        System.out.println("Public: " + obj.publicVar); // ✅ Accessible
    }
}
