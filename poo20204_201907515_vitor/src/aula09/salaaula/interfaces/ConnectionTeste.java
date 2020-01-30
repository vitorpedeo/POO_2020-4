package aula09.salaaula.interfaces;

public class ConnectionTeste {
    public static void main(String[] args) {
        DBConnection connection;

        String url = "http://localhost:1521/pooDb";
        String userName = "usuarioAluno";
        String password = "aluno123";

        //Oracle
        connection = new OracleConnection();
        connection.getConnection(url,userName,password);
        //MySQL
        connection = new MySQLConnection();
        connection.getConnection(url,userName,password);
    }
}