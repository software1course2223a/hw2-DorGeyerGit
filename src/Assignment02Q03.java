
public class Assignment02Q03 {

	public static void main(String[] args) {
		
		int numOfOdd = 2;
		String series = "1 1 2";
		int last = 2;
		int before_last= 1;
		int len = Integer.parseInt(args[0]);
		for (int i=0; i<len; i++) {
			int current_element= last + before_last;
			if (current_element%2==1) {numOfOdd+=1;};
			before_last=last;
			last=current_element;
			series = series + " " + current_element;
		}
		int n = len;
		
		
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		System.out.println(series);
		
		
		System.out.println("The number of odd numbers is: "+numOfOdd);

	}

}
