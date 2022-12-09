package Lab11;

import java.util.Scanner;

public class LabProgram {

    public static int fibonacci(int n) {
        if (n < 0)
            return -1;
        int f0 = 0, f1 = 1, f;
        for (int i = 0; i < n; i++) {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f0;
    }

    public static void main(String[] args) {
        	try(Scanner in = new Scanner(System.in)) {
			int number;

			number = in.nextInt();
			System.out.println("fibonacci(" + number + ") is " + fibonacci(number));
		}
    }
}