## Design Pattern com Factory Pattern.
# Nesse exemplo de projeto Java fizemos um sistema simples de gerenciamento de veículos.
# Temos 3 classes principais: 
# • Veículo (Classe abstrata para os tipos de veiculos que serão criados.)
# • Carro (Subclasse concreta do veículo.)
# • MotoEsportiva (Subclasse concreta do veículo.)

# Como o objetivo do Design Pattern é criar objetos sem expor a lógica para o cliente, assim o código do cliente vai ficar mais simples e flexivel, enquanto a criação dos objetos ficam centralizados na classe fábrica.

# Implementamos o padrão de fábrica criando uma interface chamada FabricaVeiculo que define os métodos para criação de carros e motos.
# Essa interface foi implementada por duas classes concretas:
# • FabricaCarro e FabricaMoto são responsaveis por criar carro e moto.

# São criadas as fábricas de carros e motos e, em seguida, são criados objetos carro e moto utilizando essas fábricas. As descrições desses objetos são impressas no console.

# A fábrica abstrata permite que o cliente crie objetos de veículos de forma independente da implementação concreta das classes Carro e Moto.

#  A interface FabricaVeiculo representa a fábrica abstrata, enquanto as classes FabricaCarro e FabricaMoto são as fábricas concretas responsáveis por criar objetos Carro e Moto, respectivamente.

# Ao utilizar esse padrão, é possível criar famílias de objetos relacionados (Carro e Moto, por exemplo) sem precisar se preocupar com a lógica de criação desses objetos. Dessa forma, o cliente pode simplesmente escolher a fábrica de veículos desejada e criar objetos veículo sem se preocupar com os detalhes de implementação.
# Em resumo, o padrão Abstract Factory é utilizado para fornecer uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.