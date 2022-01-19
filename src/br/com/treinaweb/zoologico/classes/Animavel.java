package br.com.treinaweb.zoologico.classes;

public interface Animavel {
	
	//Os m�todos aqui declarados, deve esta presente na Superclasse ou nas subclasses;
	//Aqui os m�todos n�o tem corpo;
	Boolean ehAdulto();
	void emitirBarulho();
	void morrer();
}
