package introobjetos;

//Super clase dibujos animados
class Dibujoanimado{

    String nombre;
    int anio;
    String frase;

    //Constructor dibujos animados
    public Dibujoanimado (String nombre, int anio, String frase) {
        this.nombre=nombre;
        this.anio=anio;
        this.frase=frase;
    }

    //Constructor predeterminado dibujos animados
    public Dibujoanimado () {
        this.nombre="Desconocido";
        this.anio=0;
        this.frase="Desconocido";
    }

}



//Subclase hannabarbera que extiende de superclase dibujos animados
class Hannabarbera extends Dibujoanimado {
    String idioma;

    //Constructor hannabarbera
    public Hannabarbera (String idioma) {
        this.idioma=idioma;
    }

    //Constructor predeterminado hannabarbera
    public Hannabarbera () {
        this.idioma="Desconocido";
    }
}



//Subclase warnerbros que extiende de superclase dibujos animados
class Warnerbros extends Dibujoanimado {
    int integrantes;

    //Constructor warnerbros
    public Warnerbros (String idioma) {
        this.integrantes=integrantes;
    }

    //Constructor predeterminado warnerbros
    public Warnerbros () {
        this.integrantes=0;
    }
}



//Subclase pato lucas que hereda de warnerbros que a su vez hereda de dibujos animados
class Patolucas extends Warnerbros {
    int disparos;
    String color;

    //Constructor patolucas
    public Patolucas (int disparos, String color) {
        this.disparos=disparos;
        this.color=color;
    }

    //Constructor predeterminado patolucas
    public Patolucas () {
        this.disparos=0;
        this.color="Desconocido";
    }
}



//Subclase pedro picapiedra que hereda de hannabarbera que a su vez hereda de dibujos animados
class Pedropicapiedra extends Hannabarbera {
    int trajes;
    int decibelios;

    //Constructor pedropicapiedra
    public Pedropicapiedra (int disparos, String color) {
        this.trajes=trajes;
        this.decibelios=decibelios;
    }

    //Constructor predeterminado pedropicapiedra
    public Pedropicapiedra () {
        this.trajes=0;
        this.decibelios=0;
    }
}



//MAINNN
public class Main_animados {

    public static void main (String[] args) {

    }

}
