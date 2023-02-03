## Fundamentos
► Objetivos:
	• Definição: A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos.
	
► Abstração:
	• Processo pelo qual se isolam caracteristicas de um objeto, considerando os que tenham em comum certos grupos de objetos.

► Reuso:
	• Capacidade de criar novas unidades de código a partir de outras ja existentes.

► Encapsulamento:
	• Capacidade de esconder complexidades e proteger dados.

► Estrutura Básica da Orientação a Objetos:
	• Objetivos: Apresentar os conceitos que criam as estruturas básicas da OO:
		• Classe.
		• Atributo.
		• Método.
		• Objeto.
		• Mensagem.

► Classe.
	• É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.

	 • Exemplos: Bola, carro, viagem, computador, venda, comprador.

	• Dicas:
		• Substantivos.
		• Nome significativos.
		• Contexto deve ser considerado.

	• Código.
		- class Carro { }

► Atributo.
	• É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe.

	 Exemplo: Classe Bola o atributo é diametro, Carro uma cor, Viagem a distancia ...

	• Atributo x Variável:
		• A: O que é próprio e peculiar a alguem ou a alguma coisa.
		• V: Sujeito a variações ou mudanças; que pode variar; inconstante, instável.

	• Dicas:
		- Substantivos e adjetivos.
		- Nome significativos.
		- Contexto deve ser considerado.
		- Abstração
		- Tipos adequados.

	• Código:
		- class Carro { int portas; }

► Método:
	• É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.

	• Exemplo: Venda: calcular total, Carro: Ligar, Computador: desligar, Comprador: realizar troca.

	• Criação: 
		- Visibilidade.
		- Retorno.
		- Nome.
		- Parâmetros.

	• Dicas:
		 - Verbos.
		 - Nome significativos.
		 - Contexto deve ser considerado.

	• Código:
		- class Carro { void frear() { ... } }

	• Dois métodos especiais:
		• Construtor.
			- class Carro { Carro() {...} }
		• Destrutor.
			- class Carro { void finalize() {...} } 

	• Sobrecarga do Método:
		• Mudar a assinatura de acordo com a necessidade.
		- Assinatura: nome + parâmetros.

		• Exemplo:
			m1 ()
			m1 (int i)
			m1 (float f)
			m1 (String s, long 1)
			m1 (long 1, String s)

► Objeto:
	• Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física(bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.

	• Criação:
		 - Carro carro = new Carro();

► Mensagem:
	• É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja um método estático.

	 • Criação:
		 - Carro carro = new Carro();
		 - carro.<método>;   <---- via objeto.
		 - Carro.<método>;   <---- via classe.

► Herança:
	• É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

	• Código.
		- class A extends B { ... }


	• Tipos de Herança:
		- Simples:
			- A classe filha tem só uma classe mãe:
				- Funcionario <-- Gerente, Vendedor, Faxineiro.
		- Multipla:
			- A classe filha tem uma ou mais classes mães.
			- Estudante <--- Estágiario ---> Funcionario.
			- Java não tem herança multipla.

	• Upcast:
		- A a = new B();
	• Downcast:
		- B a = (B) new A();

	• POLIMORFISMO:
		- A mesma ação, se comportando diferente.
	• Sobrescrita:
		- A mesma ação, podendo se comportar diferente.

► Associação:
	• Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outra classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.

	• Tipos:
		• Estrutural: 
			- Composição: "Com parte todo.", "Se a pessoa deixa de existir o endereço, também deixa de existir."
				- Ex. Pessoa e Endereço.
					- Código:
						- class Pessoa { Endereco endereco }
						- 
			 - Agregação: "Sem parte todo ", "Se a disciplina deixar de existir o aluno não deixa de existir, o aluno pode estar vinculado em outra disciplina e a disciplina pode estar vinculada a outro aluno"
				 - Ex: Disciplina e Aluno.
				 - Código:
					 - class Disciplina { Aluno aluno; }
					 - 
			- Comportamental: Dependência: "Depende de".
				- Código:
					- class Compra { finalizar(Cupom cupom, ...)}

► Interface:
	• Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza.

	• Código:
		- interface A { ... }
		- class B implements A { ... }

► Pacotes:
	• São uma organização física ou lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizada e seja possível separar classes de finalidades e representatividades diferentes.
	-
	• Código:
		 - package ... ;   "separa cria pastas"
		 - import ... ;     " importa em outras pastas"

► Visibilidade:
	• Um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo da Orientação a Objetos. Algumas boas práticas e conceitos só são atingidos com o uso correto deles.

	• Tipos:
		- Private. "Só dentro da classe"
			- private int i;
			- private void do();

		- Protected. "Dentro da classe, mesmo pacote e subclasses."
			- protected int i;
			- protected void do();

		- Public. "Em qualquer lugar"
			- public int i;
			- public void do ();