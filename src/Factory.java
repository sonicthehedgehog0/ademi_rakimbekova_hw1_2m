public class Factory {
    private String name;
    private String street;

    public Factory(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
}
