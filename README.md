# Simulação de Sistema Bancário

Este projeto é uma simulação de um sistema bancário, desenvolvido como proposta de aperfeiçoamento de técnicas e táticas de teste de software para a disciplina de QA e Testes de Software. Ele apresenta uma estruturação seguindo a orientação a objetos em Java, com objetos como Cliente, Conta Corrente, e classes de gerenciamento e verificação de regras de negócio especificadas através de requisitos prévios à programação.

## Objetivo

O principal objetivo deste programa é realizar testes utilizando as bibliotecas JUnit e Hamcrest. O projeto explora os recursos dessas bibliotecas, incluindo os comandos `@Test`, `@Before`, `@After`, `@Suite`, e os métodos `assert`. 

### Bibliotecas Utilizadas

- **JUnit**: JUnit é um framework de teste de código aberto para Java. Ele é amplamente utilizado para escrever testes automatizados e garantir a qualidade do software. Os testes JUnit são anotados com `@Test` e podem usar vários métodos de assert para verificar se os resultados esperados são alcançados.

- **Hamcrest**: Hamcrest é uma biblioteca de correspondência de objetos para Java. Ele fornece uma maneira mais expressiva de escrever assertivas nos testes JUnit. Com Hamcrest, os testes podem ser escritos de forma mais legível e expressiva, o que facilita a compreensão do propósito de cada teste.

## Ambiente de Desenvolvimento

Este projeto foi desenvolvido utilizando o ambiente de desenvolvimento Eclipse. O Eclipse oferece recursos avançados para desenvolvimento Java, incluindo suporte integrado para escrever e executar testes JUnit.

## Como Executar os Testes

1. Clone o repositório: git clone https://github.com/guilhermepicasso/SistemaBancario_JUnit.git
2. verifique que seu ambiente tenha os arquivos e bibliotecas necessárias :
   - Baixe e instale o Java Development Kit (JDK) mais recente do site oficial da Oracle: [Java SE Development Kit Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Baixe o JUnit JAR do site oficial: [JUnit Downloads](https://junit.org/junit5/).
   - Baixe o Hamcrest JAR do site oficial: [Hamcrest Downloads](https://hamcrest.org/JavaHamcrest/).
   - Adicione os JAR baixados ao classpath do seu projeto no Eclipse.
   - Se quiser otimizar essa instalação varios IDE disponibilizam seus programas extensões para o JUnit.Temos o Eclipse Markplace , nele se pode pesquiser por JUnit e Hamcrest, e baixar as extensões diretamente.
4. Abra o projeto no Eclipse.
5. Navegue até o pacote de testes (`testes/negocio`) e execute os testes JUnit.Recomendo utilizar a classe *TodosOsTestes* para executar o suite de teste.


