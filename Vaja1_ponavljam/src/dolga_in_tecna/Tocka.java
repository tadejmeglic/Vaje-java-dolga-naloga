package dolga_in_tecna;

import java.util.Collections;
import java.util.Set;

public class Tocka {
	protected Object ime;
	protected Set<Tocka> sosedi;
	protected int x;
	protected int y;
	
	public Tocka(Object imeTocke){
		ime = imeTocke;
		sosedi = Collections.emptySet();
	}
	
	public int stopnja(){
		return sosedi.size();
	}

}
