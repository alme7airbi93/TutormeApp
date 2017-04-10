package ae.coder.model;


import java.util.Set;

/**
 * Created by almehairbi on 2/17/17.
 */

public class AdminDTO extends UserDTO
{

    public AdminDTO(int userId, String userName, String password, boolean enabled, String name, ActivationDTO activation, AuthorizationDTO authorization, Set<MessageDTO> messages) {

        super(userId, userName, password, enabled, name, activation, authorization, messages);
    }

    public AdminDTO() {
    }

    public AdminDTO(String userName, String password) {
        super(userName, password);
    }

    public AdminDTO(String userName, String password, boolean enabled, Activation activation) {
        super(userName, password, enabled, activation);
    }

    public AdminDTO(String userName, String password, boolean enabled, String name, Activation activation, Authorization authorization) {
        super(userName, password, enabled, name, activation, authorization);
    }

    public AdminDTO(String userName, String password, boolean enabled, Activation activation, Authorization authorization) {
        super(userName, password, enabled, activation, authorization);
    }


}
