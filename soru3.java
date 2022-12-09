package yazılımOryantasyonu;
import java.util.Scanner;
public class soru3 {

	public static void main(String[] args) {
		/* daire diliminin alanını bulma 
		 pi:3.14 a=açı  alan (pi*(r*r)*a)/360 
		 */
		Scanner scanner=new Scanner(System.in);
		int a,r;
		double alan;
		double pi=3.14;
		System.out.print("Lutfen dairenin yaricap degerini giriniz: ");
		r=scanner.nextInt();
		System.out.print("Lutfen dairenin acisini giriniz: ");
		a=scanner.nextInt();
		alan = (pi*(r*r)*a)/360;
		System.out.print("Daire dilimin alani: "+alan);
	}

}
