🚀 Dia 44/100: #100DaysOfLeetCode - Ordenando Cores com Ponteiros Inteligentes

Hoje resolvi o problema de ordenação de cores, que exige uma abordagem específica diferente dos algoritmos de ordenação tradicionais. O desafio era ordenar os valores 0, 1 e 2 em uma única passagem pelo array.

💡 Minha Solução:

Utilizei três ponteiros para dividir o array em três partes:

- Ponteiro left para os 0s (início do array)
- Ponteiro right para os 2s (final do array)
- Ponteiro idx para percorrer o array

A grande sacada foi perceber que os 1s não precisavam de tratamento especial - eles naturalmente ficariam no meio quando todos os 0s e 2s estivessem no lugar certo.

🌟 Reflexão do Dia:

1. Aprendi que problemas específicos podem ter soluções otimizadas
2. Entendi melhor o movimento dos ponteiros durante as trocas
3. Percebi como às vezes a solução mais simples está em não tratar todos os casos

📌 Para quem está estudando:
Já pensou em como estender essa solução para mais categorias? Que outros problemas poderiam se beneficiar dessa abordagem?

Link do problema: https://leetcode.com/problems/sort-colors/
Código completo: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-44/Solution.java

#100DaysOfLeetCode #Sorting #DutchFlag #Algorithm
