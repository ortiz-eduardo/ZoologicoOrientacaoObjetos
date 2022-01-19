package br.com.treinaweb.zoologico.classes;


public class Cachorro extends Animal{
	
	// Construto da classe 
	//o termo "super" faz a referências as variáveis da superclasse ou classe-mãe;
	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}
	
	// Método emitirBarulho sobreescrito da superclasse
	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Barulho do Cachorro!");			
		} else {
			System.out.println("O Cachorro morreu!");
		}
	}
	
	//Verificando se o cachorro é adulto
	@Override
	public Boolean ehAdulto() {
		if(estaVivo) {
			return idade >= 2;
		} else {
			return false;
		}
	}
}
