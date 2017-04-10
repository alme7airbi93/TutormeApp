package ae.coder.model;


import java.util.Set;

/**
 * Created by almehairbi on 2/17/17.
 */

public class AdminDTO extends UserDTO
{

    public AdminDTO(int userId, String userName, String password, boolean enabled, String name, ActivationDTO activation, AuthorizationDTO authorization) {

        super(userId,userName,password,enabled,name,activation,authorization);
    }

    public AdminDTO() {
    }



}
