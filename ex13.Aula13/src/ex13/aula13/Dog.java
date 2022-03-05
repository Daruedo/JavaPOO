package ex13.aula13;
public class Dog extends Wolf {
    @Override
    public void actionSound(){
        System.out.println("Au!Au!Au!");
    }
    public void react(String phrase){
    if(phrase.equals("Toma Comida") || phrase.equals("Olá")){
        System.out.println("Abanar e Latir");
        this.actionSound();
    } else {
        System.out.println("Rosnar");
    }
    }
    public void react(int hour, int min){
        if(hour < 12) {
            System.out.println("Abanar");
        } else if (hour >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
            this.actionSound();
        }

    }
    public void react(boolean owner){
        if (owner) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.actionSound();
        }
    }
    public void react(int age, float weight){
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.actionSound();
            }
            if (weight < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
