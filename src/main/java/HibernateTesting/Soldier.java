package HibernateTesting;

import javax.persistence.*;

/**
 * Created by olgo on 06-Jan-17.
 */
@Entity
@Table(name = "soldier")
public class Soldier {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int id;

    @ManyToOne
    @JoinColumn(name="troop_fk")
    public Troop troop;

    public Soldier(int id, Troop troop) {
        this.id = id;
        this.troop = troop;
    }
}
