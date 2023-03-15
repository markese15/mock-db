package co.develhope.mockdb.entities;

import javax.persistence.*;

@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
}
