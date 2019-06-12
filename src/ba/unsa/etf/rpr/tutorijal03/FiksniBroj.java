package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.Enum.Grad;

import java.util.HashMap;

public class FiksniBroj extends TelefonskiBroj {
    private static int id = 0;
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
        id++;
    }

    @Override
    public String ispisi() {
        HashMap<Grad, String> mapiranje = GradPozivniMapiranje.getMapiranje();
        String pozivni = mapiranje.get(grad);
        String formatiraniBroj = String.format("%s/%s", pozivni, broj);
        return formatiraniBroj;
    }

    @Override
    public int hashCode() {
        int result = (id ^ (id >>> 32));
        result = 31 * result + grad.hashCode();
        result = 31 * result + broj.hashCode();
        return result;
    }
}
