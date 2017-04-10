package ae.coder.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/17/17.
 */

public abstract class UserDTO implements Serializable
{


    private int userId;
    private String userName;
    private String password;
    private boolean enabled;
    private String name;
    private ActivationDTO activation;
    private AuthorizationDTO authorization;
    private Set<MessageDTO> messages = new HashSet<>(0);

    public UserDTO() {}

    public UserDTO(int userId, String userName, String password, boolean enabled, String name, ActivationDTO activation, AuthorizationDTO authorization) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.name = name;
        this.activation = activation;
        this.authorization = authorization;
    }

    public Set<MessageDTO> getMessages() {
        return messages;
    }

    public void setMessages(Set<MessageDTO> messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ActivationDTO getActivation() {
        return activation;
    }

    public void setActivation(ActivationDTO activation) {
        this.activation = activation;
    }

    public AuthorizationDTO getAuthorization() {
        return authorization;
    }

    public void setAuthorization(AuthorizationDTO authorization) {
        this.authorization = authorization;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
