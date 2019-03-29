package com.gft.spingboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TESTERS_TABLE")
public class Tester {

    @Id
    @Column(name = "TESTER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = true, length = 255)
    private String name;

    @Column(name = "AGE", nullable = true, length = 10)
    private Integer age;

    @OneToMany(mappedBy = "tester", cascade = CascadeType.ALL)
    private List<ContactData> contactData;

    public Integer getId() {
        return id;
    }
}