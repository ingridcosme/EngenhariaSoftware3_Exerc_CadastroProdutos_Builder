# Exercício pertencente a disciplina de Engenharia de Software III

## Design Patterns

####Builder

Considere uma aplicação que permite exibir os diversos produtos de uma loja. A loja vende diversos produtos, como camisetas, calçados, jogos eletrônicos, equipamentos de informática de armazenamento.

- Para calçados é necessário saber o tamanho (35–44), cor, tipo (tênis ou social) e valor;


- Para camisetas é necessário saber o tamanho (PP, P, M, G, GG), cor, marca e valor;


- Para jogos eletrônicos é necessário saber o nome, o videogame (Xbox, Playstation ou Switch) e o valor;


- Para equipamentos de armazenamento é necessário saber o tipo (SSD, M.SNVMe ou HDD), a capacidade, o fabricante e o valor.


Fazer o diagrama de pacotes e implementar em Java a solução para que essa aplicação tenha 3 produtos de cada tipo no método main, coloque em um ArrayList e exiba os 12 produtos. Considere usar enums para os casos em que se aplica.