package users;

public class IDGenerator {
    static int id = 0;

    static int generateID() {
        id += 1;
        return id;
    }
}
