# Exercicio

_Em um banco, para se cadastrar uma conta bancária, é necessário o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja : se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente,zero._

_Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.Já o nome do titular pode ser alterado(pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo)._

_Por fim, o seu saldo da conta não pode ser livremente. é preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósito, e só diminui por meio de saques.Para cada saque realizado, o banco cobra uma taxa de R$5.00.NOta: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa._

_Você deve fazer um progra  que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. EM seguida, realizar um deposit e depois um saque, sempre mostrando os dados da conta após cada operação_

## **(Exemplos nas proximas páginas)**

**Exemplo 1**

enter account number: **8532**
Enter account holder:  **Alex Green**
Is there na initial deposit(y/n)? **y**
Enter initial deposit value: **500.00**

Account data:
**Account 8532,Holder: Alex Green, Balance: $ 500.00**

Enter a deposit value: **200.00**
Update account data:
**Account 8532,holder: Alex Green,Balance: $700.00**

Enter a withdraw value:**300.00**
Update account data:
**Account 8532,Holder: ALex Green ,Balance: $395.00**
