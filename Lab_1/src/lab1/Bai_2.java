/**
 Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
diện tích và cạnh nhỏ của hình chữ nhật.

 */
package lab1;

import java.util.Scanner;
/**
 * 
 */
public class Bai_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài:");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng:");
		double rong = scanner.nextDouble();
	
		double chuVi = (dai + rong)*2;
		double dienTich = dai*rong;
		double canhNho = Math.min(dai, rong);
		
		System.out.println("==========Kết quả========");
		System.out.printf("Chu vi hình chữ nhật là: %.2f\n", chuVi);
		System.out.printf("Diện tích hình chữ nhật là: %.2f\n", dienTich);
		System.out.println("Cạnh nhỏ nhất: " + canhNho);
	}

}
