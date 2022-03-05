package ex13.aula13;
public class Mammal extends Animal {
    protected String corPelo;

    @Override
    public void actionSound(){
        System.out.println("Som de Mamífero");
    }
}
