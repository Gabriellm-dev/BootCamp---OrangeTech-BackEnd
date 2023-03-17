• Exceção é um evento que interrompe o fluxo normal do processamento de uma classe.

• O uso correto de exceções torna o programa mais robusto e confiável.

• Com o tratamento de exceções, um programa pode continuar executando depois de lidar com um problema

• Importante: incorpore sua estratégia de tratamento de exceções no sistema desde o princípio do processo do projeto.

• Pode ser dificil incluir um tratamento de exceções eficiente depois que um sistema foi implementado.

• Error: Usado pela JVM que serve para indicar se existe algum problema de recurso do programa. tornando a execução impossivel de continuar.
	- Erros não checados pelo compilador (eventos irrecuperaveis).

• Unchecked(Runtime): Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor.
	- Exceções não checadas pelo compilador (erros de lógica).

• Checked Exception: Exceptions que DEVEM ser evitados e tratados pelo desenvolvedor para o programa funcionar.
	- Condições excepcionais checadas pelo compilador (eventos recuperáveis).

•  try, catch, finally: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.

• throws: Declara que um método pode lançar uma ou várias exceções.

• throw: Lança explicitamente uma exception.