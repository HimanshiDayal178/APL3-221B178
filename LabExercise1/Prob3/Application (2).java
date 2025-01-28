public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Polymorphism: Mother reference, Child object
        m1.show(); // Calling the static method
        
     // show() is static in Mother, non-static in Child :Static methods are resolved at compile-time based on the reference type, which is Mother.(giving error)
    // show() is static in Child, non-static in Mother :Static methods are resolved at compile-time based on the reference type, which is Mother.(giving error)
    //show() is static in both Mother and Child : Static methods are resolved at compile-time; m1 is of type Mother, so Mother's static method is called.
        
    }
}
