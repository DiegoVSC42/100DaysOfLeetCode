🚀 Dia 66/100: #100DaysOfLeetCode - Verificando ciclos em grafos com DFS

Hoje continuei os estudos em grafos resolvendo o problema de verificação de ciclos em um grafo direcionado. A proposta envolve identificar se é possível concluir todos os cursos, dado um conjunto de pré-requisitos.

🌟 Minha Solução:

Inicialmente, minha abordagem só identificava ciclos diretos, como o curso 1 exigindo o 0 e o curso 0 exigindo o 1. Mas casos mais complexos, como o curso 0 exigindo o 1, que exige o 2, que exige o 0, estavam passando despercebidos. Para resolver isso, utilizei DFS com dois vetores para controlar o estado de cada nó, marcando os que estão em visita e os já concluídos. Dessa forma, consegui detectar qualquer tipo de ciclo.

💡 Reflexão do dia:

Esse tipo de problema me lembrou do Paradoxo do mentiroso. Ele acontece quando alguém diz "eu estou mentindo". Se essa afirmação for verdadeira, então a pessoa está mentindo, o que a tornaria falsa. Mas se for falsa, então a pessoa não está mentindo, o que a tornaria verdadeira. Essa contradição ilustra bem o comportamento de ciclos em grafos, onde uma dependência leva a outra de forma circular, sem ponto de partida consistente.

📌 Links:

Desafio: https://leetcode.com/problems/course-schedule/

Minha Solução: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-66/Solution.java

#Java #Graph #DFS #CycleDetection #TopologicalSort #100DaysOfLeetCode
