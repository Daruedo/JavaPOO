package ex12.aula12;
public class Ex12Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setCorPelo("Marrom");
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        System.out.println("");

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        System.out.println("");

        r.setPeso(0.89f);
        r.setIdade(2);
        r.setMembros(2);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("");

        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        System.out.println("");
        c.locomover();
        d.locomover();
        c.emitirSom();
        d.emitirSom();
    }
    
}
