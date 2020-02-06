package aula11.as9b.ex04;

/*
 Exercício 4
*/

public class Logger {

    private static Logger logger = null;
    private boolean ativo = false;

    private Logger(){
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void log(String s) {
        if(this.ativo) {
            System.out.println("LOG :: " + s);
        }
    }
}
