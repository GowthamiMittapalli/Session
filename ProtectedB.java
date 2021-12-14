package AccessModifier;

public class ProtectedB {
	protected void bag() {
	
	System.out.println("Calling protected method without subclass");
}
	
public static void main(String [] args) {
	ProtectedB s = new ProtectedB();
	s.bag();
}
}