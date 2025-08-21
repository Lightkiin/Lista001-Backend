package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ex08();
    }

    static void ex01(){
        System.out.println("Bem-vindo ao Sistema de Geração de Jogadores!");
    }

    static void ex02(){
        String nomeCompleto = "Maria Silva";
        String cargo = "Analista de Sistemas";
        double salario = 4500.00;

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Cargo: "  + cargo);
        System.out.println("Salário: R$ " + salario);
    }
    static void ex03(){
        Scanner read =  new Scanner(System.in);
        System.out.print("Qual o nome do produto? ");
        String produto = read.nextLine();
        System.out.print("Qual o código do produto? ");
        int codigo = read.nextInt();
        System.out.print("Qual o preço do produto? ");
        double  preco = read.nextDouble();
        System.out.print("Qual o produto está em promoção?");
        boolean promocao = read.nextBoolean();

        System.out.println("Produto: " + produto);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Promoção: " + promocao);
    }
    static void ex04(){
        Scanner read = new Scanner(System.in);
        System.out.print("Qual o valor da sua compra? R$");
        double valor = read.nextDouble();
        double desconto = 0.1;

        if(valor > 100){
            double valorFinal = (valor - (valor * desconto));
            System.out.print("Valor final com desconto: R$" + valorFinal);
        }
        else{
            System.out.print("Valor final sem desconto: R$" + valor);
        }
    }
    static void ex05(){
        Scanner read = new Scanner(System.in);
        System.out.print("Qual a sua idade? ");
        int idade = read.nextInt();
        if(idade < 12){
            System.out.println("Categoria: Infantil");
        }
        else if (idade > 12 && idade <=17) {
            System.out.println("Categoria: Adolescente");
        }
        else{
            System.out.println("Categoria: Adulto");
        }
    }
    static void ex06(){
        int[] notas = new int[5];
        Scanner read = new Scanner(System.in);
        int soma = 0;

        for (int c=0; c<=4; c++){
            int contagem = c + 1;
            System.out.print("Qual a " + contagem + "° nota? ");
            int nota = read.nextInt();
            notas[c] = nota;
            soma += nota;
        }

        for (int c=0; c<=4; c++){
            int contagem = c + 1;
            System.out.println(contagem + "° nota : " + notas[c]);
        }

        double media = soma/5.0;
        System.out.println("Média: " + media);
    }
    static void ex07() {
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        System.out.print("Peso (kg): ");
        double peso = read.nextDouble();

        System.out.print("Altura (m): ");
        double altura = read.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("IMC calculado: %.2f%n", imc);
    }

    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    static void ex08() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nome = read.nextLine();

        int caracteresSemEspaco = nome.replace(" ", "").length();

        String nomeMaiusculo = nome.toUpperCase();

        boolean contemSilva = nome.toLowerCase().contains("silva");

        System.out.println("Número de caracteres: " + caracteresSemEspaco);
        System.out.println("Maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + contemSilva);
    }

}