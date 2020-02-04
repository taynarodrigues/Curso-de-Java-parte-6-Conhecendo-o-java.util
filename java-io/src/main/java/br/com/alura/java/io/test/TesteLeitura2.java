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
			System.out.println(linha);	
			
			Scanner scanner = new Scanner(linha);
			scanner.useLocale(Locale.US);
			scanner.useDelimiter(",");
			
			String valor1 = scanner.next();
			int valor2 = scanner.nextInt();
			String valor3 = scanner.next();
			String valor4 = scanner.next(); 
			double valor5 = scanner.nextDouble();
		
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			scanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}	
		scan.close();
		
	}

}
