package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private static int id;
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
        id++;
    }

    @Override
    public String ispisi() {
        return String.format("%s/%s", this.drzava, this.broj);
    }

    @Override
    public int hashCode() {
        int result = (id ^ (id >>> 32));
        result = 31 * result + drzava.hashCode();
        result = 31 * result + broj.hashCode();
        return result;
    }
}
