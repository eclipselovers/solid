package ocp;

public class TwitterAuthProvider implements IAuthService {
    @Override
    public boolean signIn(String log, String pass) {
        return true;
    }
}
