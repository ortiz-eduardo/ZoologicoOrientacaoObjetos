package br.com.treinaweb.zoologico.classes;

//O termo "extends" é um conceito de herança. Aqui a classe Gato herda os atributos e classes da classe Animal.
public class Gato extends Animal{
	
	//Construtor
	public Gato(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}
	
	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Barulho do Gato!");			
		} else {
			System.out.println("O Gato Morreu!");
		}
	}
}
