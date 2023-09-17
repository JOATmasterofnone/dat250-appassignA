package dat250.appassignA.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Voter extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    private boolean hasVoted;

    // Constructor with username, password, and voterId as parameters
    public Voter(String username, String password, int voterId) {
        super(username, password);
        this.id = voterId;
    }

    public Voter() {

    }
}