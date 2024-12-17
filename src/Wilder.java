public class Wilder {

    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.firstName + " et je " + (this.aware ? "suis aware" : "ne suis pas aware");
    }

}
