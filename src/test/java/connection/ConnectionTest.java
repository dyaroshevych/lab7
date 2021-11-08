package connection;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    @Test
    void createConnection() {
        Connection connection1 = Connection.getConnection();
        Connection connection2 = Connection.getConnection();
        assertEquals(connection1, connection2);
    }
}
