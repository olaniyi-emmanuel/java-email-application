package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Miracle", "Adedoyin");
        Email em2 = new Email("Emmauel" ,"Olafusi");
        Email em3 = new Email("Goke", "Bajowa");
        System.out.println(em1.showInfo());
        System.out.println(em2.showInfo());
        System.out.println(em3.showInfo());
    }
}
