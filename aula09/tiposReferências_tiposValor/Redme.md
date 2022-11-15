# Tipos referência vs. tipos valor

## Classe são tipos referência

Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas

Product p1, p2;

![md](img/md.png)

![p1](img/Captura%20de%20tela%20de%202022-09-12%2014-11-36.png)

## Valor "null"

tipos referência aceitam o valor "null", que  indica que a variável aponta pra ninguém.

![null](img/null.png)

![null](img/null2.png)

## Tipos Primitivos são tipos valor

Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.

![primitivos](img/primitivos.png)

### Os 8 tipos primitivos

![8tiposprimitivo](img/8tiposprimitivos.png)

## Tipos primitivos e inicialização

![Demo](img/Demo.png)

## Valores padrão

Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos

* Números: 0

* Boolean: false

* char: caractere código 0

* objeto: null

![valor](img/valorpadrao.png)

## Tipos referência vs. Tipos valor

![vs](img/tiposreferenciavstiposvalor.png)

## Desalocação de memória -garbage collector e escopo local

### Garbage collector

* É um processo que automatiza o gerenciamento de memória de um programa em execução

* O garbage collecotr monitora os objetos alocados dinamicamente pelo programa (no healp), desalocando aqueles que não estão mais sendo utilizados.

![garbage collector](img/garbage.png)

![garbage collector](img/garbage2.png)

Desalocação por escopo

![escopo](img/escopo.png)

## Resumo

* Objetos alocados dinamicamente, quando não possuem mais referência para eles, serão desalocados pelo garbage collector

* Variáveis locais são desalocadas iimediatamente assim que seu escopo local sai de execução.
