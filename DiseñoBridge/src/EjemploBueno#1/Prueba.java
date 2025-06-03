// Interfaz para tipos de alimentación (implementación del Bridge) recordemos que esto es como un puente
// de este implementan lo que son los carnivoros, herviboros y omnivoros 
interface Alimentacion {
    void comer(); // metodo 
    default void cazar() { // esto es un metodo por defecto
        System.out.println("Este animal no caza.");
    }
}

// Implementación para la clase carnivoro el cual tiene como metodos comer y cazar
class Carnivoro implements Alimentacion {
    public void comer() {
        System.out.println("Comiendo carne.");
    }
    public void cazar() {
        System.out.println("Cazando presas.");
    }
}


// Implementación para la clase Herviboro la cual tiene como metodo comer 
class Herviboro implements Alimentacion {
    public void comer() {
        System.out.println("Comiendo plantas.");
    }
}

// Implementación para la clase Omnivoro la cual tiene como metodo comer 
class Omnivoro implements Alimentacion {
    public void comer() {
        System.out.println("Comiendo de todo un poco.");
    }
}

// Igual que las otras clases abstractas este es como el modelo a seguir con sus metodos de constructor, intentarCazar,
// set alimentacion y por último comer 

abstract class Animal {
    protected Alimentacion alimentacion;

    public Animal(Alimentacion alimentacion) { // Constructor
        this.alimentacion = alimentacion;
    }

    public void intentarCazar() { // metodo para los carnivoros
        alimentacion.cazar();
    }

    public void setAlimentacion(Alimentacion alimentacion) { // Para cambiar el tipo de alimentación
        this.alimentacion = alimentacion;
    }

    public abstract void comer(); // Metodo abstracto o sea que cada clase lo maneja como quiere
}


// clase de mapache la cual hereda de animal en esta parte utilizamos el super de alimentación porque asi lo pedimos en el
// constructor además así le damos a entender a la clase Animal el tipo de alimentación que queremos
class Mapache extends Animal {
    public Mapache(Alimentacion alimentacion) {
        super(alimentacion); 
    }

    public void comer() {
        System.out.print("Mapache: ");
        alimentacion.comer();
    }
}

// clase de Chimpance la cual hereda de animal en esta parte utilizamos el super de alimentación porque asi lo pedimos en el
// constructor además así le damos a entender a la clase Animal el tipo de alimentación que queremos

class Chimpance extends Animal {
    public Chimpance(Alimentacion alimentacion) {
        super(alimentacion);
    }

    public void comer() { // aqui esta el metodo abstracto de animal
        System.out.print("Chimpancé: ");
        alimentacion.comer();
    }
}

// clase de Cocodrilo la cual hereda de animal en esta parte utilizamos el super de alimentación porque asi lo pedimos en el
// constructor además así le damos a entender a la clase Animal el tipo de alimentación que queremos

class Cocodrilo extends Animal {
    public Cocodrilo(Alimentacion alimentacion) {
        super(alimentacion);
    }

    public void comer() { // aqui esta el metodo abstracto de animal
        System.out.print("Cocodrilo: "); 
        alimentacion.comer();
    }
}


// clase de Koala la cual hereda de animal en esta parte utilizamos el super de alimentación porque asi lo pedimos en el
// constructor además así le damos a entender a la clase Animal el tipo de alimentación que queremos

class Koala extends Animal {
    public Koala(Alimentacion alimentacion) {
        super(alimentacion);
    }

    public void comer() { // aqui esta el metodo abstracto de animal
        System.out.print("Koala: ");
        alimentacion.comer();
    }
}
public class Prueba {
    public static void main(String[] args) {
        Animal mapache = new Mapache(new Omnivoro());
        Animal chimpance = new Chimpance(new Omnivoro());
        Animal cocodrilo = new Cocodrilo(new Carnivoro());
        Animal koala = new Koala(new Herviboro());

        mapache.comer();
        chimpance.comer();
        System.out.println("El cocodrilo esta ");
        cocodrilo.intentarCazar();
        cocodrilo.comer();
        koala.comer();
        chimpance.setAlimentacion(new Carnivoro());
        chimpance.comer();
    }
}

