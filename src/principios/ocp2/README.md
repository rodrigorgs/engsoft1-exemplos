# Open/Closed Principle

(Princípio Aberto/Fechado)

- Considere a classe `CalculadoraDeArea`, cujo método `calculaAreaTotal` recebe um array de formas geométricas e retorna o somatórios das suas áreas
- Atualmente ela só funciona com retângulos e círculos, mas é muito provável que no futuro adicionemos outras formas, como triângulos e trapézios
- Como projetar o sistema de forma que possamos adicionar novas formas sem precisar modificar a classe `CalculadoraDeArea`?

 <!--
Solução:
Definir getArea() na interface Forma. 
-->

<!-- http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/ -->