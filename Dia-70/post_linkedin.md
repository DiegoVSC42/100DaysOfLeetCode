🚀 Dia 70/100: #100DaysOfLeetCode - Implementando uma pilha com valor mínimo

Após passar uns dias estudando grafos fui para o próximo tópico de estudo que são stacks. Consistem basicamente em uma estrutura de primeiro a entrar e último a sair. Esse desafio me fez criar uma implementação de uma stack e também um método para devolver o menor valor dela. Essa parte foi a mais complicadinha do desafio pois tive que criar uma lista que serve como uma espécie de caching que vai guardando o menor valor até o momento.

🌟 Minha Solução:

Utilizei duas listas. Uma armazena todos os elementos da pilha e a outra armazena o menor valor até aquela posição, permitindo acessar o mínimo em tempo constante. A cada inserção, comparo o novo valor com o menor valor atual e salvo o mínimo entre eles na lista auxiliar.

💡 Reflexão do dia:

A ideia de manter um histórico paralelo com os valores mínimos foi a chave para resolver esse problema. Aprendi que otimizações simples, como esse tipo de caching, podem transformar um algoritmo aparentemente complicado em uma solução elegante e eficiente.

📚 Documentação:
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html

📌 Links:
Desafio: https://leetcode.com/problems/min-stack/
Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-70/Solution.java

#Java #Stack #MinStack #100DaysOfLeetCode
