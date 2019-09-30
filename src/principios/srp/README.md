# Single Responsibility Principle

(Princípio da Responsabilidade Única)

As classes Ator e Filme, além de representar as informações de atores e filmes, também estão responsáveis por ler os dados do teclado. Portanto, as classes violam o princípio da responsabilidade única.

Para refletir:

- E se decidirmos ler de um arquivo, e não do teclado? Ou de um banco de dados? Ou de um serviço web?
- E se quisermos ter versões em inglês e português da interface?

<!--
Crie classes como AtorReader, FilmeReader...
(outros sufixos comuns: DAO, Repository)
-->