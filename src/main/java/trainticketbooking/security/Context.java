package trainticketbooking.security;

import lombok.Data;

@Data
public class Context extends ThreadLocal {
    private String userName;

    public Context(String userName) {
        this.userName = userName;
    }
}
