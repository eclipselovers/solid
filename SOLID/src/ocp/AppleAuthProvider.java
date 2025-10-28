package ocp;

public class AppleAuthProvider implements IAuthService{
    @Override
    public boolean signIn(String log, String pass) {
        return true;
    }
}
