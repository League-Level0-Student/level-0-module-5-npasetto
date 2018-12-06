
public class for_loops {
public static void main(String[] args) {
	for1();
	for2();
	for3();
	for4();
	for5();
	for6();
	for7();
}
public static void for1() {
	for (int i = 1; i <= 500; i++) {
		if (i%2==0) {
			System.out.println(i+" is even");
		} else {
            System.out.println(i+" is odd");
		}
	}
}
public static void for2() {
	for (int i = 0; i <= 111; i++) {
		System.out.println(i*7);
	}
}
public static void for3() {
	for (int i = 2008; i <= 2018; i++) {
		System.out.println("In "+i+" i was "+(i-2008)+" years old.");
	}
}
public static void for4() {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i+" "+j);
		}
	}
}
public static void for5() {
	for (int i = 1; i <= 9; i++) {
		if (i%3==0) {
			System.out.println(i);
		} else {
            System.out.print(i+"\t");
		}
	}
}
public static void for6() {
	for (int i = 1; i <= 100; i++) {
		if (i%10==0) {
			System.out.println(i);
		} else {
            System.out.print(i+"\t");
		}
	}
}
public static void for7() {
	for (int i = 0; i <=6; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("* ");
		}
		System.out.println("*");
	}
}
}
