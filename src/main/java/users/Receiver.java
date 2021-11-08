package users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Receiver implements User {
    String status;
    private int id = IDGenerator.generateID();

    @Override
    public void update(String status) {
        this.status = status;
    }
}
