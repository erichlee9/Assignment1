package logicalOperators;

public class LogicalOperatorsDemo {
	
	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=false;
		
		System.out.println("x && y = " + (a&&b));
		System.out.println("x || y = " + (a||b) );
		System.out.println("!(x && y) = " + !(a && b));
	}

}
