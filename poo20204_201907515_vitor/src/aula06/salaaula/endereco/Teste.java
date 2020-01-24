package aula06.salaaula.endereco;

//Por algum motivo não está funcionando, consertar!
public class Teste {
    public static void main(String[] args) {
        Pais p = new Pais("Brasil");
        Estado e = new Estado("Goiás", "GO", p);
        Municipio mun = new Municipio(25300L, "Goiânia", e);
        Bairro b = new Bairro("Setor Central", "Central", mun);
        Logradouro log = new Logradouro("Paranaíba", TipoLogradouro.AVENIDA);
        Endereco end = new Endereco("125", "QD.45 LT.28 26A", 756692100, "Residencial", b, log);

        System.out.println(end);
    }
}