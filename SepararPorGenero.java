package Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        int quantidadePessoas;

        System.out.print("Digite o número de pessoas: ");
        quantidadePessoas = scanner.nextInt();

        for (int i = 0; i < quantidadePessoas; i++) {
            scanner.nextLine();
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            char sexo = scanner.next().charAt(0);


            if (sexo == 'M' || sexo == 'm') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                i--; 
            }
        }

        System.out.println("\nNomes no grupo masculino:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes no grupo feminino:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
