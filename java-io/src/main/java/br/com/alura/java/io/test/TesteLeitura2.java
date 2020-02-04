package br.com.alura.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
//			System.out.println(linha);	
			
			Scanner scanner = new Scanner(linha);
			scanner.useLocale(Locale.US);
			scanner.useDelimiter(",");
			
			String tipoConta = scanner.next();
			int agencia = scanner.nextInt();
			int numero = scanner.nextInt();
			String titular = scanner.next(); 
			double saldo = scanner.nextDouble();
		
			String valorFormatado = String.format("%s - %04d - %08d  %s: %05.2f", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			
			scanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}	
		scan.close();
		
	}

}
