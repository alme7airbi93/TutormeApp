package ae.coder.model;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by almehairbi on 2/23/17.
 */



public class CategoryDTO implements Serializable {

    private int categoryId;
    private String name;
    private Set<CourseDTO> courses = new HashSet<>();

    public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

    public CategoryDTO(int categoryId, String name, Set<CourseDTO> courses) {
        this.categoryId = categoryId;
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Set<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseDTO> courses) {
        this.courses = courses;
    }
}

