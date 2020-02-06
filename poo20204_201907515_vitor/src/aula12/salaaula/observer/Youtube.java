package aula12.salaaula.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel VenomExtreme = new Channel();

        Subscriber s1 = new Subscriber("XxVitorxX");
        Subscriber s2 = new Subscriber("PedroCraft");
        Subscriber s3 = new Subscriber("GamerHD");
        Subscriber s4 = new Subscriber("FullVideos");
        Subscriber s5 = new Subscriber("MegaHunterGames");

        VenomExtreme.subscribe(s1);
        VenomExtreme.subscribe(s2);
        VenomExtreme.subscribe(s3);
        VenomExtreme.subscribe(s4);
        VenomExtreme.subscribe(s5);

        s1.subscribeChannel(VenomExtreme);
        s2.subscribeChannel(VenomExtreme);
        s3.subscribeChannel(VenomExtreme);
        s4.subscribeChannel(VenomExtreme);
        s5.subscribeChannel(VenomExtreme);

        VenomExtreme.uploadVideo("Venom e os Aventureiros");
    }
}
