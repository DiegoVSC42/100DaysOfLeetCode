🚀 Dia 59/100: #100DaysOfLeetCode - Validando Árvores de Busca Binária (BST)

O desafio de hoje parecia simples à primeira vista, mas se revelou mais complexo do que eu imaginava. Percebi que apenas verificar se os filhos são menores ou maiores que o nó pai não é suficiente. Uma subárvore à direita, por exemplo, pode conter nós com valores menores que o nó raiz, e ainda assim estar posicionada incorretamente. O mesmo vale para a subárvore à esquerda com valores maiores.

💡 Minha Solução:

Para resolver corretamente, implementei uma função auxiliar que guarda os valores mínimos e máximos que cada nó pode assumir, garantindo assim que a estrutura seja respeitada em toda a profundidade da árvore. Chegar a essa lógica exigiu bastante reflexão, mas foi recompensador entender os limites de cada subárvore e como eles impactam a validade da BST.

🌟 Reflexão do dia:

Nem sempre a solução mais óbvia é a correta. Em estruturas como BST, é essencial considerar todo o contexto da árvore e não apenas as relações diretas entre pai e filho. Essa questão me ensinou bastante sobre como o escopo de uma verificação pode ser mais amplo do que parece.

📌 Links:
Desafio: https://leetcode.com/problems/validate-binary-search-tree/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-59/Solution.java

#Java #BinarySearchTree #Recursao #Algoritmos #100DaysOfLeetCode
