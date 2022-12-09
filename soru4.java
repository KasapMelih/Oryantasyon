package yazılımOryantasyonu;
import java.util.Scanner;
public class soru4 {

	public static void main(String[] args) {
		//Switch case ile basit hesap makinesi yapımı
	Scanner scanner = new Scanner(System.in);
	double sayı1,sayı2;
	int secim;
	System.out.print("Lutfen bir sayı giriniz: ");
	sayı1=scanner.nextDouble();
	System.out.print("Lutfen bir sayı giriniz: ");
	sayı2=scanner.nextDouble();
	System.out.print("Lutfen yapmak istediginiz islem turunu seciniz 1-toplama , 2-cıkarma 3-carpma , 4-bolme \n: " );
	secim=scanner.nextInt();
	switch (secim) {
	   case 1 : System.out.print(sayı1+" + "+sayı2+" : "+(sayı1+sayı2));
	   break;
	   case 2 : System.out.print(sayı1+" - "+sayı2+" : "+(sayı1-sayı2));
	   break;
	   case 3 : System.out.print(sayı1+" * "+sayı2+" : "+(sayı1*sayı2));
	   break;
	   case 4 : System.out.print(sayı1+" / "+sayı2+" : "+(sayı1/sayı2));
	   break;
	}
		
	
	

	}

}
