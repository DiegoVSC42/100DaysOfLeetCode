🚀 Dia 77/100: #100DaysOfLeetCode - Iniciando os Estudos com Heap (PriorityQueue)

Hoje comecei a estudar uma nova estrutura de dados chamada Heap, também conhecida como PriorityQueue. O desafio foi desenvolver um algoritmo que simula um sistema de notas de corte de uma universidade, retornando o k-ésimo maior elemento em um fluxo contínuo de dados.

🌟 Minha Solução:

Utilizei uma PriorityQueue (Heap mínima) para manter apenas os k maiores elementos do fluxo. Sempre que um novo elemento é inserido, ajusto o heap removendo o menor elemento se o tamanho exceder k. Assim, consigo garantir que o topo da heap sempre será o k-ésimo maior elemento.

💡 Reflexão do dia:

A estrutura de heap é extremamente eficiente para resolver problemas que exigem manutenção de elementos em uma ordem parcial, como encontrar o k-ésimo maior ou menor elemento em tempo logarítmico. O uso de PriorityQueue facilita muito a implementação e melhora a performance.

📚 Documentação:
PriorityQueue: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html

📌 Links:
Desafio: https://leetcode.com/problems/kth-largest-element-in-a-stream/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-77/Solution.java

#Java #Heap #PriorityQueue #100DaysOfLeetCode
