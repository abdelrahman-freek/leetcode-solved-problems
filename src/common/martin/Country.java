package common.martin;

public class Country {
    private String name;
    public Country(){

    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }


}
