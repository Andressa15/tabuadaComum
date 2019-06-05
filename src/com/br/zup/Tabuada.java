package com.br.zup;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		System.out.println(" Que tipo de tabuada que voce quer?");
		
		int tipoTabuada = scan.nextInt();

		for ( int controle = tipoTabuada; controle <= 10; controle++ ) {
			
			System.out.println( tipoTabuada + " x" + controle + "=" + (tipoTabuada * controle));




		}





		}

	}
