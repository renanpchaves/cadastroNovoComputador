# 💻 Cadastro de Computadores

Projeto desenvolvido durante a faculdade para praticar conceitos de Orientação a Objetos em Java.

O programa permite cadastrar computadores via terminal e exibe um relatório final com todos os dados inseridos. (configurado para dois registros no total)

## Conceitos aplicados

- Encapsulamento (atributos privados + getters/setters)
- Construtores (padrão e com parâmetros)
- Arrays de objetos
- Tratamento de exceções (`NumberFormatException`)
- Sobrescrita do método `toString()`

## Como executar

Compile os arquivos:

```bash
javac Computador.java TestaComputador.java
```

Execute:

```bash
java TestaComputador
```

## Exemplo de uso

```
Cadastro de Computadores - Preencha os dados

Computador 1
Marca: Dell
Modelo: Inspiron 15
Memória RAM (GB): 16
Armazenamento (GB): 512
Sistema Operacional: Windows 11

=== RELATÓRIO FINAL ===

Computador 1:
Marca: Dell
Modelo: Inspiron 15
Memória RAM: 16GB
Armazenamento: 512GB
Sistema Operacional: Windows 11
----------------------------------------
```
