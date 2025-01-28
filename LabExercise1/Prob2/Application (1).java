
public class Application
{
   public static void main (String[] args) {
	Mother obj1= new Mother(); //If the Mother type reference refers to a mother class object then mother'show() is called.
	obj1.show();
	System.out.print("    ");
	Mother obj2 = new Child(); // If a Mother type reference refers to a Child object then Child's show() is called. This is called RUN TIME POLYMORPHISM.
	obj2.show();
	System.out.print("    ");
	Child obj3 = new Child();  //If a Child type reference refer to the child object then child'show() is called.
	obj3.show();
   }
}
