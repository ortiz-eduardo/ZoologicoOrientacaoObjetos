package br.com.treinaweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nome;
	private List<Animal> animais; //Lista do tipo Animal
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Construtor de novo Zoologico
	public Zoologico() {
		animais = new ArrayList<Animal>(); // Como uma lista é uma Interface, não podemos executar um "new List<>()". Então declaramos um ArrayList do tipo Animal
	}
	
	//Adicionando um Animal
	public void adicionarAnimal(Animal animarASerAdicionado) {
		animais.add(animarASerAdicionado);
	}
	
	//Removendo um animal
	public void removerAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	//Listando os animais do zoologico
	public void listarAnimal() {
		System.out.println("Animais do Zoologico: ");
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("    - "+ animais.get(i).getNome() + " da especie " + animais.get(i).getEspecie());
		}
	}
}
