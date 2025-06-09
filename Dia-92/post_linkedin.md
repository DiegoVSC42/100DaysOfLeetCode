🚀 Dia 92/100: #100DaysOfLeetCode – Programação Dinâmica Multidimensional

Hoje continuei estudando programação dinâmica, focando em desafios multidimensionais. O primeiro exigia encontrar o número de caminhos únicos em uma grade, algo que inicialmente me confundiu, mas depois percebi que era muito semelhante à lógica do triângulo de Pascal. Já o segundo desafio foi mais complexo, envolvendo subsequências comuns entre duas strings, e a sacada foi perceber que percorrer as strings de trás para frente facilitava muito a construção da solução.

🌟 Minha Solução:

No primeiro exercício, criei uma matriz onde cada célula armazena o número de caminhos possíveis até aquele ponto. A base da lógica era que só há um caminho para qualquer célula na primeira linha ou primeira coluna, e o restante das células pode ser preenchido somando os valores da célula de cima com a da esquerda.

No segundo exercício, utilizei uma matriz para armazenar o tamanho da maior subsequência comum a partir de cada par de índices. Percorri as strings de trás para frente, comparando os caracteres e acumulando os valores, o que permitiu montar a solução de forma eficiente e organizada.

📌 Links:
Unique Paths: https://leetcode.com/problems/unique-paths/?envType=study-plan-v2&envId=leetcode-75
Longest Common Subsequence: https://leetcode.com/problems/longest-common-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-92/Solution.java

#Java #DynamicProgramming #Matrix #LeetCode #100DaysOfLeetCode
