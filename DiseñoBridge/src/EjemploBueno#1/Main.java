public class Main {
    public static void main(String[] args) {
        Animal mapache = new Mapache(new Omnivoro());
        Animal chimpance = new Chimpance(new Omnivoro());
        Animal cocodrilo = new Cocodrilo(new Carnivoro());
        Animal koala = new Koala(new Herviboro());

        mapache.comer();     // Mapache: Comiendo de todo un poco.
        chimpance.comer();   // Chimpancé: Comiendo de todo un poco.
        cocodrilo.comer();   // Cocodrilo: Comiendo carne.
        koala.comer();       // Koala: Comiendo plantas.
    }
}
