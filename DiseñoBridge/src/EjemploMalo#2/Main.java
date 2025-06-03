//Esta sera nuestra clase abstracta la cual hara como plantilla o base para las otras clases 
// y también le dejamos un metodo abstracto para que los que hereden lo implementen de una forma más 
// distinta o única
abstract class Juego {
    public abstract void jugar();
}

//Creamos una clase la cual es una herencia del juego y esta implementa su propio metodo para
// poder jugarse en la pc
class JuegoCarrerasPC extends Juego {
    public void jugar() {
        System.out.println("Jugando runrun en PC");
    }
}

// Se repite la misma estructura de la clase pero cambia de plataforma
class JuegoCarrerasPlayStation extends Juego {
    public void jugar() {
        System.out.println("Jugando runrun en PlayStation");
    }
}

// Se repite la misma estructura de la clase pero cambia de plataforma
class JuegoCarrerasXbox extends Juego {
    public void jugar() {
        System.out.println("Jugando runrun en Xbox");
    }
}

// Aquí ya cambia el género del videojuego pero igual sigue implementado una solución por plataforma 
class JuegoshooterPC extends Juego {
    public void jugar() {
        System.out.println("Jugando praprapra en PC");
    }
}

// Cambia el género y plataforma 
class JuegoShooterXbox extends Juego {
    public void jugar() {
        System.out.println("Jugando praprapra en PC");
    }
}

// Cambia el género y plataforma 
class JuegoshooterPlayStation extends Juego {
    public void jugar() {
        System.out.println("Jugando praprapra en PlayStation");
    }
}


// Creamos tres objetos de tipo Juego con los cuales los creamos para cierto tipo de juegos como son de carreras o shooters
// Luego les probamos sus metodos y estos nos devuelven su resultado.
public class Main {
    public static void main(String[] args) {
        Juego juego1 = new JuegoCarrerasPC();
        juego1.jugar();

        Juego juego2 = new JuegoshooterPlayStation();
        juego2.jugar();

        Juego juego3 = new JuegoCarrerasXbox();
        juego3.jugar(); 
    }
}
