package br.com.treinaweb.zoologico.classes;

// Classe é um objeto
// O termo "abstract" proibe a classe de ser instânciada
// o termo "implements" atribui a classe Animal a uma interface, ou seja, um contrato.
public abstract class Animal implements Animavel{
	//Atributos são caracteristicas;
	private String nome;
	private String especie;
	protected int idade; // o termo "protected" permite que o atributo da classe mão seja acessivel nas classes filhas sem a necessicidade de usar um set;
	protected Boolean estaVivo;
	
	//Construtor um método que constroi o Animal
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	//Métodos são Ações
	public String getNome() {
		return nome;
	}
	
	// Método Acessores GET e SET
	public void setNome(String nome) {
		// Qualificador THIS utilizado para diferenciar a variavel da classe e a variavel do método
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//GET Booleano não precisa da palavra "get" antes do nome.
	public Boolean estaViva() {
		return estaVivo;
	}
	
	//Ações do Animal
	//O termo "abstract" no método obriga que ele seja sobreescrito nas classes filhas
	//Lembre-se: cada animal emite um barulho diferente.
	@Override
	public abstract void emitirBarulho(); // Métodos abstratos não tem escopo, ou seja, sem corpo;
	
	
	//Método verifica se o animal é adulto
	@Override
	public Boolean ehAdulto() {
		if(estaVivo) {
			return idade >= 1;
		} else {
			return false;
		}
	}
	
	// FINAL é uma palavra reservada para proibir um Override, ou seja, esse método não pode ser sobrescrito
	@Override
	public final void morrer() {
		this.estaVivo = false;
	}
}

