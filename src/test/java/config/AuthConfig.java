package config;

import org.aeonbits.owner.Config;

public interface AuthConfig extends  Config{
    @Key("username")
    String getUserName();


    @Key("key")
    String getUserKey();

    @Key("remoteUrl")
    String getRemoteUrl();
}
