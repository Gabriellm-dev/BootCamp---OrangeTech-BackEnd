► O que é o Maven ?
	• Ferramenta para gerenciar build e dependências de um projeto.
	• Primeira versão em julho de 2004, mantido pela Apache Software Foundation.
	• Facilita a compreensão do desenvolvedor.
	• Fornecer informações de qualidade.
	• Endereça como o software foi construído e suas dependências através do POM(Project Object Model).

► Comandos que auxiliam no dia a dia:
	• Compilar: compile.
	• Testar: test.
	• Empacotar: package.
	• Limpar diretório de trabalho: clean.

► Entendendo o POM.
	• POM - Project Object Model.
	• Unidade Fundamental de Trabalho.
	• Formato XML.
	• Detalha o projeto.
	• Detalha como construir o projeto.
	• Maven sempre procura pelo pom.xml para realizar sua execução.

► Mais detalhes pom.xml
	• Nome do projeto.
	• Dependencias.
	• Módulos.
	• Configurações Build.
	• Detalhes do projeto(nome, descrição, licença, url)
	• Configurações de ambiente (repositórios, tracking, profiles).

► Repositórios.
	• São locais onde podemos encontrar plugins e bibliotecas que o Maven provê.
	• Dois tipos: Local e Remoto.

► Repositório Remoto:
	• É o local central utilizado pelo Maven para buscar os artefatos.
	• Configurado automaticamente pelo Super POM para utilizar o Maven Central.

► Repositório Local.
	• É o repositório na máquina utilizado pelo Maven para buscar os artefatos.
	• Estratégia de caching.

