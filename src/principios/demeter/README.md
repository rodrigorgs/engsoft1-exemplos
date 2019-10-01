# Lei de Demeter

O `EntregadorDePizza` recebe um cliente, entrega a pizza para ele e recebe um pagamento em troca. No código atual, o pagamento é implementado em `EntregadorDePizza.entrega(cliente)` da seguinte forma:

```java 
cliente.getCarteira().retirarDinheiro(valor)
```

Efetivamente o entregador de pizza tem mais informação do que deveria (o que indica uma quebra do encapsulamento). E se o cliente guardar dinheiro na gaveta? E se no futuro o entregador aceitar, além de dinheiro em espécie, cartão de crédito?

Solução: implementar método `Cliente.paga(quantia)`; alterar `EntregadorDePizza.entrega(cliente)` para usar esse método. 


<!--
https://www2.ccs.neu.edu/research/demeter/demeter-method/LawOfDemeter/paper-boy/demeter.pdf
-->