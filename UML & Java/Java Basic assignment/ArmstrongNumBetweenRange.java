import java.util.Scanner;

class ArmstrongNot {
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
public class ArmstrongNumBetweenRange {
	public static int[] armstrongNumbersInRange(int min, int max) 
	{
        for (int i = min; i <= max;i++)
        {
            if (ArmstrongNot.armstrongCheck(i)) 
            {
                System.out.print(i+" ");
            }
        }
        return null;
        }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Range start : ");
        int min = sc.nextInt();
        System.out.print("Range end : ");
        int max = sc.nextInt();
        
        ArmstrongNumBetweenRange.armstrongNumbersInRange(min,max);

	}

}
