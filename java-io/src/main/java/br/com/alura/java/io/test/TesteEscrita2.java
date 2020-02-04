package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de entrada  com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
//		fw.newLine();
		fw.write("ipsum dolor sit amet");
		

		
		fw.close();
	}

}
