package yazılımOryantasyonu;
import java.util.Scanner;
public class soru2 {

	public static void main(String[] args) {
		/*bki hesaplama
		 kilo/(boy*boy)
		 */
     Scanner scanner =new Scanner(System.in);  
     double boy,kilo,bki;
     System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
     boy=scanner.nextDouble();
     System.out.print("Lutfen kilonuzu kilogram cinsinden giriniz: ");
     kilo=scanner.nextDouble();
     bki= kilo/(boy*boy);
     System.out.print("BKI oranınız: "+bki);
	}

}
