
# Trilha Java Básico

Esse repósitorio é uma resposta para o desafio de criar um simulador de uma conta bancária no terminal proposta no repositório [trilha-java-basico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe).


## Como funciona

Nesse projeto tem apenas a classe ContaTerminal que tem um método estático Main, nele tem 4 váriaveis, sendo elas respectivamente:


 | Nome       |    Tipo    | Exemplo   |
 | ---------  | ---------- | --------- |
 | numero     |   int      |   1059    |
 | agencia    |   String   |   05-87   |
 | nomeCliente|   String   | Vitor Hugo|
 | saldo      |   double   |   500     |
    

Ao rodar ele em uma IDE ou atráves do terminal de seu sistema operacional, o mesmo vai perguntar sobre dados para serem colocados nas váriaveis e no fim da execução vai apresentar a seguinte mensagem:

    "Olá cliente [nomeCliente] obrigado por criar a sua conta no nosso banco,
    a sua agência é [agencia], 
    conta [numero] e o seu saldo R$[saldo] já esta disponível para saque"!

Quaisquer elemento entre [] vai ser substituido por elementos digitados pelo usuário.
