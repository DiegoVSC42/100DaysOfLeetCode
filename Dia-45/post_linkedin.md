🚀 Dia 45/100: #100DaysOfLeetCode - Ordenação Relativa de Arrays

Hoje resolvi o problema de ordenação relativa, onde precisamos ordenar um array (arr1) de acordo com a ordem definida por outro array (arr2), e os elementos não presentes em arr2 devem ser ordenados no final em ordem crescente.

💡 Minha Solução:

Utilizei uma abordagem em duas etapas:

1. Primeiro reorganizei os elementos de arr1 que estão em arr2, mantendo a mesma ordem relativa
2. Depois ordenei os elementos restantes que não estavam em arr2 usando uma ordenação simples por seleção

A grande sacada foi perceber que podíamos fazer isso in-place, trocando os elementos conforme encontramos os valores na ordem de arr2.

🌟 Reflexão do Dia:

1. Aprendi que às vezes soluções em etapas podem ser eficazes
2. Percebi a importância de entender bem os requisitos de ordenação
3. Reforcei meu conhecimento sobre manipulação de arrays e troca de elementos

📌 Para quem está estudando:
Como você otimizaria essa solução? Seria possível usar estruturas de dados auxiliares para melhorar a eficiência?

Link do problema: https://leetcode.com/problems/relative-sort-array/description/
Código completo: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-45/Solution.java

#100DaysOfLeetCode #ArraySorting #RelativeOrder #Algorithm #CodingChallenge
