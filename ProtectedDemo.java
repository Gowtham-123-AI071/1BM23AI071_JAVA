class A {
    int defaultVar = 10;              // default access
    protected int protectedVar = 20;  // protected access
    private int privateVar = 30;      // private access
    public int publicVar = 40;        // public access
}

class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar); // Not accessible - different package (if packages were used)
        System.out.println("Protected: " + protectedVar); // Accessible - subclass
        // System.out.println("Private: " + privateVar); // Not accessible - private
        System.out.println("Public: " + publicVar); // Accessible - public
    }
}

class C {
    public void display() {
        A obj = new A();
        // System.out.println("Default: " + obj.defaultVar); // Not accessible - different package (if packages were used)
        // System.out.println("Protected: " + obj.protectedVar); // Not accessible - not subclass
        // System.out.println("Private: " + obj.privateVar); // Not accessible - private
        System.out.println("Public: " + obj.publicVar); // Accessible - public
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("From Class B:");
        bObj.display();

        System.out.println("From Class C:");
        cObj.display();
    }
}

//
//"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=53725" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\madhu\IdeaProjects\untitled2\out\production\untitled2 ProtectedDemo
//From Class B:
//Protected: 20
//Public: 40
//From Class C:
//Public: 40
//
//Process finished with exit code 0