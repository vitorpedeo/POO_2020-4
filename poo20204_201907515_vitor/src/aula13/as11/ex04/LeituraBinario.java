package aula13.as11.ex04;

import aula13.as11.ex01.Agenda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Exercício 4
*/

public class LeituraBinario {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (new File(System.getProperty("user.dir") + "\\src\\arquivos_as11\\Agenda.bin"));
        Agenda agenda = new Agenda();

        System.out.println("Contatos no Arquivo .bin:\n");
        while (scanner.hasNext()) {
            String nome = scanner.next();
            String sobrenome = scanner.next();
            int idade = scanner.nextInt();
            double altura = (scanner.nextDouble());

            agenda.armazenaPessoa(nome + " " + sobrenome, idade, altura);
        }

        //Mostrando contatos que estavam no arquivo e forma gravados na Agenda
        agenda.mostraAgenda();
        scanner.close();
}
}
