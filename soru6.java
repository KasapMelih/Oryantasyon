package yazılımOryantasyonu;
import java.util.Scanner;
public class soru6 {

	public static void main(String[] args) {
		// KDV hesaplama 1000 TL'nin altında %18 1000 TL'nin üstünde %8
	Scanner scanner=new Scanner(System.in);
	int fiyat;
	double kdv,kdvsiz;
	System.out.print("Lutfen urunun fiyatini giriniz: ");
	fiyat=scanner.nextInt();
	if (fiyat<1000) {
		kdv=0.18;
		kdvsiz=fiyat*kdv;
		kdvsiz=fiyat-kdvsiz;
		System.out.print("Urunun kdvsiz fiyati: "+kdvsiz);
	}
	else {
		kdv=0.08;
		kdvsiz=kdv*fiyat;
		kdvsiz=fiyat-kdvsiz;
		System.out.print("Urunun kdvsiz fiyati: "+kdvsiz);
	}
	}

}
