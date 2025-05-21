package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar); // Not accessible - different package, not subclass
        System.out.println("Protected: " + protectedVar); // ✅ Accessible - inherited
        // System.out.println("Private: " + privateVar); // ❌ Not accessible - private
        System.out.println("Public: " + publicVar); // ✅ Accessible
    }
}
