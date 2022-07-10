package projetoestruturadedados.gerenciadorarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoManager {

	public static void leitor(String path) throws IOException {
		String linha = "";
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		while(true) {
			if(linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escritor(String nome, String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(nome + "\n");
		buffWrite.close();
	}
}
