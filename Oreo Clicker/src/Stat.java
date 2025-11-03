public class Stat {
    public String name;
    public int number;
    public int statID;

    public Stat(String name, int number, int statID) {
        this.name = name;
        this.number = number;
        this.statID = statID;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getStatID() {
        return statID;
    }

    public void addNumber(int numberToAdd) {
        this.number += numberToAdd;
    }
}
