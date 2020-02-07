package aula13.as11.ex06;

import aula13.as11.ex01.Agenda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Exercício 6
*/

public class LeituraTextoRAF {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (new File(System.getProperty("user.dir") + "\\src\\arquivos_as11\\AgendaRAF.txt"));
        Agenda app = new Agenda();

        System.out.println("Contatos no Arquivo RAF.txt:\n");
        while (scan.hasNext()) {
            String nome = scan.next();
            String sobrenome = scan.next();
            int idade = scan.nextInt();
            double altura = (scan.nextDouble());

            app.armazenaPessoa(nome + " " + sobrenome, idade, altura);
        }

        //Mostrando contatos que estavam no arquivo e forma gravados na Agenda
        app.mostraAgenda();
        scan.close();
}
}
