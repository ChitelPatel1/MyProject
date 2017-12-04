
public class ReverseString {

	public static void main(String[] args) {
		// reverse the string "tester" to "retset"
		
		String a = "Tester";
		
		StringBuffer rverse = new StringBuffer(a);
		System.out.println(rverse.reverse());
	
		 
        // convert String to character array
        // by using toCharArray
		
		String b = "Hello World";
        char[] try1 = b.toCharArray();
 
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
    }
	

}
