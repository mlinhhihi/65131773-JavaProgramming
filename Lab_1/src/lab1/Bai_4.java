/**
 Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn
delta ra màn hình.
HƯỚNG DẪN:
✓ Delta = Math.pow(b, 2) – 4 * a * c
✓ Sử dụng Math.sqrt(delta) để tính căn delta

 */
package lab1;

import java.util.Scanner;
/**
 * 
 */
public class Bai_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();

		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b,2) - 4*a*c;
		
		System.out.printf("Deltal của phương trình bậc 2 là: %.2f\n", delta);
		
		if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta = %.2f", canDelta);
        } else {
            System.out.printf("Delta âm!!");
        }

        scanner.close();
	}

}
