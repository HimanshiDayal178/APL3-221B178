// Two.java (Subclass)
class Two extends One {
    // Constructor in class Two explicitly calls the parameterized constructor of One
    Two(int x) {
        super(x);  // This calls the constructor of One with the integer argument
        System.out.println("Two's constructor with parameter: " + x);
    }
}
