package yazılımOryantasyonu;
import java.util.Scanner;
public class soru10 {

	public static void main(String[] args) {
		/* Üçgenin alanı 
		 u=(a+b+c)/2;
	alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		 */
	  Scanner scanner = new Scanner(System.in);
	  int a,b,c;
	  double u,alan;
	  System.out.println("Lutfen ucgenin kenarlarının uzunlugunu yazınız: ");
	  a=scanner.nextInt();
	  b=scanner.nextInt();
	  c=scanner.nextInt();
	  u=(a+b+c)/2;
	  alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	  System.out.print("Ucgenin alani: "+alan);
	}

}
