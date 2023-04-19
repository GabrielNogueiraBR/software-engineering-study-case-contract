# Engenharia de Software: Estudo de Caso
Projeto desenvolvido na disciplina de Engenharia de Software II para avaliar a complexidade Ciclomática de um código, bem como, o desenvolvimento dos cenários de testes resultantes dos caminhos descobertos na etapa de complexidade ciclomática.


## Regra de Negócio
Idade de contratação de um funcionário: A empresa não contrata pessoas com idade inferior da 16 anos. Caso a pessoa tenha 16 anos até 18, ela pode ser contratada apenas em tempo parcial.  Se a pessoa tiver de 18 a 55 anos, ela poderá ser contratada em período integral. Pessoas com idade superior a 55 não serão contratadas.

Responda:

1) Faça o código na linguagem de programação (Java).
2) Numerar este código segundo Grafo de Fluxo
3) Realizar o Grafo de Fluxo (manualmente)
4) Calcular a Complexidade Ciclomática
5) Determinar o número de caminhos básicos independentes
6) Determinar os casos de testes
7) Implementar em JUNIT como Maven Project
8) Gerar Dashboard e Explicar a Cobertura de Testes (Print das Imagens)


## Grafo de Fluxo
![image](https://user-images.githubusercontent.com/30303558/233183791-65b97388-477e-4b75-a545-589f91e9ee3f.png)

## Complexidade Ciclomática
**Caminhos independentes:**
  ```
  1-2-8
  1-3-4-8
  1-3-5-6-8
  1-3-5-7-8
  ```

****Ramos:**** 10

********Nós:******** 8

************************************************Calculo da complexidade:************************************************

$$
v(G) = E-N+2 = 10 - 8 + 2 = 4
$$
