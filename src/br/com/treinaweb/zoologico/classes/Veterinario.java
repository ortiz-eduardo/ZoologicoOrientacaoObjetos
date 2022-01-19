package br.com.treinaweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
	private String nome;
	private List<Animal> animais;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Construtor de novo veterinário
	public Veterinario() {
		animais = new ArrayList<Animal>();
	}
	
	//Atender um Animal
	public void atenderNovoAnimal(Animal animalASerAtendido) {
		animais.add(animalASerAtendido);
	}
	
	//Deixar de atender um animal
	public void deixarDeAtenderAnimal(int indiceAnimal) {
		animais.remove(indiceAnimal);
	}
	
	//Listar animais atendidos por um determinado Veterinário
	public void listarAnimaisAtendidos() {
		System.out.println("Animais atendidos pelo " + nome);
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("   - " + animais.get(i).getNome() + " da especie " + animais.get(i).getEspecie());		
		}
	}
	
}
