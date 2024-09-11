# Projeto Contador

## Descrição

O **Contador** é um projeto simples em Java que simula a contagem incremental de números, a partir de dois valores inteiros fornecidos pelo usuário via terminal. O programa solicita dois números, e com base nesses valores, imprime os números em sequência. Se o primeiro número for maior que o segundo, o sistema lançará uma exceção customizada.

Este projeto foi desenvolvido como parte do desafio "DIO - Trilha Java Básico" e tem como objetivo consolidar o aprendizado sobre controle de fluxo, laços de repetição (`for`), manipulação de exceções e boas práticas de codificação em Java.

## Funcionalidades

- Captura de dois números inteiros via terminal.
- Impressão de números incrementados no intervalo entre os dois valores fornecidos.
- Lançamento de exceção customizada caso o primeiro número seja maior que o segundo.

## Estrutura do Projeto

- **Contador.java**: Classe principal onde toda a lógica do programa está implementada.
    - Utilização da classe `Scanner` para capturar entradas do usuário.
    - Lógica de controle de fluxo com laço `for`.
    - Tratamento de exceções com a classe customizada `ParametrosInvalidosException`.
- **ParametrosInvalidosException.java**: Classe que representa uma exceção personalizada, lançada quando o primeiro parâmetro fornecido é maior que o segundo.

## Exemplo de Uso

Passo a passo:

1. Ao executar o programa, o usuário será solicitado a inserir o primeiro número.
2. Em seguida, o usuário deverá inserir o segundo número.
3. Se o segundo número for maior, o sistema imprimirá uma sequência de números incrementados, começando de 1 até a diferença entre os dois valores.
4. Se o primeiro número for maior que o segundo, o sistema lançará a exceção `ParametrosInvalidosException` com a mensagem: _"O segundo parâmetro deve ser maior que o primeiro"_.

## Requisitos

- Java 8 ou superior.
- Uma IDE de sua preferência (como Visual Studio Code) ou linha de comando para compilar e executar o código.

## Licença

Este projeto é licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter mais detalhes.

## Autor
Natal Santiago

LinkedIn: https://www.linkedin.com/in/natal-santiago-986680257/

## Agradecimentos

Agradeço à [Digital Innovation One](https://www.dio.me/en) pela oportunidade de aprender e evoluir através de desafios práticos.
