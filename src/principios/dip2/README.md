# Dependency Inversion Principle

(Princípio da Inversão de Dependência)

Problema:

- `Botao` representa um mecanismo genérico para ligar e desligar equipamentos
- `Lampada` representa objetos bastante específicos que, quando ligados, iluminam um ambiente
- Suponha que queremos ligar e desligar uma lâmpada usando um botão
- Não faz sentido que o código de `Botao` faça referência a `Lampada`, pois nesse caso o `Botao` deixaria de ser genérico

Solução: `Botao` define uma interface para ser implementada pela lâmpada e por outros objetos que possam ser ligados e desligados.