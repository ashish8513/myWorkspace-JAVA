// File: AccessModifiersDemo.java
package example;

public class AccessModifiersDemo {

    public String publicVar = "I am Public";
    protected String protectedVar = "I am Protected";
    String defaultVar = "I am Default";
    private String privateVar = "I am Private";

    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in the same package or subclass");
    }

    void defaultMethod() {
        System.out.println("Default Method: Accessible in the same package");
    }

    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class");
    }

    public void testAccess() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
