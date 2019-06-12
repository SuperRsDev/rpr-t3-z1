package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends  TelefonskiBroj {
    private static int id = 0;
    private Integer mobilnaMreze;
    private String broj;

    public MobilniBroj(int mobilnaMreze, String broj) {
        this.mobilnaMreze = mobilnaMreze;
        this.broj = broj;
        id++;
    }

    @Override
    public String ispisi() {
        return String.format("0%s/%s", this.mobilnaMreze, this.broj);
    }

    @Override
    public int hashCode() {
        int result = (id ^ (id >>> 32));
        result = 31 * result + mobilnaMreze.hashCode();
        result = 31 * result + broj.hashCode();
        return result;
    }
}
