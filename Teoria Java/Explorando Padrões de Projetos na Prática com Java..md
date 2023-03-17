
► Padrões de Projeto.
	• São soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.
		-
	• São classificados nas seguintes categorias:
		• Padrões criacionais: Abstract Factory, Builder, Factory Method, Prototype, Singleton.
		• Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method.
		• Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy.
		-
		-
		► Singleton: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
		-
		► Strategy: Simplificar a variação de algoritmos para a resolução de um mesmo problema.
		-
		► Facade: Prover uma interface que reduza a complexidade nas integrações com subsistemas.
		-
		-
	► Explorando alguns padrões de projetos com Spring:
		• Singleton: @Bean e @Autowired;
		• Strategy: @Service e @Repository;
		• Facade: Construiremos uma API REST com o mesmo objetivo desse padrão, abstrair a complexidade das seguintes integrações: Spring Data JPA e ViaCEP(Feign).