package br.com.treinaweb.zoologico.classes;

// Classe � um objeto
// O termo "abstract" proibe a classe de ser inst�nciada
// o termo "implements" atribui a classe Animal a uma interface, ou seja, um contrato.
public abstract class Animal implements Animavel{
	//Atributos s�o caracteristicas;
	private String nome;
	private String especie;
	protected int idade; // o termo "protected" permite que o atributo da classe m�o seja acessivel nas classes filhas sem a necessicidade de usar um set;
	protected Boolean estaVivo;
	
	//Construtor um m�todo que constroi o Animal
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	//M�todos s�o A��es
	public String getNome() {
		return nome;
	}
	
	// M�todo Acessores GET e SET
	public void setNome(String nome) {
		// Qualificador THIS utilizado para diferenciar a variavel da classe e a variavel do m�todo
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
	
	//GET Booleano n�o precisa da palavra "get" antes do nome.
	public Boolean estaViva() {
		return estaVivo;
	}
	
	//A��es do Animal
	//O termo "abstract" no m�todo obriga que ele seja sobreescrito nas classes filhas
	//Lembre-se: cada animal emite um barulho diferente.
	@Override
	public abstract void emitirBarulho(); // M�todos abstratos n�o tem escopo, ou seja, sem corpo;
	
	
	//M�todo verifica se o animal � adulto
	@Override
	public Boolean ehAdulto() {
		if(estaVivo) {
			return idade >= 1;
		} else {
			return false;
		}
	}
	
	// FINAL � uma palavra reservada para proibir um Override, ou seja, esse m�todo n�o pode ser sobrescrito
	@Override
	public final void morrer() {
		this.estaVivo = false;
	}
}

