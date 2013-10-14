package inputoutputdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeArquivo {
	
	public static void main (String args []) {
		String filename = "C:\\Documents and Settings\\jcrbsa\\Meus documentos\\dados.txt";
		try {
		FileReader fr = new FileReader (filename);
		BufferedReader in = new BufferedReader (fr);
		String line;
		int dias = 0;
	
		List<String[]> rows = new ArrayList<String[]>();

	 while ( (line=in.readLine())!= null) {
		 String[] temp = line.split(":");
	
				//replaceAll("^[:\\s]+", "\\t").split("[:\\s]+");
		 rows.add(temp);
		 dias = dias +1;
	}
		
		in.close ();
		for (int i = 0 ;i< rows.size() ;i++){
				for (int j = 0 ;j< rows.get(i).length ;j++){
					System.out.println(rows.get(i)[j]);
			}
		}
		}
		catch (IOException e) {
		System.out.println ("Erro na leitura do arquivo "+filename);
		}
		}

}
