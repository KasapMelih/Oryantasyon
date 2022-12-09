package yazılımOryantasyonu;
import java.util.Scanner;
public class soru7 {

	public static void main(String[] args) {
		/* Manav kasa problemi
		 Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00
		 */
	  Scanner scanner=new Scanner(System.in);
	  double toplam,Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00,Elmakg,Armutkg,Domateskg,Muzkg,Patlıcankg;
	  System.out.print("Lutfen kac kilo elma alıcaginizi yaziniz: ");
	  Elmakg=scanner.nextDouble();
	  System.out.print("Lutfen kac kilo armut alıcaginizi yaziniz: ");
	  Armutkg=scanner.nextDouble();
	  System.out.print("Lutfen kac kilo domates alıcaginizi yaziniz: ");
	  Domateskg=scanner.nextDouble();
	  System.out.print("Lutfen kac kilo muz alıcaginizi yaziniz: ");
	  Muzkg=scanner.nextDouble();
	  System.out.print("Lutfen kac kilo patlıcan alıcaginizi yaziniz: ");
	  Patlıcankg=scanner.nextDouble();
	  toplam= Armut*Armutkg+Elma*Elmakg+Domates*Domateskg+Muz*Muzkg+Patlıcan*Patlıcankg;
	  System.out.print("Alisveirisinizin tutari: "+toplam+" TL'dir.");

	}

}
