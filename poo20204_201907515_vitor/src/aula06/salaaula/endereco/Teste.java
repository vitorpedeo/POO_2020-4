package aula06.salaaula.endereco;

public class Teste {
    public static void main(String[] args) {
        Pais p = new Pais("Brasil");
        Estado e = new Estado("Goiás", "GO", p);
        Municipio mun = new Municipio(25300l, "Goiânia", e);
        Bairro b = new Bairro("Setor Central", "Central", mun);
        Logradouro l = new Logradouro("Joaquim Lúcio", TipoLogradouro.TRAVESSIA);
        Endereco end = new Endereco("25", "Qd.35 Lt6 AS9", 45850000, "Residencial", b, l);

        System.out.println(end);
    }
}