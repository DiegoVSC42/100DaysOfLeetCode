🚀 Dia 52/100: 100DaysOfLeetCode - Conversão para Árvores Binárias de Busca

Hoje resolvi dois exercícios sobre como converter diferentes estruturas ordenadas em uma árvore binária de busca. Comecei com um array, que foi bem direto, e depois me desafiei um pouco mais com uma lista ligada ordenada. A segunda abordagem exigiu mais atenção, principalmente ao tratar casos em que a lista tinha apenas um elemento, o que poderia causar erros como null pointer se não fosse bem controlado.

Foi interessante perceber como a base lógica se repete nas duas soluções: identificar o elemento do meio, criar um nó com ele e então aplicar recursão para construir as subárvores à esquerda e à direita. A principal diferença é que na lista ligada o acesso ao elemento do meio não é tão direto quanto no array, o que exigiu o uso da técnica dos ponteiros lento e rápido para encontrá-lo.

💡 Minha Solução:

1. No caso do array, dividi a estrutura usando subarrays e escolhi o meio como raiz
2. Na lista ligada, usei dois ponteiros (rápido e lento) para encontrar o nó central, cortando a lista ao meio manualmente
3. Tratei casos base com lista nula e com apenas um elemento para evitar erros de execução

🌟 Reflexão do Dia:

1. Os exercícios me ajudaram a aprimorar minha compreensão de como trabalhar com listas e arrays de forma eficiente
2. A diferença no tratamento entre array e lista ligada me fez pensar mais sobre a performance e a estrutura de dados que escolho em cada situação
3. Foi gratificante resolver os problemas sem consultar documentação, o que mostra o quanto evoluí nos últimos dias

📌 Links das questões:  
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/  
https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/

#100DaysOfLeetCode #Java #BinarySearchTree #LinkedList #Array #Recursion #DataStructures #Algorithms
