🚀 Dia 69/100: #100DaysOfLeetCode - Encontrando as raízes das Árvores de Altura Mínima

Hoje o problema foi bem complicado, mas no final consegui resolver. De início, estava tentando resolver utilizando DFS, verificando a altura de cada nó, porém essa solução se mostrou ineficiente, tendo complexidade O(n²). Então utilizei outra abordagem, encontrando e tirando os nós que não poderiam ser raízes (as folhas), achando assim as 2 ou 1 únicas raízes. Não tem como ter mais.

🌟 Minha Solução:

Usei uma lista de adjacência para representar o grafo, um mapa para contar as conexões de cada nó e uma fila dupla (deque) para controlar as folhas. A cada iteração, removia as folhas e atualizava o grau dos nós vizinhos, incluindo-os como novas folhas quando necessário, até restarem as raízes de altura mínima.

💡 Reflexão do dia:

Esse problema me mostrou que, ao mudar o ponto de vista sobre o problema, é possível encontrar soluções mais eficientes. Em vez de analisar a árvore de cima para baixo, trabalhar de baixo para cima, removendo folhas, foi essencial para otimizar a busca pelas raízes.

📚 Documentação:
Map: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
Deque: https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html

📌 Links:
Desafio: https://leetcode.com/problems/minimum-height-trees/description/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-69/Solution.java

#Java #Graph #BFS #Deque #100DaysOfLeetCode
