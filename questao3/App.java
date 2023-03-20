
import java.util.Random;


public class App {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[100];
        Random random = new Random();
    
        for (int i = 0; i < 60; i++) {
            personagens[i] = Personagem.normal();
        }
    
        for (int i = 60; i < 75; i++) {
            int poder = random.nextInt(101);
            personagens[i] = Personagem.poderoso(poder);
        }
    
        for (int i = 75; i < 90; i++) {
            int visibilidade = random.nextInt(11);
            personagens[i] = Personagem.soturno(visibilidade);
        }
    
        for (int i = 90; i < 100; i++) {
            int visibilidade = random.nextInt(11);
            int poder = random.nextInt(101);
            int vida = random.nextInt(6);
            personagens[i] = Personagem.personagem(visibilidade, poder, vida);
        }
    
        for (Personagem personagem : personagens) {
            System.out.println(personagem.toString());
        }    
    }
}

