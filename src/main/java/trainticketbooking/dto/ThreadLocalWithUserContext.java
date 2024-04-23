package trainticketbooking.dto;


import trainticketbooking.security.Context;

public class ThreadLocalWithUserContext {

    private static ThreadLocal<Context> userContext
            = new ThreadLocal<>();
    private Integer userId;

    public static void setUserContext(ThreadLocal<Context> userContext) {
        ThreadLocalWithUserContext.userContext = userContext;
    }

    public static Context getUserContext() {
        return userContext.get();
    }
}
