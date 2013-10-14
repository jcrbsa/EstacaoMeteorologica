package inputoutputdata;

import java.io.*;

class EscreveArquivo {
	public static void main(String args[]) {
		try {
			File f = new File(
					"C:\\Documents and Settings\\jcrbsa\\Meus documentos\\MeuArquivo.txt");
			FileWriter fr = new FileWriter(f);
			PrintWriter out = new PrintWriter(fr);
			// Ver a codificação abaixo, para UNICODE (FileWriter,FileReader)
			System.out.println(System.getProperty("file.encoding"));

			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo.");
		}
	}
}