🚀 Dia 74/100: #100DaysOfLeetCode - Removendo Letras Duplicadas para Obter a Menor String Lexicográfica

Hoje o desafio foi bem complexo. De início, estava utilizando hashmaps para guardar as informações de cada letra, uma para a frequência e outra para verificar se já tinha sido visitada. Porém, essa solução apresentava runtime muito alto, então resolvi otimizar usando arrays que fazem cálculos com base na tabela ASCII. Dessa forma, o runtime caiu de 6ms para 3ms.

🌟 Minha Solução:

Usei uma stack para construir a string resultado, mantendo controle das frequências das letras e se elas já estavam na pilha. Quando encontrava uma letra menor que o topo da pilha e ainda havia ocorrências futuras do topo, eu removia a letra do topo para garantir a menor ordem lexicográfica possível.

💡 Reflexão do dia:

O uso de arrays em vez de hashmaps, especialmente para problemas envolvendo caracteres limitados, pode melhorar bastante a performance e simplificar o código. Além disso, a lógica de manipulação da stack para manter a ordem correta é bastante elegante.

📚 Documentação:

String: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
Arrays: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
Stack: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html

📌 Links:

Desafio: https://leetcode.com/problems/remove-duplicate-letters/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-74/Solution.java

#Java #Stack #StringManipulation #100DaysOfLeetCode
