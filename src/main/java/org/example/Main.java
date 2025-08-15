package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex02();
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
}