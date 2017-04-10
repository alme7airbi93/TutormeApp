package ae.coder.model;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/17/17.
 */

public class ModeratorDTO extends UserDTO
{

    private Set<CourseDTO> courses = new HashSet<>();

    
    public ModeratorDTO() {
		super();
	}

    public ModeratorDTO(int userId, String userName, String password, boolean enabled, String name, ActivationDTO activation, AuthorizationDTO authorization) {
        super(userId,userName,password,enabled,name,activation,authorization);
    }

    public Set<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseDTO> courses) {
        this.courses = courses;
    }
}
