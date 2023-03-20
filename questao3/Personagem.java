

public class Personagem {

    public int visibilidade;
    public int poder;
    public int vidas;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem normal(){
        return new Personagem(10, 50, 3);
    }

    public static Personagem poderoso(int poder){
        return new Personagem(10, poder, 3);
    }

    public static Personagem soturno(int visibilidade){
        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem personagem(int visibilidade, int poder, int vidas){
        return new Personagem(visibilidade, poder, vidas);
    }

    @Override
    public String toString() {
        return "Personagem [visibilidade=" + visibilidade + ", poder=" + poder + ", vidas=" + vidas + "]";
    }

    
}
