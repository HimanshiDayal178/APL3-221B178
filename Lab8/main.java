public class Main{
    public static void main(String args[]){
        Crow crow = new Indiancrow();
        CrowAdapter crowadapter = new CrowAdapter(crow);
        Princess(crowadapter);
    }
}