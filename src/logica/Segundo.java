package logica;

import java.util.Scanner;

public class Segundo {

	public int [] Num = new int[10];
	public int i =0;
	public int x =9;
	public Scanner Leitura = new Scanner(System.in);
	
	
	public void Numerar (){
		while(i < 10) {
			System.out.println("Digite um número:");
			Num[i] = Leitura.nextInt();
			i++;	}		
	}
		public void Resolver() {
			while (x> -1) {
				
				System.out.print(Num[x]+ ",");
				x--;
			}
			}
				
	}
	
	
	
	
	

