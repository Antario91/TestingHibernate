package HibernateTesting;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by olgo on 06-Jan-17.
 */
@Entity
@Table(name = "troop")
public class Troop {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int id;

    @OneToMany(mappedBy="troop")
    public Set<Soldier> soldiers;

    public Troop(int id, Set<Soldier> soldiers) {
        this.id = id;
        this.soldiers = soldiers;
    }
}
