🚀 Dia 51/100: 100DaysOfLeetCode - Construção de Árvore Binária

Hoje enfrentei um dos exercícios mais desafiadores até agora. O problema consistia em reconstruir uma árvore binária a partir das travessias em ordem e pós-ordem. No começo, a lógica pareceu simples, mas na prática, definir corretamente como separar os arrays e fazer as chamadas recursivas exigiu bastante atenção.

A parte mais difícil foi entender como dividir corretamente os arrays de acordo com o valor da raiz e garantir que as chamadas recursivas estivessem usando os trechos certos. Depois de testar várias possibilidades e imprimir os retornos parciais, consegui identificar a estrutura correta da árvore e avançar na solução.

💡 Minha Solução:

1. Peguei o último elemento do pós-ordem, que sempre representa a raiz da árvore ou subárvore
2. Encontrei o índice dessa raiz no array em ordem para separar os elementos da esquerda e da direita
3. Criei novos arrays para cada lado e apliquei recursão para montar as subárvores esquerda e direita

🌟 Reflexão do Dia:

1. Exercício exigiu paciência e atenção aos detalhes na manipulação de arrays
2. Reforcei o entendimento sobre como as travessias de árvore se relacionam estruturalmente
3. A prática de dividir problemas complexos em passos menores foi essencial para conseguir avançar

📚 Documentações Utilizadas:

Arrays: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

📌 Link da questão:  
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/  
Código completo: https://github.com/DiegoVSC42/100DaysOfLeetCode/tree/main/Dia-51

#100DaysOfLeetCode #Java #BinaryTree #Recursion #DataStructures #Algorithms
