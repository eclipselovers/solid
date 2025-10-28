package ocp;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

	private Map<String, IAuthService> providers;

    public AuthService() {
        providers = new HashMap<>();
        providers.put("facebook", new FacebookAuthProvider());
        providers.put("google", new GoogleAuthProvider());
        providers.put("twitter", new TwitterAuthProvider());
        providers.put("apple", new AppleAuthProvider()); 
    }
    
    public boolean signIn(String service, String log, String pass) {
    	IAuthService provider = providers.get(service.toLowerCase());
        if (provider != null) {
            return provider.signIn(log, pass);
        }
        return false;
    }
}
