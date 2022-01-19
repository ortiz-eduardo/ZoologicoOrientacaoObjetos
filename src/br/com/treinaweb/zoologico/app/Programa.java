package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.Animal;
import br.com.treinaweb.zoologico.classes.Cachorro;
import br.com.treinaweb.zoologico.classes.Gato;
import br.com.treinaweb.zoologico.classes.Veterinario;
import br.com.treinaweb.zoologico.classes.Zoologico;

public class Programa {

	//Encry point 	
	public static void main(String[] args) {
		
		//Cria��o do objeto "cachorro"
		//A declara��o de "Animal cachorro" � o que chamamos de inst�ncia do objeto Animal
		// "new Animal(); � o construtor, ele constroi o animal. Esta atribuindo ao "cachorro" o objeto "Animal" 
		
		// Inst�nciamento normal
		// Cachorro cachorro = new Cachorro();
		
		// Polimorfismo ou LSP
		Animal cachorro = new Cachorro("Elvis", "Cachorro", 5);
		Animal gato = new Gato("Pel�", "Gato", 2);
		
		//cachorro.setNome("Elvis");
		//cachorro.setEspecie("Cachorro");
		//cachorro.setIdade(2);
		
		System.out.println("O cachorro se chama " + cachorro.getNome() + " � da especie " + cachorro.getEspecie() + " e tem " + cachorro.getIdade() + " anos.");
		cachorro.emitirBarulho();
		
		System.out.println("O cachorro se chama " + gato.getNome() + " � da especie " + gato.getEspecie() + " e tem " + gato.getIdade() + " anos.");
		gato.emitirBarulho();
		
		
		if(gato.ehAdulto()) {
			System.out.println("O gato � Adulto");
		} else {
			System.out.println("O gato � Filhote");
		}

		
		System.out.println("====================");
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo do Eduardo");
		
		zoo.adicionarAnimal(gato);
		zoo.adicionarAnimal(cachorro);
		
		zoo.listarAnimal();
		
		//zoo.removerAnimal(1);
		//zoo.listarAnimal();
		
		//gato.morrer();
		//cachorro.morrer();
		
		//gato.emitirBarulho();
		//cachorro.emitirBarulho();
		
		Veterinario vet = new Veterinario();
		
		vet.setNome("Cezar");
		vet.atenderNovoAnimal(gato);
		vet.listarAnimaisAtendidos();
		
	}

}
