package web.security;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String name, String password);
}
