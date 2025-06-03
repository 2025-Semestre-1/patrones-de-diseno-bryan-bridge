
// En este apartado tendremos la interfaz que es aquel del que van a heredar lo que es la play, xbox y pc
// De aqui le decimos a la clase abstracta que todo aquel que este en ella y los que hereden de la interfaz
// Deberan utilizar los metodos que esta tenga
interface Plataforma {
    void jugarJuego(String nombreJuego); // Este vendría a ser el metodo que todos deben tener
    
}

// En si es un juego tal y como lo conocemos solo que representado por una clase lo que
// hacemos es asociarlo con la intergaz o sea la plataforma y el jugador y con el bridge
// lo que hacemos es crear una composición para desacoplar la lógica del juego de la plataforma
abstract class Juego {
    protected Plataforma plataforma; //Nos referimos a la plataforma
    protected String jugador; // Referencia del jugador

    // Constructor para inicializar 
    public Juego(Plataforma plataforma, String jugador) {
        this.plataforma = plataforma;
        this.jugador = jugador;
    }

    //Metodo abstracto para todos los juegos
    public abstract void jugar();
}


// clase de pc que hereda de plataforma esta vemos que contiene el metodo de jugarJuego y trae consigo el nombre del jugador
class PC implements Plataforma {
    public void jugarJuego(String nombreJuego){ // Metodo 
        System.out.println("Ejecutando " + nombreJuego + " en la PC");
    }
}

// clase de Playstation que hereda de plataforma esta vemos que contiene el metodo de jugarJuego 
//y trae consigo el nombre del jugador
class PlayStation implements Plataforma {
    public void jugarJuego(String nombreJuego){ // Metodo
        System.out.println("Ejecutando " + nombreJuego + " en la Play");
    }
}

// clase de Xbox que hereda de plataforma esta vemos que contiene el metodo de jugarJuego 
//y trae consigo el nombre del jugador
class Xbox implements Plataforma {
    public void jugarJuego(String nombreJuego){
        System.out.println("Ejecutando " + nombreJuego + " en la Xbox");
    }
}

// Esto seria una implementación del Juego
class JuegoCarreras extends Juego {
    public JuegoCarreras(Plataforma plataforma, String jugador) {
        super(plataforma, jugador);
    }

    public void jugar() {
        plataforma.jugarJuego(jugador + " esta jugando Motogp25");
    }
}

// Esto seria una implementación del Juego
class JuegoAventura extends Juego {
    public JuegoAventura(Plataforma plataforma, String jugador) {
        super(plataforma, jugador); // Llamamos al constructor de Juego
    }

    public void jugar() {
        plataforma.jugarJuego(jugador +" esta jugando un juego Aventura"); // Implementación del metodo que proviene de Juego
    }
}

// Esto seria una implementación del Juego
class JuegoShooter extends Juego {
    public JuegoShooter(Plataforma plataforma, String jugador) { // Llamamos al constructor de Juego
        super(plataforma, jugador);
    }

    public void jugar() { // Implementación del metodo que proviene de Juego
        plataforma.jugarJuego(jugador +" esta jugando call of duty");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creamos un juego de carreras en PC para Bryan
        Juego juego1 = new JuegoCarreras(new PC(), "Bryan");
        juego1.jugar();  

        // Creamos un juego de aventura en Play para Edutec
        Juego juego2 = new JuegoAventura(new PlayStation(), "Edutec");
        juego2.jugar();  

        // Creamos un juego de aventura en Xbox para Dylantero09
        Juego juego3 = new JuegoShooter(new Xbox(), "Dylantero09");
        juego3.jugar();
    }
}
