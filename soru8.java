package yazılımOryantasyonu;
import java.util.Scanner;
public class soru8 {

	public static void main(String[] args) {
		/* not ortalaması bulma 
		 matematik   
		 */
		Scanner scanner= new Scanner(System.in);
		int matematik,türkce,müzik,fizik,kimya,tarih;
		double ortalama;
		System.out.print("Lutfen matematik notunuzu giriniz: ");
		matematik=scanner.nextInt();
		System.out.print("Lutfen türkce notunuzu giriniz: ");
		türkce=scanner.nextInt();
		System.out.print("Lutfen müzik notunuzu giriniz: ");
		müzik=scanner.nextInt();
		System.out.print("Lutfen fizik notunuzu giriniz: ");
		fizik=scanner.nextInt();
		System.out.print("Lutfen kimya notunuzu giriniz: ");
		kimya=scanner.nextInt();
		System.out.print("Lutfen tarih notunuzu giriniz: ");
		tarih=scanner.nextInt();
		ortalama=matematik+türkce+müzik+fizik+kimya+tarih;
		ortalama=ortalama/6;
		System.out.print("Not ortalamaniz: "+ortalama);

	}

}
