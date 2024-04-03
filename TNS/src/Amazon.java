
public interface Amazon {
 void welcome();
 void subscribe();// abstract methods 
 
 default void serviceCharge()//feature introduction in java 8 
 {
	 int amt=100;
	 System.out.println("the service charge is "+ amt);
	 
 }
 
}
