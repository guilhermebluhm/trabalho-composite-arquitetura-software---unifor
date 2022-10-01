import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic{

    List<Graphic> adicionarFolhas = new ArrayList<>();

    @Override
    public void adicionar(Graphic g) {
       this.adicionarFolhas.add(g);
    }

    @Override
    public void remover(Graphic g) {
        this.adicionarFolhas.remove(g);
    }

    @Override
    public void listarNodes() {

        for(Graphic g : adicionarFolhas){
            g.listarNodes();
        }

    }
}
