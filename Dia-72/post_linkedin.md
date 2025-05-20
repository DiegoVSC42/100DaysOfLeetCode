🚀 Dia 72/100: #100DaysOfLeetCode - Simplificando caminhos de arquivos com Stack

Mais um dia estudando stacks e hoje o problema foi bem interessante por envolver a lógica de um sistema de arquivos no estilo Unix. A ideia era simplificar um caminho absoluto, resolvendo referências como . e .. para chegar ao caminho final correto.

🌟 Minha Solução:

No começo, estava usando uma lista para armazenar os diretórios e depois remontava o caminho manualmente, o que era pouco eficiente. Durante o desafio, descobri que a classe Stack do Java permite iteração direta, por ser uma Collection. Com isso, consegui reescrever o código para usar apenas a Stack do início ao fim, o que deixou a solução mais limpa e performática.

💡 Reflexão do dia:

Foi gratificante ver como conhecer melhor as bibliotecas da linguagem pode tornar a solução mais elegante e eficiente. Pequenos detalhes como saber que uma Stack é iterável fazem diferença real na prática.

📚 Documentação:
Stack: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
String: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

📌 Links:
Desafio: https://leetcode.com/problems/simplify-path/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-72/Solution.java

#Java #Stack #String #100DaysOfLeetCode
