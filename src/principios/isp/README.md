# Interface Segregation Principle

(Princípio da Segregação de Interfaces)

Problema:

- A interface `Aluno` generaliza alunos de várias instituições, que podem, por exemplo, ter regras diferentes para validação de número de matrícula, cálculo de média geral etc.
- Da mesma forma, a interface `Professor` generaliza professores de várias instituições.
- A classe `Escalonamento` é responsável por imprimir o escalonamento dos alunos para a matrícula, e recebe uma `Collection<Aluno>`.
- Observe, no entanto, que ela só usa o método `getNome()` da interface `Aluno`.
- Essa classe poderia ser usada, sem modificação, para imprimir uma lista de professores?
  - Se não, como seria melhor projetar o sistema de forma a permitir o reúso?

Solução:

- Crie múltiplas interfaces especializadas: Pessoa, MembroDeUniversidade...
