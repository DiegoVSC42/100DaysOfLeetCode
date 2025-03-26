🚀 Dia 17/100: #100DaysOfLeetCode – Encontrando a Raiz Quadrada Inteira!

Hoje resolvi o problema Sqrt(x), que me desafiou a calcular a raiz quadrada inteira de um número sem usar funções nativas. Comecei com uma abordagem de força bruta, mas evolui para uma solução mais eficiente usando busca binária.

💡 Sobre o Sqrt(x):

O objetivo era encontrar a parte inteira da raiz quadrada de x. Minha primeira tentativa usou um loop linear (O(n)), verificando cada número até encontrar o resultado correto. Embora funcione, essa abordagem se mostrou ineficiente para números grandes.

🌟 Reflexão do Dia 17:

1️⃣ Primeira Abordagem: Implementei uma solução linear que verificava cada número sequencialmente, mas percebi que era muito lenta para entradas grandes.

2️⃣ Problema com Overflow: Notei que precisava lidar com overflow ao calcular quadrados de números grandes, usando o tipo long para armazenar temporariamente os resultados.

3️⃣ Busca Binária: A solução final implementou busca binária (O(log n)), que reduziu drasticamente o tempo de execução e se mostrou muito mais eficiente.

📌 Para quem se identifica:

Se você também está estudando algoritmos de busca ou enfrentando desafios para otimizar soluções aparentemente simples, vamos trocar experiências!

👉 Acompanhe a jornada:

Seguirei compartilhando insights e códigos. Quer sugerir um próximo desafio ou compartilhar sua abordagem para esse problema? Comente abaixo!

Link para o desafio: https://leetcode.com/problems/sqrtx/
Link para o código: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-17/Solution.java

#100DaysOfLeetCode #Algorithms #BinarySearch #Optimization #CodingJourney
