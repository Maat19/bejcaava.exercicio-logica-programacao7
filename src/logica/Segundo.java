package logica;

import java.util.Scanner;
import java.util.Arrays;

public class Segundo {

	public int [] Num = new int[10];
	public int i =0;
	public int x =9;
	public Scanner Leitura = new Scanner(System.in);
	
	
	public void Numerar (){
		while(i < 10) {
			
			try {
			System.out.println("Digite um número:");
			Num[i] = Leitura.nextInt();
			i++;	
			}
			
			catch (java.util.InputMismatchException e) {
				System.out.println("Digitar somente números!!");
				Leitura.nextLine();
			}
		}
	}
		
		public void Resolver() {
			while (x> -1) {
				
				System.out.print(Num[x]+ ",");
				x--;
			}
			}
				
	}
	
	
	
	
	

