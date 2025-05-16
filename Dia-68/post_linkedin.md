🚀 Dia 68/100: #100DaysOfLeetCode - Ordenando cursos com busca em profundidade

Hoje continuei explorando grafos com um problema semelhante ao do dia 66, mas com uma exigência a mais: retornar a ordem em que os cursos devem ser feitos, respeitando as dependências de pré-requisitos. A solução envolve uma variação da ordenação topológica utilizando DFS.

🌟 Minha Solução:

Apesar da estrutura lembrar o exercício anterior, dessa vez foi necessário adicionar os cursos na ordem correta. Também otimizei o uso de memória, substituindo os dois vetores anteriores por apenas um, em que o valor 0 representa não visitado, 1 visitando e -1 já visitado. Isso simplificou bastante o controle de estados durante a recursão e manteve a lógica eficiente.

💡 Reflexão do dia:

Foi interessante perceber como pequenas mudanças no enunciado exigem novos cuidados na lógica. A refatoração para um único vetor de estado deixou o código mais elegante e claro, além de reforçar minha compreensão sobre ordenação topológica com DFS.

📚 Documentação:
Map: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
Arrays: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

📌 Links:

Desafio: https://leetcode.com/problems/course-schedule-ii/

Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-68/Solution.java

#Java #Graph #DFS #TopologicalSort #100DaysOfLeetCode #LeetCodeChallenge
