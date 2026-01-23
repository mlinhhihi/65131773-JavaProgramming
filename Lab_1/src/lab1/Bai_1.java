/**
 Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.
 */
package lab1;
//
import java.util.Scanner;

/**
 * 
 */
public class Bai_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên:");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB:");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %.2f điểm", hoTen, diemTB);
	}

}
