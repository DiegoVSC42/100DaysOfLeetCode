🚀 Dia 46/100: #100DaysOfLeetCode - Grupo de Anagramas

Hoje resolvi o problema de agrupamento de anagramas, onde precisamos agrupar palavras que são anagramas entre si. Inicialmente, tentei uma abordagem que ordenava os caracteres de cada palavra e comparava com todas as outras, mas logo percebi que essa abordagem não era eficiente devido à sua alta complexidade. Pensando em otimizar, optei por usar um hashmap, onde as palavras ordenadas se tornam chaves e os anagramas correspondentes ficam como valores, o que tornou a solução muito mais eficiente.

💡 Minha Solução:

Utilizei um mapa para armazenar os anagramas agrupados. Para cada palavra, ordenei seus caracteres e usei a versão ordenada como chave no mapa. Assim, todos os anagramas foram facilmente agrupados sob a chave correspondente.

🌟 Reflexão do Dia:

1. Entendi a importância de otimizar abordagens ao lidar com grandes volumes de dados
2. Aprendi a usar estruturas como HashMap para reduzir a complexidade de problemas de agrupamento
3. Reforcei meu conhecimento sobre manipulação de arrays e strings em Java

📌 Para quem está estudando: Como você otimiza suas soluções quando a complexidade começa a se tornar um problema? Já experimentou usar mapas ou outras estruturas auxiliares para acelerar seu código?

Link do desafio: https://leetcode.com/problems/group-anagrams/  
Código completo: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-46/Solution.java

📚 Documentações Utilizadas:

Arrays: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html  
String: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html  
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html  
Map: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

#100DaysOfLeetCode #Anagrams #Algorithm #CodingChallenge #Java #DataStructures
