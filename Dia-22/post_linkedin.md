🚀 Dia 22/100: #100DaysOfLeetCode – Encontrando a Maior Substring Sem Repetição!

Hoje resolvi o problema Longest Substring Without Repeating Characters, que me desafiou a encontrar o comprimento da maior substring sem caracteres repetidos em uma string. Utilizei uma abordagem com sliding window e HashMap para alcançar uma solução eficiente.

💡 Sobre o Longest Substring Without Repeating Characters:

O objetivo era percorrer a string mantendo uma janela dinâmica (start até i) que sempre contém caracteres únicos. Implementei usando:

1. Um HashMap para armazenar os caracteres e seus índices mais recentes
2. Uma variável start para marcar o início da janela atual
3. Atualização constante do resultado máximo encontrado

🌟 Reflexão do Dia 22:

1️⃣ Sliding Window: Aprendi como ajustar dinamicamente os limites da janela quando encontro caracteres repetidos.
2️⃣ Eficiência com HashMap: Utilizei o mapa para armazenar e acessar rapidamente as posições dos caracteres, garantindo O(1) para operações de busca.
3️⃣ Complexidade Otimizada: A solução tem tempo O(n) e espaço O(min(m,n)), onde m é o tamanho do alfabeto e n o tamanho da string de entrada.

📌 Para quem se identifica:

Se você também está estudando algoritmos de sliding window ou buscando otimizar soluções para problemas de strings, vamos trocar ideias!

👉 Acompanhe a jornada:

Quer ver minha implementação ou discutir variações deste problema? Comente abaixo!

📚 Documentação utilizada:

- Map em Java: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

Link para o desafio: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Link para o código: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-22/Solution.java

#100DaysOfLeetCode #Algorithms #DataStructures #SlidingWindow #CodingJourney
