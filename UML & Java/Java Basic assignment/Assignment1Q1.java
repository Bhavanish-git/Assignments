import java.util.Scanner;

class AmstrongorNot {
    public static boolean armstrongCheck(int num) {
        int b, c, d = 0, temp;
        temp = num;
        while (temp > 0) {
            b = temp % 10;
            c = b * b * b;
            d = c + d;
            temp = temp / 10;
        }
        return d == num;
    }
}
public class Assignment1Q1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = scanner.nextInt();
		scanner.close();
		System.out.print(AmstrongorNot.armstrongCheck(num));
	}

}
