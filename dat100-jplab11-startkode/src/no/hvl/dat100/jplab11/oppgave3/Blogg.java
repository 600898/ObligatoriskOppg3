package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Blogg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Blogg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		int antall = innleggtabell.length;
		return antall;
	}
	
	public Innlegg[] getSamling() {
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int pos = finnPos(innlegg);
		if (pos >= 0) {
			return innleggtabell[pos];
		}
		else
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
	throw new UnsupportedOperationException(TODO.method());
		}
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		int antall = innleggtabell.length;
		
		if(antall < innleggtabell.length) {
			ledig = true;
		}
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		//TODO
		/* ledigPlass(innlegg);
		if (ledig == true) {
			leggTil();
		}
		else
		*/
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		//TODO return String fra tabellen
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}