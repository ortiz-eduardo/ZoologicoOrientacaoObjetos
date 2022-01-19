package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.Animal;
import br.com.treinaweb.zoologico.classes.Cachorro;
import br.com.treinaweb.zoologico.classes.Gato;
import br.com.treinaweb.zoologico.classes.Veterinario;
import br.com.treinaweb.zoologico.classes.Zoologico;

public class Programa {

	//Encry point 	
	public static void main(String[] args) {
		
		//Criação do objeto "cachorro"
		//A declaração de "Animal cachorro" é o que chamamos de instância do objeto Animal
		// "new Animal(); é o construtor, ele constroi o animal. Esta atribuindo ao "cachorro" o objeto "Animal" 
		
		// Instânciamento normal
		// Cachorro cachorro = new Cachorro();
		
		// Polimorfismo ou LSP
		Animal cachorro = new Cachorro("Elvis", "Cachorro", 5);
		Animal gato = new Gato("Pelé", "Gato", 2);
		
		//cachorro.setNome("Elvis");
		//cachorro.setEspecie("Cachorro");
		//cachorro.setIdade(2);
		
		System.out.println("O cachorro se chama " + cachorro.getNome() + " é da especie " + cachorro.getEspecie() + " e tem " + cachorro.getIdade() + " anos.");
		cachorro.emitirBarulho();
		
		System.out.println("O cachorro se chama " + gato.getNome() + " é da especie " + gato.getEspecie() + " e tem " + gato.getIdade() + " anos.");
		gato.emitirBarulho();
		
		
		if(gato.ehAdulto()) {
			System.out.println("O gato é Adulto");
		} else {
			System.out.println("O gato é Filhote");
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
