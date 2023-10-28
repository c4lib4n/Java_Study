package hello_world;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int alcool = 0, gasolina = 0, diesel = 0, x = 0;
		
		
		System.out.println("Digite o combustivel Abastecido: ");
		x = sc.nextInt();
		
		while(x != 4 ){
			if(x == 1 ){
				alcool += 1;
			}else if(x ==2 ){
				gasolina += 1;
			}else if(x == 3){
				diesel += 1;
			}else{
				System.out.println("Digite um numero entre 1 and 4");
			}
		x = sc.nextInt();	
		}
		
		System.out.println("Muito Obrigado!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasoline: " + gasolina);
		System.out.println("Diesel: " + diesel);		
		
		
		sc.close();
	}
}
