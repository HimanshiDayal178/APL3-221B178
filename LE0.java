class JUET {
    private int age;
    private String name;
    
    // Getter for name
    public String getname() {
        return name;  // Returns the name of the person
    }
    
    // Setter for name
    public void setname(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;  // Returns the age of the person
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        JUET person = new JUET();
        
        // Set the name and age using setters
        person.setname("Himanshi");
        person.setAge(21);
        
        // Print the name and age using getters
        System.out.println("Name: " + person.getname());  // Output: Name: Himanshi
        System.out.println("Age: " + person.getAge());    // Output: Age: 21
    }
}
