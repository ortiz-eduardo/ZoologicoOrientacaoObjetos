package br.com.treinaweb.zoologico.classes;

public interface Animavel {
	
	//Os métodos aqui declarados, deve esta presente na Superclasse ou nas subclasses;
	//Aqui os métodos não tem corpo;
	Boolean ehAdulto();
	void emitirBarulho();
	void morrer();
}
