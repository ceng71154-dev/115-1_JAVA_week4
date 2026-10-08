public class Ex1_4 {
	public static void main(String[] args) {
		int i, sum = 0;
		
		i = 1;
		while(true) {
		    sum = sum+i;
		    i = i+1;
		    if (i > 10)
		      break;
		}
		System.out.println("1+2+…+10=" + sum);
	}
}