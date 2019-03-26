package MovieDatabase;

public class Premiu {
    String name;
    Integer an;

    public Premiu(String name, Integer an) {
        this.name = name;
        this.an = an;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
