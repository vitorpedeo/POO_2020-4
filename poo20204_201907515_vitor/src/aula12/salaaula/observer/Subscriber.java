package aula12.salaaula.observer;

public class Subscriber {

    private String nome;
    private Channel channel = new Channel();

    public Subscriber(String nome) {
        this.nome = nome;
    }

    public void update() {
        System.out.println("Hey " + this.nome + " ,there's a new video! -> " + this.channel.title);
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
