package vaja1;

public class Vsesezacnezena2 {

	public static void main(String[] args) {
		String str = "  kobal    kombajn  ";
		System.out.println(str.trim());

	}
	
	public static String[] zEna(int n) {
		String prvotni = "1";
		String[] tabela = new String[n];
		int i = n;
		while (0 < i){
			for (int k = 0; k < prvotni.length(); k++){
				int p = Integer.parseInt(Character.toString(prvotni.charAt(k)));
				System.out.println(p);
				int stevec = 0;
				for (int m = 0; m < 5; m++){
					
				}

				
			}
			i--;
			
		}
		return null;
	}

}
