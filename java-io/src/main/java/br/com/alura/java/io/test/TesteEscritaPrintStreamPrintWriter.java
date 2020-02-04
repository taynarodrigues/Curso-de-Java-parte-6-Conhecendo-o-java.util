package br.com.alura.java.io.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter{

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de entrada  com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("ayyyyy");
		ps.println();
		ps.println("ohohohoohohohohooh");
		
		ps.close();
	}

}
