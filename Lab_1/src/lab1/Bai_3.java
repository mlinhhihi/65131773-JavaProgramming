/**
 Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
thể tích của khối lập phương
 */
package lab1;

import java.util.Scanner;
/**
 * 
 */
public class Bai_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		
		double V = Math.pow(canh,3);
		
		System.out.printf("Thể tích khối lập phương: %.2f", V);
		scanner.close();
	}

}
