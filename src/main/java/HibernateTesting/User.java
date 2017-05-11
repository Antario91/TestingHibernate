package HibernateTesting;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User_T")
public class User implements Serializable {

    private long id;

    private String name;

    private Date day;

    private Set<User> parent;

    private Set<User> child;


    private User() {}

    public User(String name, Date day) {
        this.name = name;
        this.day = day;
        parent = new HashSet<User>();
        child = new HashSet<User>();
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DAY")
    public Date getDay()
    {
        return day;
    }

    public void setDay(Date day)
    {
        this.day = day;
    }

    @ManyToMany(mappedBy="child")
    public Set<User> getParent() {
        return parent;
    }

    public void setParent(Set<User> parent) {
        this.parent = parent;
    }

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="Parent_Child",
          joinColumns={@JoinColumn(name="Parent")},
          inverseJoinColumns={@JoinColumn(name="Child")})
    public Set<User> getChild() {
        return child;
    }

    public void setChild(Set<User> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Following_Followers",
//            joinColumns = {@JoinColumn(name = "Parent")},
//            inverseJoinColumns = {@JoinColumn(name = "Child")})
//    public Set<User> getFollowers() {
//        return new HashSet<User>(this.followers);
//    }
//
//    public void setFollowers(Set<User> followers) {
//        this.followers = followers;
//    }
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "Following_Followers",
//            joinColumns = {@JoinColumn(name = "Child")},
//            inverseJoinColumns = {@JoinColumn(name = "Parent")})
//    public Set<User> getFollowing() {
//        return new HashSet<User>(this.following);
//    }
