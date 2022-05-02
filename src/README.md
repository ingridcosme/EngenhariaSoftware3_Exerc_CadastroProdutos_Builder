# Exerc�cio pertencente a disciplina de Engenharia de Software III

## Design Patterns

####Builder

Considere uma aplica��o que permite exibir os diversos produtos de uma loja. A loja vende diversos produtos, como camisetas, cal�ados, jogos eletr�nicos, equipamentos de inform�tica de armazenamento.

- Para cal�ados � necess�rio saber o tamanho (35�44), cor, tipo (t�nis ou social) e valor;


- Para camisetas � necess�rio saber o tamanho (PP, P, M, G, GG), cor, marca e valor;


- Para jogos eletr�nicos � necess�rio saber o nome, o videogame (Xbox, Playstation ou Switch) e o valor;


- Para equipamentos de armazenamento � necess�rio saber o tipo (SSD, M.SNVMe ou HDD), a capacidade, o fabricante e o valor.


Fazer o diagrama de pacotes e implementar em Java a solu��o para que essa aplica��o tenha 3 produtos de cada tipo no m�todo main, coloque em um ArrayList e exiba os 12 produtos. Considere usar enums para os casos em que se aplica.