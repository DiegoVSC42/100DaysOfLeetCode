🚀 Dia 71/100: #100DaysOfLeetCode - Temperaturas mais quentes com pilha monotônica

Continuando os estudos com stacks, hoje trabalhei com um problema clássico de pilha monotônica. A ideia era, para cada temperatura, calcular em quantos dias a temperatura será mais alta. Para isso, foi necessário manter uma estrutura de dados que permitisse acessar rapidamente os dias anteriores que ainda não tinham encontrado uma temperatura maior.

🌟 Minha Solução:

Utilizei uma stack para armazenar os índices das temperaturas anteriores. A cada nova temperatura, verifico se ela é maior que a temperatura no topo da pilha. Se for, calculo o número de dias e atualizo o resultado. Esse tipo de pilha garante que os elementos estejam ordenados de forma a permitir essa comparação eficiente.

💡 Reflexão do dia:

Esse exercício foi essencial para consolidar o conceito de pilha monotônica. Aprendi que stacks são ótimas não só para armazenar dados, mas também para resolver problemas que envolvem comparações com elementos anteriores de forma eficiente.

📚 Documentação:
Stack: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

📌 Links:
Desafio: https://leetcode.com/problems/daily-temperatures/description/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-71/Solution.java
