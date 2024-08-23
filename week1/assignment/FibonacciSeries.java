package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f1=0,f2=1,f3;
for (int i = 0; i < 8; i++) {
	System.out.println(f1);
	f3=f1+f2;
	f1=f2;
	f2=f3;
}
	}

}
