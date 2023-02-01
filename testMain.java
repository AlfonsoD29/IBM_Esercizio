package esercitazione;

import java.io.IOException;
import java.util.Scanner;

public class EsercitazioneTest {

	public static void main(String[] args) {
	
		Calcolatrice main = new Calcolatrice();
		double a,b;
		Scanner in = new Scanner(System.in);
		int scelta =0;
	
		
			
			System.out.println("Dammi il primo numero : \n");
			a= in.nextDouble();
			System.out.println("Dammi il secondo numero : \n");
			b= in.nextDouble();
			
			main.setA(a);
			main.setB(b);
			
			System.out.println("Scegli l'operazione da fare\n");
			System.out.println("1)Somma\n");
			System.out.println("2)Moltiplicazione\n");
			System.out.println("3)Divisione\n");
			System.out.println("4)Sottrazione\n");
			System.out.println("0)Esci\n");
			scelta = in.nextInt();
			
			
			switch (scelta) {
			case 1:
				System.out.println("Risultato : " + main.somma(a, b)+ "\n");
				break;
				
			case 2:
				System.out.println("Risultato : " + main.moltiplicazione(a, b)+ "\n");
				break;
				
			case 3:
				System.out.println("Risultato : " + main.divisione(a, b)+ "\n");
				break;
				
			case 4:
				System.out.println("Risultato : " + main.sottrazione(a, b)+ "\n");
				break;
			default:
				break;
			}
		}
		while(scelta !=0);

	}

}
