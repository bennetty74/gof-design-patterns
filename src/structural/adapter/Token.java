package structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class Token {
    /**
     * the origin token string
     */
    private String token;
    /**
     * the private key for encrypting
     */
    private String privateKey;
    /**
     * the public key for decrypting
     */
    private String publicKey;

    public String getUsername() {
        // decrypt, do something
        return "username";
    }

    public String getPassword() {
        // decrypt, do something
        return "password";
    }

    public String encrypt(Object raw) {
        return "token";
    }


}
