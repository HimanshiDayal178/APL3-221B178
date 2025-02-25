public class EagerInitialization {
    // The instance is created as soon as the class is loaded
    private static final EagerInitialization instance = new EagerInitialization();

    // Private constructor to prevent instantiation from other classes
    private EagerInitialization() {
        System.out.println("EagerInitialization instance created!");
    }

    // Public method to access the instance
    public static EagerInitialization getInstance() {
        return instance;  // Return the already created instance
    }

    // A simple method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from EagerInitialization!");
    }

    public static void main(String[] args) {
        System.out.println("Before calling getInstance()");

        // Instance is already created, so we directly use it
        EagerInitialization eagerInit = EagerInitialization.getInstance();
        eagerInit.showMessage();

        // The same instance will be returned again
        EagerInitialization anotherInstance = EagerInitialization.getInstance();
        anotherInstance.showMessage();
    }
}
