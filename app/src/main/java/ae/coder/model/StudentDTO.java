package ae.coder.model;



import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/17/17.
 */


public class StudentDTO extends UserDTO
{

    private Set<EnrollmentDTO> enrollmentDTOs = new HashSet<>();

    private Set<RateDTO> rates = new HashSet<>();

    public StudentDTO(int userId, String userName, String password, boolean enabled, String name, ActivationDTO activation, AuthorizationDTO authorization) {
        super(userId,userName,password,enabled,name,activation,authorization);
    }


    public Set<EnrollmentDTO> getEnrollmentDTOs() {
        return enrollmentDTOs;
    }

    public void setEnrollmentDTOs(Set<EnrollmentDTO> enrollmentDTOs) {
        this.enrollmentDTOs = enrollmentDTOs;
    }

    public Set<RateDTO> getRates() {
        return rates;
    }

    public void setRates(Set<RateDTO> rates) {
        this.rates = rates;
    }


}
