🚀 Dia 75/100: #100DaysOfLeetCode - Iterador de Árvore de Busca Binária com Stack

Hoje continuei meus estudos sobre stacks e implementei um iterador para uma árvore binária de busca (BST). O iterador deve retornar os valores da BST em ordem crescente, ou seja, do menor para o maior valor. Para isso, utilizei uma stack para armazenar os nós da árvore, explorando os filhos à esquerda antes dos maiores valores.

🌟 Minha Solução:

Utilizei uma stack para armazenar todos os nós à esquerda do nó atual. Quando chamei o método next(), retirei o topo da pilha (o menor valor ainda não visitado), e empurrei os nós à esquerda do filho direito desse nó, garantindo a ordem crescente na iteração.

💡 Reflexão do dia:

A stack provou ser fundamental para simular a travessia em ordem da BST de forma eficiente e sem usar recursão. O método pushLeftNodes facilitou o controle da pilha e simplificou o código.

📚 Documentação:
Stack: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

📌 Links:
Desafio: https://leetcode.com/problems/binary-search-tree-iterator/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-75/Solution.java

#Java #Stack #BSTIterator #100DaysOfLeetCode
