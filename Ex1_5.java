public class Ex1_5 {
	public static void main(String[] args) {
		int i, sum = 0;
		
		i = 1;
		do {
		    sum = sum+i;
		    i = i+1;
		   } while(i <= 10);
		
		System.out.println("1+2+…+10=" + sum);
	}
}