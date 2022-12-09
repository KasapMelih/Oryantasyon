package yazılımOryantasyonu;
import java.util.Scanner;
public class soru9 {

	public static void main(String[] args) {
		/* Taksşmetre hesabı açılıs 10 tl km basına 2.20 kurus ücret
		 ve ücret 20 tlden az olamaz.
		 */
	  Scanner scanner =new Scanner(System.in);
	  int km;
	  double kmfiyat,taksimetre;
	  
	  System.out.print("Lutfen kac km mesafe gideceginizi yazin: ");
	  km=scanner.nextInt();
	  kmfiyat=km*2.20;
	  taksimetre=kmfiyat+10;
	  if (taksimetre<20)
		  System.out.print("Ucretiniz 20 TL");
	  else 
		  System.out.print("Ucretiniz "+taksimetre+" TL");
		  
	  
	  
	  
	  
	  
	  
	  
	}

}
