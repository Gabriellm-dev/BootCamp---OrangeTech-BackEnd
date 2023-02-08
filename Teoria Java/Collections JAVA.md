
• Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade. 
• Serve para armazenar e processar conjuntos de dados de forma eficiente.
• Antes do Java 2, a implementação de coleções na linguagem java incluia poucas classes e não tinha a organização de um framework.

► Composição Collections:
	• Interfaces: É um contrato que quando assumido por uma classe deve ser implementado.
	• Implementações ou Classes: são as materializações, a codificação das interfaces.
	• Algoritmos: é uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.


► Hierarquia Collections:
	• List.
		ArrayList 
		LinkedList
	• Set:
		HashSet
		LinkedHashSet
	• Map:
		HashMap
		LinkedHashMap



► Coleções com interações ordenadas: Listas.
	-
	•  java.util.List
		- Elementos duplicados e garante ordem de inserção.
		- Interface List ---> ArrayList, Vector e LinkedList.
		- Interface Queue ---> LinkedList e PriorityQueue.
		- 
		-  ArrayList deve ser usado onde mais operações de pesquisa são necessarias.
		- LinkedList deve ser usado onde mais operações de inserção e exclusão são necessarias.


► Coleções Singulares: SET.
	• Java.util.Set
	• Não permite elementos duplicados.
	• Não possui indice.



► Coleções de Pares: Map.
	• Elementos únicos (key) para cada valor (value).


► Stream API - 
	• Classe anônima.
		- A classe anonima em java é uma classe que não recebeu um nome e é tanto declarado e instanciado em uma única instrução. Você deve considerar o uso de uma classe anonima sempre que voce precisar criar uma classe que será instanciada apenas uma vez.
		- 
	• Functional Interface:
		-  Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.
		- Comparator, Consumer, Function, Predicate.
		- 
	• Lambda:
		- Uma função lambda é uma função sem declaração, isto é, não é necessario colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem a sintaxe definida como(argumento) -> (corpo).
		- 
	• Reference Method:
		- Method Reference é um novo recurso do Java 8 que permite fazer referencia a um método ou construtor de uma classe (de forma funcional ) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legivel. Para utiliza-lo basta informar uma classe ou referencia seguida do simbolo '' :: '' e o nome do método sem os parenteses no final.
		- 
	• Streams API:
		- A Streasm API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma meneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
		- 
		-  Source > Pipeline > Terminal
