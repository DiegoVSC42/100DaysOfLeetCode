🚀 Dia 37/100: #100DaysOfLeetCode – Removendo Elementos Específicos em Listas Encadeadas

Hoje enfrentei o desafio de remover todos os nós com um determinado valor de uma lista encadeada. A princípio, a remoção do primeiro nó me deixou confuso, mas a criação de um nó auxiliar no início simplificou tudo!

💡 Minha Solução:

Criei um nó dummy (newHead) apontando para o início da lista

Utilizei dois ponteiros: current (atual) e previous (anterior)

Percorri a lista verificando cada valor

Para nós com o valor alvo, ajustei os ponteiros para "pular" o nó

Mantive a referência correta para o novo início da lista

🌟 Insights do Dia:

1️⃣ Nó Dummy é Fundamental: Resolveu o problema de remover o primeiro nó
2️⃣ Dois Ponteiros: Previous mantém o rastro do nó anterior para ajustes
3️⃣ Edge Cases: Tratou corretamente lista vazia e múltiplas remoções consecutivas

📌 Para quem também está estudando:

Já pensou em como resolver esse problema com recursão? Vale a tentativa!

👉 Quer ver o código completo?

Problema: https://leetcode.com/problems/remove-linked-list-elements/
Código: https://github.com/DiegoVSC42/100DaysOfLeetCode/blob/main/Dia-37/Solution.java

#100DaysOfLeetCode #LinkedList #DummyNode #Algorithm
