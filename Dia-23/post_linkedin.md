🚀 Dia 23/100: #100DaysOfLeetCode – Encontrando o Número Solitário com XOR!

Hoje resolvi o problema Single Number, que pede para identificar o único número que aparece uma vez em um array onde todos os outros aparecem duas vezes. Minha primeira abordagem usou um HashMap, mas depois descobri uma solução genial usando a operação XOR (OU exclusivo).

💡 Como o XOR resolve o problema:

O XOR tem propriedades mágicas para esse problema:

1. A ^ A = 0 (qualquer número XOR consigo mesmo resulta em 0)
2. A ^ 0 = A (qualquer número XOR com 0 permanece o mesmo)
3. A ^ B ^ A = B (a operação é comutativa e associativa)

🌟 Exemplo Prático:
Vamos usar o array [4, 1, 2, 1, 2]:

1. 0 ^ 4 = 4
2. 4 ^ 1 = 5
3. 5 ^ 2 = 7
4. 7 ^ 1 = 6
5. 6 ^ 2 = 4 (resultado final)

O número 4 é o único que não se cancela!

🌟 Reflexão do Dia 23:
1️⃣ Primeira Abordagem: Usei HashMap para contar ocorrências (O(n) espaço), mas não era ótima.
2️⃣ XOR: Descobri esta solução que usa O(1) de espaço extra, apenas um acumulador.
3️⃣ Bitwise Operations: Aprendi como operações binárias podem resolver problemas de forma elegante.

📌 Para quem se identifica:
Se você também está explorando operações binárias ou buscando otimizar soluções, vamos trocar ideias!

👉 Acompanhe a jornada:
Quer ver mais exemplos ou discutir outras aplicações do XOR? Comente abaixo!

Link para o desafio: https://leetcode.com/problems/single-number/
Link para o código: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-23/Solution.java

#100DaysOfLeetCode #Bitwise #XOR #Algorithms #Optimization
