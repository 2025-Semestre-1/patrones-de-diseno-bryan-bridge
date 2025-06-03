/*  Problemas del codigo:
1. Se repite demasiado la lógica 
2. Hay mucha combinación entre los animales y lo que comen
3. No es sencillo de mantener ni de extender
4. Hay mucho acoplamiento entre animal y alimento(o sea comer)
5. Si se quiere hacer cambio en una alimentación debo hacerlo con todas las clases de esa misma alimentación
6. No se puede cambiar el tipo de alimentación de un animal en tiempo de ejecución
*/

//Aqui declaramos la clase abstracta Animal entonces lo que hacemos es darle como un molde a seguir
// junto con un metodo abstracto
abstract class Animal {
    public abstract void comer();
}


// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class MapacheOmnivoro extends Animal {
    public void comer(){ // metodo abstracto
        System.out.println("Comiendo de todo un poco");
    }
}

// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class ChimpanceOmnivoro extends Animal {
    public void comer() { // metodo abstracto
        System.out.println("Comiendo de todo un poco");
    }
}

// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class CocodriloCarnivoro extends Animal {
    public void comer() { // metodo abstracto
        System.out.println("Comiendo carnitaaaaa");
    }
}

// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class AguilaCarnivoro extends Animal {
    public void comer() { // metodo abstracto
        System.out.println("Comiendo carnitaaaaa");
    }
}


// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class KoalaHerviboro extends Animal {
    public void comer() { // metodo abstracto
        System.out.println("Soy vegetariano :c");
    }
}

// Esta es una clase de animal junto al tipo de dieta que lleva la cual hereda de Animal
class AbejaHerviboro extends Animal {
    public void comer() { // metodo abstracto
        System.out.println("Soy vegetariano :c");
    }
} 

public class MalEjemplo {
    public static void main(String[] args) {
        new MapacheOmnivoro().comer();
        new CocodriloCarnivoro().comer();
        new AbejaHerviboro().comer();
    }
}
