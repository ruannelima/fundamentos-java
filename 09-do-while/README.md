# Do While 🔄

Exercício desenvolvido durante meus estudos de Java na graduação em Análise e Desenvolvimento de Sistemas.

## 🎯 Objetivo

Praticar a utilização da estrutura de repetição `do while` em Java, combinando-a com conceitos estudados anteriormente para criar um menu interativo.

## 📚 Conceitos praticados

* Declaração de variáveis
* Tipo de dado `int`
* Entrada de dados com `Scanner`
* Estrutura de repetição `do while`
* Variável de controle
* Condição de repetição
* Operador relacional `!=`
* Estrutura de seleção `switch`
* `case`
* `break`
* `default`
* `System.out.println()`

## 💻 Funcionamento

O programa apresenta um menu principal com três opções:

* `1` → Cadastrar
* `2` → Consultar
* `3` → Sair

O usuário escolhe uma opção utilizando o teclado. O `switch` verifica a escolha e executa a ação correspondente.

Caso seja digitada uma opção diferente de `1`, `2` ou `3`, o programa informa que a opção é inválida.

O menu continua sendo exibido enquanto a opção escolhida for diferente de `3`:

```java
while(op != 3);
```

Quando `op` recebe o valor `3`, a condição se torna falsa e o programa é encerrado.

### Exemplo de saída

```text
-------------------
MENU PRINCIPAL
-------------------
1 - Cadastrar
2 - Consultar
3 - Sair
Escolha uma opção:
1
1 - Cadastrar

-------------------
MENU PRINCIPAL
-------------------
1 - Cadastrar
2 - Consultar
3 - Sair
Escolha uma opção:
4
Opção inválida

-------------------
MENU PRINCIPAL
-------------------
1 - Cadastrar
2 - Consultar
3 - Sair
Escolha uma opção:
3
3 - Encerrando programa...
```

## 🧠 Aprendizado

Neste exercício, a estrutura `do while` foi utilizada junto com `Scanner` e `switch`, permitindo criar um menu que permanece em execução até que o usuário escolha a opção de saída.

## 🛠️ Tecnologia

* Java
