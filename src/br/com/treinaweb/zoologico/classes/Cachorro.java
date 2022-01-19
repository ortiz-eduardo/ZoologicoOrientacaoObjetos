package br.com.treinaweb.zoologico.classes;


public class Cachorro extends Animal{
	
	// Construto da classe 
	//o termo "super" faz a refer�ncias as vari�veis da superclasse ou classe-m�e;
	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}
	
	// M�todo emitirBarulho sobreescrito da superclasse
	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Barulho do Cachorro!");			
		} else {
			System.out.println("O Cachorro morreu!");
		}
	}
	
	//Verificando se o cachorro � adulto
	@Override
	public Boolean ehAdulto() {
		if(estaVivo) {
			return idade >= 2;
		} else {
			return false;
		}
	}
}
