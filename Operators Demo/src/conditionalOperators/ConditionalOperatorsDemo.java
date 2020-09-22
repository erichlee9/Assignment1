package conditionalOperators;

public class ConditionalOperatorsDemo {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=35;
		int c=78;
		
		if(a>b) {
			System.out.println("This won't print");
		}
		else {
			System.out.println("a is not greater than b");
		}
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else if(b<c) {
			System.out.println("this shouldn't print b/c the above already printed");
		}
		else {
			System.out.println("nothing will print here because the first if in this series already printed");
		}
	}

}
