package models;

public class Cliente {
    private int ID;
    private int password;

    public Cliente(int ID, int password) {
        this.ID = ID;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
