## Conceituação.
► é uma porçao de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsaveis por definir e realizar um determinado comportamento.

## Criação:

► Padrão de definição: <?visibilidade?><?tipo?><?modificador?>retorno nome (<?parametros?>) <?exceções?>corpo

• Entre interrogações é opcional, retorno, nome e corpo do método são obrigatórios.

• Visibilidade: Public, protected ou private.
• Tipo: Concreto ou abstrato.
• Modificador: Static ou final.
• Retorno: tipo de dado(Inteiro, long, float ...) ou void(não retorna nada).
• Nome: nome que é fornecido ao metodo.(Todas as regras que se aplicam a variaveis se aplicam ao nome.)
• Parametros: parametros que pode receber.
• Exceções: exceções que podem lançar.
• Corpo: código que possui ou vazio.

► EXEMPLOS: 

• public String getNome( ){...} - vai retornar uma string um texto.
►Visibilidade é public.
► Retorno, tipo de dado é String.
► Não tem parametro "( )"
► Corpo: " {...} "

• public double calcularTotalNota( ) {...}
• public int verificarDistancia(int cordenada1, int cordenada2) {...}
• public abstract void executar ( )
• public void alterarFabricante(Fabricante fabricante) {...}
• public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra.>compras) {...}

• public static R N (P) {...}
R: retorno.
N: Nome.
P: Paramentro.
{ }: Corpo.


## Utilização:
► Passa-se uma mensagem através de uma classe ou objeto.

• nome_da_classe.nome_do_metodo( );  
ou 
• nome_da_classe.nome_do_metodo(...);

•• nome_do_objeto.nome_do_metodo( )
ou
•• nome_do_objeto.nome_do_metodo (...)

• Math.random( ); ou Math.sqrt(4);

•• usuario.getEmail( ); ou usuario.alterarEndereco(endereco)


## Particularidades:
• Assinatura: é a forma de identificar unicamente o método
	Ass = nome + parametros.
	
	► Método: 
	public double calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3) {...}
	
	► Assinatura:
	calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3)
• Construtor e Destrutor: são métodos especiais usados na orientação a objetos.
• Mensagem: é o ato de solicitar ao método que o mesmo execute. Está pode ser direcionada a um objeto ou a uma classe.
• Passagem de parametros:
	Por valor (Cópia)
		Exemplo: 
			int i = 10;
			public void fazerAlgo (int i ){
				i = i +10;
				Sysout("Valor de i dentro: " + i)
			}
			Sysout("Valor de i fora: " + i);


## Boas práticas:
• Nomes devem ser descritivos, mas curtos.
• Notação camelo.
	verificarSaldo ( ); executarTransferencia(...); existeDebito( );
• Deve possuir entre 80 e 120 linhas.
• Evite lista de parametros longas.
• Visibilidade adequadas.


## Sobrecarga
### Conceituação.
►  É a capacidade de definir métodos para diferentes contextos. mas preservando seu nome.

Criação.
► Alterar a assinatura do método:
	Ass = nome + parâmetros.

• converterParaInteiro(float f);
• converterParaInteiro(float d);
• converterParaInteiro(float s);
• converterParaInteiro(float f, RoundType rd);
• converterParaInteiro(float d, RoundType rd);
• converterParaInteiro(float s, RoundType rd);

• converterParaInteiro(RoundType rd, String s);
• converterParaInteiro(); 


## Retornos

•  É uma instrução de interrupção.
•  Simbologia: return.

►  Funcionamento:
	O método executa seu retorno quando:
		• Completa todas suas instruções internas.
		• Chega a uma declaração explicita de retorno.
		• Lança uma exceção.
		
► Considerações: 
	• O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;
	• O tipo de dado do return deve ser compatível com o do método.
	• Se ométodo for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.

► Exemplos:
	• public String getMensagem() {
		return "Ola!";
		}
	• public double getJuros(){
		return 2.36;
		}
	• public int getParcelas(){     --- int nao retorna float ---
		return 1.36f;
		}
	• public void setIdade(){      --- void nao retorna valor ---
		return 10;
		}
	• public void executar(){
		...
		return;
		...
		}
