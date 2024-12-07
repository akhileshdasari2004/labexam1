package HQLDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {
    @Id
    private int id;

    @Column(name = "pname", length = 50)
    private String name;

    @Column(name = "plocation", length = 50)
    private String location;

    @Column(name = "phodname", length = 50)
    private String hodname;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHodname() {
        return hodname;
    }

    public void setHodname(String hodname) {
        this.hodname = hodname;
    }
}
