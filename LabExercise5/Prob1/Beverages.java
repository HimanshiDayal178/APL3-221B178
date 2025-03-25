

abstract class Beverages{
    
    void templateMethod(int qty){
        pourbeverage(qty);
        addcondiments();
        stir();
        serve();
        
    }
    
    
    private void pourbeverage(int qty){
        System.out.println("pour"+qty+"of beverage into a glass");
    }
    
    protected abstract void addcondiments();
    protected void stir(){
        
    }
    
    private void serve(){
        System.out.println("serve through waiter");
    }
        
    
}