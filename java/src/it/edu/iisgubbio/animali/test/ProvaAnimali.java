package it.edu.iisgubbio.animali.test;

import id.edu.iisgubbio.animali.cani.Cane;
import id.edu.iisgubbio.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cane caneGiulia = new Cane("Athena", 2021);
		caneGiulia.setRazza("bovaro del bernese");
		System.out.println(caneGiulia.getRazza());
		caneGiulia.setAnnoNascita(caneGiulia.getAnnoNascita()+1);
		System.out.println(caneGiulia.getAnnoNascita());

		Cuccia cucciaAthena;
		cucciaAthena = new Cuccia (true ,20,"bianca",12.3);
		cucciaAthena.setNumeroPosti(6);
		System.out.println(cucciaAthena);
	}
}