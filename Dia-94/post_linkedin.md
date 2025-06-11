🚀 Dia 94/100: #100DaysOfLeetCode – String, Prefix Sum e Two Pointers

Hoje resolvi três exercícios focando em áreas diferentes. O primeiro foi um desafio básico envolvendo strings e a ideia de divisor comum, o segundo sobre soma de prefixos em arrays e o terceiro aplicando a técnica de two pointers para verificação de subsequência. Foi interessante ver como diferentes técnicas se aplicam de forma natural a problemas aparentemente simples.

🌟 Minha Solução:

No primeiro exercício, utilizei o conceito de concatenação e MDC para descobrir se uma string era composta por repetições de um mesmo padrão. Se str1 + str2 for diferente de str2 + str1, não há divisor comum. Caso haja, o tamanho do maior divisor comum das strings indica o tamanho do padrão.

O segundo exercício pedia o índice de pivô em um array, ou seja, um índice onde a soma à esquerda fosse igual à soma à direita. Calculei a soma total e fui ajustando dinamicamente o valor da esquerda e direita a cada passo para identificar esse ponto.

Por fim, no terceiro desafio, percorri duas strings com ponteiros para checar se uma era subsequência da outra. O foco foi acompanhar o avanço do ponteiro da string menor ao encontrar correspondências, garantindo que a ordem fosse mantida.

📌 Links:
Greatest Common Divisor of Strings: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
Find Pivot Index: https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
Is Subsequence: https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-94/Solution.java

#Java #Strings #PrefixSum #TwoPointers #100DaysOfLeetCode
