

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		int len = Integer.parseInt(args[0]);
		for (double i=0 ; i<len; i++) {
			double y = Math.pow(-1, i)*(1/(2*(i)+1));
			piEstimation=piEstimation+y;
			
		}
		piEstimation=4*piEstimation;
		System.out.println(piEstimation + " " + Math.PI);

	}

}
