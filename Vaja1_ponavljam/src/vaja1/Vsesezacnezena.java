package vaja1;

public class Vsesezacnezena {

	public static void main(String[] args) {
		String str = "greznica";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(zEna(3));

	}
	
	public static String[] zEna(int n) {
		String prvotni = "1";
		String[] tabela = new String[n];
		int i = n;
		while (0 < i){
			for (int k = 0; k < prvotni.length(); k++){
				System.out.println(prvotni.charAt(k));
				int stevilo = prvotni.charAt(k);
				System.out.println(stevilo);
				for (int m = 0; m < 5; m++){
					
				}
					int stevec = 0;
				
			}
			i--;
			
		}
		return null;
	}

}
