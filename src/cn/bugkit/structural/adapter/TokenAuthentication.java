package cn.bugkit.structural.adapter;


/**
 * @author bugkit
 * @since 2021.12.30
 */
public interface TokenAuthentication {
    /**
     * Get token authenticated
     * @return {@link Token}
     */
    Token getToken();
}
