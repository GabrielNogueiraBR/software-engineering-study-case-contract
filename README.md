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

## Código e Enumeração segundo Grafo de Fluxo
![image](https://user-images.githubusercontent.com/30303558/233439138-06e27152-4667-489e-860e-aad22e7fcd1c.png)


## Grafo de Fluxo
![image](https://user-images.githubusercontent.com/30303558/233438065-e3623e1b-6cab-46bc-a8a3-41ca2b690613.png)


## Complexidade Ciclomática
**Caminhos independentes:**
  ```
  1-2-3-13
  1-2-4-5-13
  1-2-4-6-7-13
  1-2-4-6-8-9-10-13
  1-2-4-6-8-9-11-13
  1-2-4-6-8-12-13
  ```

****Ramos:**** 17

********Nós:******** 13

************************************************Calculo da complexidade:************************************************

$$
v(G) = E-N+2 = 17 - 13 + 2 = 6
$$

Onde:
- `E` é o número de Ramos
- `N` é o número de Nós


## Determinar os casos de teste com base nos caminhos
Lembrar de usar os limites para criação dos testes.
