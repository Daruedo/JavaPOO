package videoviewerproject;
public class VideoViewerProject {
    public static void main(String[] args) {
        Video v[] = new Video [3];
        v[0] = new Video("Aula 1 de POO", 28.5f);
        v[1] = new Video("Aula 12 de PHP", 37.8f);
        v[2] = new Video("Aula 10 de HTML5", 13.0f);

        Padawan p[] = new Padawan[2];
        p[0] = new Padawan("Jubileu", 22, "M", "jubi123");
        p[1] = new Padawan("Creuza", 12, "F", "cleusita42");

        Watch w[] = new Watch[5];

        System.out.println("Gerenciador de Vídeos");
        System.out.println("---");

        w[0] = new Watch(p[0], v[2]); // Jubileu assiste html
        w[0].rate();
        System.out.println(w[0].toString());
        System.out.println("---");


        w[1] = new Watch(p[0], v[1]); // Jubileu assite php
        w[1].rate(19.0f);
        System.out.println(w[1].toString());
        System.out.println("---");




        
//        System.out.println("VÍDEOS\n--------------------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        System.out.println("PADAWANS\n--------------------------------");
//        System.out.println(p[0].toString());
//        System.out.println(p[1].toString());
    }
    
}
