package yazılımOryantasyonu;
import java.util.Scanner;
public class soru5 {

	public static void main(String[] args) {
		// Hipotenüs değerini math.sqrt kütüphanesi ile bulmak
	Scanner scanner= new Scanner(System.in);
	int a,b,hipotenüs;
	System.out.print("Lutfen ucgenin a kenarini giriniz: ");
	a=scanner.nextInt();
	System.out.print("Lutfen ucgenin b kenarini giriniz: ");
	b=scanner.nextInt();
	System.out.print("Hipotenus degeri: "+Math.sqrt((a*a)+(b*b)));
	}

}
