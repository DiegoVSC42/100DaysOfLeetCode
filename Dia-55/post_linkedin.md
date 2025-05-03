🚀 Dia 55/100: #100DaysOfLeetCode - Analisando profundidade mínima e árvores balanceadas com DFS e BFS

Mais um dia estudando BFS e DFS. Hoje escolhi dois desafios focados em profundidade e equilíbrio de árvores binárias. Ambos me ajudaram a compreender melhor os retornos das recursões e o impacto de cada abordagem no tempo de execução.

💡 Minha Solução:

O primeiro exercício foi verificar se uma árvore binária está balanceada. Resolvi utilizando DFS. A parte mais complicada foi definir uma lógica clara para os retornos das chamadas recursivas. Após algumas tentativas, decidi que retornos com valor -1 representariam nós desbalanceados, o que simplificou bastante a verificação e tornou o código mais limpo e direto.

O segundo desafio foi encontrar a profundidade mínima de uma árvore binária. Comecei com uma solução usando DFS, mas o desempenho ficou abaixo do esperado. A função percorre até os nós folha e calcula a menor profundidade possível, mas por não interromper cedo, acabou sendo menos eficiente. Então resolvi reescrever utilizando BFS e o resultado foi significativamente melhor: o tempo de execução caiu de 5ms para 2ms. Isso mostrou bem a vantagem do BFS para problemas onde o objetivo é encontrar o primeiro valor válido mais próximo da raiz.

⭐ Reflexão do dia:

A escolha da abordagem correta faz uma diferença enorme no desempenho. Embora a DFS funcione bem para verificar estruturas completas como no primeiro problema, para encontrar valores mínimos ou mais próximos da raiz, a BFS se mostrou bem mais eficiente. Além disso, simplificar os retornos de funções recursivas com uma convenção clara (como o uso do -1) ajuda bastante a manter a lógica organizada.

📌 Links das questões:
https://leetcode.com/problems/balanced-binary-tree/description/
https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

#Java #BinaryTree #DFS #BFS #Recursao #DataStructures #100DaysOfLeetCode
