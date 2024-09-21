# Implementando Associação de objetos

## 1 para 1

- **Classes:** Pessoa e CPF

## Funcionalidade
- Na classe Pessoa, declaramos os atributos nome do tipo String e cpf do tipo CPF, e é neste ponto onde ocorrerá a associação entre os objetos, ou seja, armazenará a referência do objeto pessoa​
- **Associação unilateral:** No construtor, recebemos o nome da pessoa e o objeto cpf e as setamos pelos métodos setters. ​
- **Associação bilateral:** Na última linha, estamos associando o objeto pessoa no objeto cpf, isso é a associação bilateral​
- Na classe CPF, declaramos a atributos numCpf do tipo String, e a atributos pessoa do tipo Pessoa e é neste ponto onde ocorrerá a associação entre os objetos, ou seja, armazenará a referência do objeto pessoa.​
  Associação unilateral: No construtor, recebemos apenas o cpf da pessoa e o setamos pelo método setter. ​
- Na classe Principal, instanciamos o objeto cpfRafael e inicializamos o objeto com o seu CPF. Na sequência instanciamos o objeto pessoaRafael e inicializamos o objeto com o nome e o seu objeto cpfRafael.​ Para finalizar, realizamos a impressão dos objetos.
