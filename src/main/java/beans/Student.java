package beans;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Student_Id",nullable = false)
    private UUID id;

    @Column(name = "Student_Name",nullable = false,length = 50)
    private String name;

    @Column(name = "Student_Roll",nullable = false)
    private int roll;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Rank_ID")
    private Rank rank;
}
