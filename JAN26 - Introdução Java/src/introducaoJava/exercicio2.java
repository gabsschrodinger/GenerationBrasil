package introducaoJava;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int anos, meses, dias, total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("H� quantos dias voc� est� vivo? ");
		total = ler.nextInt();
		
		anos = total / 365;
		meses = (total % 365) / 30;
		dias = total - anos*365 - meses*30;
		
		System.out.println("Voc� est� vivo h� "+ anos+ " anos, "+ meses+ " meses e "+ dias+ " dias!!!");
	}
}
