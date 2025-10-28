package ocp;

public class FacebookAuthProvider implements IAuthService{
    @Override
    public boolean signIn(String log, String pass) {
        return true;
    }
}
