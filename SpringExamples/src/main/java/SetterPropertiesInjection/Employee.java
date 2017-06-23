package SetterPropertiesInjection;

/**
 * Created by jcon928 on 6/23/2017.
 */
public class Employee {

    private String name;
    private Integer eid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                '}';
    }
}
