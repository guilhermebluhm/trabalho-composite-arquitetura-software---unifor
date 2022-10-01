public class EntryPoint {

    public static void main(String[] args) {

        Graphic g = new Picture(); //node pai
        Picture p = new Picture(); //node mais externo

        Rectangle r = new Rectangle(); //folha
        Line l = new Line(); //folha
        Circle c = new Circle(); //folha

        p.adicionar(r); //construindo a arvore
        p.adicionar(l); //construindo a arvore
        p.adicionar(c); //construindo a arvore

        g.adicionar(p); //adicionando o node mais externo ao root
        g.listarNodes(); //imprimindo recursivamente os objetos da arvore

    }

}
