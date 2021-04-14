import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect() {
		this(0,0);//width =0; height =0;
	}
	public Rect(int wigth) {
		this(wigth,0); //= wigth; height = 0;
	}
	public Rect(byte h) {
		this(0,h); //width = 0; height = h;
	}
	public Rect(int w,int h) {
		width = w; height = h;
	}
	void changewidth(int newWidth){
		width = newWidth;
	}
	public int getArea(){
		return width * height;
	}
}

public class rectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("����: ");
		i = sc.nextInt();
		System.out.print("����: ");
		j = sc.nextInt();
		
		Rect r1 = new Rect(i,j);

		
		System.out.println(r1.getArea());
		System.out.print("���ο� ���̰�: ");
		i = sc.nextInt();
		r1.changewidth(i);
		
		System.out.println(r1.getArea());
		sc.close();
		
	}
	

}
