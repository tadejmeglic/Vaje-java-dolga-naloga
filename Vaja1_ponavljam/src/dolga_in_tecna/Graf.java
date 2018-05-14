package dolga_in_tecna;

import java.util.Map;
import java.util.TreeMap;

public class Graf {
	protected Map<Object, Tocka> tocke;
	
	public Graf(){
		tocke = new TreeMap<Object, Tocka>();
	}
	
	public Tocka tocka(Object ime){
		return tocke.get(ime);
	}
	
	public boolean povezava(Tocka a, Tocka b){
		return b.sosedi.contains(a);
	}
	
	public void dodajTocko(Tocka a){
		if (!tocke.containsKey(a.ime)){
			tocke.put(a.ime, a);
		}
	}
	
	public void dodajPovezavo(Tocka a, Tocka b){
		if (!povezava(a, b)){
			a.sosedi.add(b);
			b.sosedi.add(a);
		}
	}
	
	public void odstraniPovezavo(Tocka a, Tocka b){
		if (povezava(a, b)){
			a.sosedi.remove(b);
			b.sosedi.remove(a);
		}
	}
	
	public void odstraniTocko(Tocka a){
		for (Tocka b:a.sosedi){
			odstraniPovezavo(a, b);
		}
		tocke.remove(a);
	}

}
