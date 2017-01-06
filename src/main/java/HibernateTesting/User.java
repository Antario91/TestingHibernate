package HibernateTesting;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User_T")
public class User implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "NAME")
    private String name;
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="Parent_Child",
            joinColumns={@JoinColumn(name="Parent")},
            inverseJoinColumns={@JoinColumn(name="Child")})
    private Set<User> parent;
    @ManyToMany(mappedBy="parent")
    private Set<User> child;


    private User() {}

    public User(String name) {
        this.name = name;
        parent = new HashSet<User>();
        child = new HashSet<User>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getParent() {
        return parent;
    }

    public void setParent(Set<User> parent) {
        this.parent = parent;
    }

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
