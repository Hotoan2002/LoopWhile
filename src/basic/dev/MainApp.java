package basic.dev;

import java.util.Scanner;

/**
 * 
 * @author Toan
 *bai 11 vong lap while
 */
public class MainApp {

	public static void main(String[] args) {
		// bai 11.1 viet chuogn trinh tinh tong cac so tu 1 den 100
		int i = 0 ;
		int tong = 0;
		while(i <= 100) {
			tong +=i;
			i++;
		}
		System.out.println("Tong : "+ tong);
		//bai 11.2 viet chuong trinh nhap vao mot so tu nhien , tinh tong cac so chia het cho 3
		System.out.println("*********bai 11.2*********");
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n: ");
		int n = sc.nextInt();
		i = 0;
		tong = 0;
		while(i <= n) {
			if(i % 3 == 0)
				tong += i;
			i++;
		}
		System.out.println("Tong cac so chia het cho 3:" + tong);	
		//bai 11.3 viet chuong trinh in ra 100 so fibonacci
		System.out.println("*********bai 11.3*********");
		// so fibonacci 1 2 3 5 8 13 21 
		System.out.println("100 so fibonacci");
		int first = 1;
		int last = 2;
		int dem = 0;
		while(dem <= 100) {
			System.out.println(first);
			int t = first + last;
			first = last;
			last = t;
			dem++;
		}
		//bai 11.4 viet phuong trinh kiem tra so nguyen n co phai la so pilimo,
		System.out.println("*********bai 11.4*********");
		System.out.println("Nhap vao so nguyen:");
		n = sc.nextInt();
		int origin = n;
		int  inverst = 0;
		while(n > 0) {
			int mod = n % 10;
			inverst = inverst * 10 + mod; 
			n = n / 10;
		}
		if(origin == inverst) {
			System.out.println(origin + "la so polinom");
		}
		//bai 11.5 viet chuong chinh liet ke cac so tu 100 den 999 co tong chia het cho 3
		System.out.println("*********bai 11.5*********");
		System.out.println("Tong cac chu so chia het cho 3: ");
		i = 100;
		while(i <= 999) {
			int tong1 = (i/100) + ((i-(i/100)*100)/10)+(i%10);  				
			if(tong1 % 3 == 0)
				System.out.println(i);
			i++;
		}
	}	
}
