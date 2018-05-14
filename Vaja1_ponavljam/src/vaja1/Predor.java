package vaja1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Predor {

	public static void main(String[] args) throws IOException {
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
		krsitelji("podatki.txt", "krsitelji.txt");

	}
	
	public static int krsitelji(String imeVhodne, String imeIzhodne) throws IOException{
		int st_krsiteljev = 0;
		double omejitev = 80 / 3.6;
		int dolzinaPredora = 622;
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhodne));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhodne));
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", symbol);
		df.setRoundingMode(RoundingMode.HALF_UP);
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String[] podatki = vrstica.split(" ");
			int vstop = Integer.parseInt(podatki[0]);
			int izstop = Integer.parseInt(podatki[1]);
			String registrska = podatki[2];
			float hitrost = dolzinaPredora / (izstop - vstop);
			if (hitrost > omejitev){
				st_krsiteljev++;
				izhod.println(registrska + " " + df.format(hitrost));
			}
			
		}
		izhod.close();
		vhod.close();
		return st_krsiteljev;
	}

}
