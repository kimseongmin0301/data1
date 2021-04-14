import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		

		try {
			System.out.print("�������� �Է��Ͻÿ�: ");
			dividend = sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ�: ");
			divisor = sc.nextInt();
			
			System.out.println(dividend+"��"+divisor+"�� ������ ���� "+(dividend/divisor)+"�Դϴ�.");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�!");		
		}
		catch(InputMismatchException e) {
			System.out.println("���ڸ� ���");
		}
		
		finally {
			sc.close();
		}
	}

}
