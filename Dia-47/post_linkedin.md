🚀 Dia 47/100: #100DaysOfLeetCode - Soma de Três

Hoje resolvi o problema do 3Sum, que consiste em encontrar todas as combinações de três números em um array cuja soma seja igual a zero. O desafio foi entender como otimizar a busca pelas combinações, já que testar todas as possibilidades resulta em uma complexidade muito alta. Foi mais uma situação onde a ordenação teve papel fundamental para estruturar melhor a lógica de resolução.

💡 Minha Solução:

Inicialmente, utilizei o método contains da interface List para verificar se uma combinação ja existia, mas percebi que isso estava gerando uma complexidade O(n), o que prejudicava muito a performance. Para melhorar, substituí o uso de List por um Set, já que o método contains do Set possui complexidade O(1). Embora a solução ainda não seja a mais performática possível, ela resolveu o problema corretamente. Faltaram alguns casos extras que poderiam ter sido adicionados para acelerar o loop, mas fiquei satisfeito com o resultado final.

🌟 Reflexão do Dia:

1. Aprendi que a escolha da estrutura de dados correta faz grande diferença na eficiência de um algoritmo
2. Reforcei como a ordenação pode ser uma grande aliada na resolução de problemas de busca
3. Percebi que mesmo com uma solução funcional, sempre há espaço para otimizações

📚 Documentações Utilizadas:

Set: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html  
List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html

📌 Links úteis:

Link do desafio: https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=sorting  
Código completo: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-47/Solution.java

#100DaysOfLeetCode #Sorting #HashSet #Java #ProblemSolving #CodingChallenge #DataStructures #Algorithms
