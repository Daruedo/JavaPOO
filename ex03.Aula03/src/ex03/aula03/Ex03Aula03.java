package ex03.aula03;

public class Ex03Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Esferográfica";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
