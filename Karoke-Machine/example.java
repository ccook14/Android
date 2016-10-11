import java.util.*;
public class Example {

	
	public static void main(String[]args) {
		Treet treet = new Treet(
				"clickclockpow",
				"This is an example tweet for this program #treet",
				new Date(1421849732000L)
				);
		System.out.printf("This is a new Treet:  %s %n",  treet);
		
		
	}
}
