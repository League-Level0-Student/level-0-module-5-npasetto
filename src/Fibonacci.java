
public class Fibonacci {
public static void main(String[] args) {
	int int1=1;
	int int2=0;
	int sub=0;
	for (int i = 0; i < 13; i++) {
		System.out.println(int2);
		sub=int1;
		int1=int2;
		int2=sub+int2;
	}
}
}
