
# Desafio técnico SC Clouds

## Questões conceituais

### 1 - Diferenciar as camadas 2 e 3 do modelo OSI, e indicar os protocolos utilizados para endereçamento nestas camadas.

A camada 2, chamada de camada de enlace de dados é a camada responsável pela transmissão e recepção de pacotes de dados no meio físico, ou seja em comunicação local (LAN) e tem o endereçamento também físico determinado pelo endereço "MAC". Já a camada 3 que é a camada de Rede utiliza o IP como endereçamento, esta camada foca no roteamento (determina melhores rotas) dos pacotes de dados entre redes diferentes, ou seja, faz a transmissão não localmente.

### 2. Qual a diferença entre adotar uma solução proprietária como o sistema operacional Windows quando comparado a adoção de uma solução OpenSource como o sistema operacional Ubuntu? Quais seriam os pontos negativos e positivos de cada abordagem?

A principal diferença entre adotar um sistema como Windows ou o Linux Ubuntu se dá pela liberdade e transparência em relação ao código fonte do sistema por ser Open Source.
Alguns dos pontos positivos de um software proprietário como o Windows são a compatibilidade com a maioria dos softwares, consolidação mundial, bom suporte técnico e excelente interface. Seus pontos negativos podem ser o alto custo para a aquisição de licenças para empresas, pouca flexibilidade e transparência no código.
No caso do Ubuntu, alguns de seus pontos negativos podem ser a falta de compatibilidade de aplicativos para uso doméstico, a variedade de interfaces, uma maior complexidade nas configurações e também não conta com um suporte técnico comercial tão robusto quanto o do Windows. Alguns de seus pontos fortes se dão por ser um sistema operacional com licença Open Source o que dá transparência para a visualização, edição e distribuição do código fonte do sistema; alta adaptabilidade, pois é possível adaptar e editar o sistema linux de acordo com as necessidades da empresa e uma comunidade gigantesca de desenvolvedores colaborando para a melhoramento do Linux e correção de falhas.

### 3. O que seria um projeto OpenSource? Como empresas podem adotar tais tecnologias e o que isso acarreta?

Projeto Open Source ou Código Aberto é um projeto que os autores deixam o código público para visualização, uso, modificação e distribuição mesmo que com alguns requisitos. A utilização de softwares Open Source em empresas é excelente pois pode ser feito o uso de tecnologias Open Source já desenvolvidas, além de que a empresa pode colaborar com a comunidade de desenvolvedores e os próprios usuários colaborarem com o desenvolvimento e aperfeiçoamento do código através de "pull requests", isso promove transparência, redução de custos e desenvolvimento acelerado com a ajuda da comunidade através da contribuição coletiva.

## Desafios de código

### 1. Fibonnaci

Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função), e retornar o valor correspondente desse número na sequência fibonnaci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.

- Criar uma função recursiva que resolva fibonacci

- Criar uma função linear que resolva fibonnaci

    Você pode acessar a resolução do desafio 1 clicando [aqui](https://github.com/jmarcosbs/desafio-tecnico-scclouds/blob/main/src/desafios/DesafioFibonacci.java)


### 2. Números primos

Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input), e retornar todos os números primos até o numero N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];

- Criar uma função recursiva que resolva p

- Criar uma função linear que resolva p

    Você pode acessar a resolução do desafio 2 clicando [aqui](https://github.com/jmarcosbs/desafio-tecnico-scclouds/blob/main/src/desafios/DesafioNumerosPrimos.java)








## Instalação

1. Clone o repositório com o git:

```
  git clone https://github.com/jmarcosbs/desafio-tecnico-scclouds

```

2. Importe o projeto para sua IDE

3. Acesse o pacote "desafios"

4. Acesse um dos desafios

5. Execute como "Java Application"

