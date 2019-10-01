# Liskov Substitution Principle

(Princípio da Substituição de Liskov)

Considere o seguinte método:

```java
public static void testaRetangulo(Retangulo retangulo) {
	retangulo.setLargura(3);
	retangulo.setAltura(4);

	// ...
}
```

Após chamar esse método, qual será a área do retângulo? Em um sistema bem projetado, a resposta será sempre 12, correto?

Vamos considerar agora a classe `Quadrado`, que estende `Retangulo`. O uso de herança parece fazer correto, porque quadrado é um tipo de retângulo. No entanto, em um quadrado a largura é sempre igual à altura. Assim, `setAltura` altera tanto a altura quanto a largura, e a mesma coisa acontece com `setLargura`.

Agora considere passar um objeto do tipo `Quadrado` para o método `testaRetangulo`. Qual será a área do quadrado após a execução do método?


