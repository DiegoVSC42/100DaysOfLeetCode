🚀 Dia 53/100: 100DaysOfLeetCode - DFS, BFS e Deque na prática

Hoje estudei dois conceitos fundamentais de percorrimento de árvores: busca em profundidade (DFS) e busca em largura (BFS). Para reforçar o aprendizado, resolvi um exercício de cada técnica. Durante a resolução do problema com BFS, acabei conhecendo a estrutura deque, que permite inserção e remoção tanto no início quanto no fim, sendo muito útil para simular uma fila com eficiência.

No exercício de DFS, implementei uma abordagem recursiva simples para verificar se existe um caminho cuja soma dos nós seja igual ao valor alvo. Já no exercício de BFS, percorri a árvore por nível, utilizando uma fila baseada em deque para organizar os nós da forma correta.

💡 Minha Solução:

1. Path Sum (DFS)
Neste desafio, o objetivo é verificar se existe um caminho na árvore binária onde a soma dos valores dos nós é igual ao valor alvo fornecido.  
- Para isso, utilizei a busca em profundidade (DFS) de forma recursiva. Em cada chamada, o valor do nó atual é subtraído do valor alvo. Quando chega a um nó folha (sem filhos), se a soma restante for zero, isso indica que encontramos um caminho válido.  
- O processo é repetido para o nó da esquerda e o da direita, garantindo que todos os caminhos sejam verificados.

2. Binary Tree Level Order Traversal (BFS)
Neste desafio, o objetivo é percorrer a árvore binária nível a nível e retornar uma lista de listas com os valores dos nós em cada nível.  
- Para implementar isso, usei a busca em largura (BFS) com uma fila (deque) para manter os nós a serem processados.  
- Comecei com a raiz, e à medida que percorria a árvore, fui adicionando os filhos esquerdo e direito de cada nó na fila. Em cada iteração, coletei os valores do nível atual e adicionei-os a uma lista, repetindo o processo até que todos os níveis fossem percorridos.

⭐ Reflexão do dia:

Foi um dia bem produtivo e cheio de aprendizado. Trabalhar com árvores está se tornando cada vez mais natural, e ver como conceitos como DFS e BFS se aplicam de forma tão clara nas estruturas foi muito satisfatório. O ponto alto do dia foi aprender sobre deque e perceber como pequenas estruturas fazem diferença em problemas que exigem desempenho e organização. É muito bom olhar para trás e perceber o quanto evoluí desde os primeiros desafios.

📚 Documentação:  
https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html  
https://docs.oracle.com/javase/8/docs/api/java/util/List.html  

📌 Links das questões:  
https://leetcode.com/problems/path-sum/  
https://leetcode.com/problems/binary-tree-level-order-traversal/  

#100DaysOfLeetCode #Java #DFS #BFS #Deque #BinaryTree #Algorithms #DataStructures
