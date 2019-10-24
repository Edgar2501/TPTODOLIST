package todo;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// creation de tache
		Tache maison = new Tache("maison","etage 3 niveau","termine","rien");
		Tache voiture = new Tache("voiture","4 porte", "non","retouche");
		Tache telephone = new Tache("telephone","iphone", "termine","reconditionne");
		
		// creation de tableau de tache 
		Collection<Tache> tabtach = new ArrayList<>();
		
		tabtach.add(maison);
		tabtach.add(voiture);
		tabtach.add(telephone);
		
		red.gettabtach();
		
	}
}
