package com.gft.spingboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTACT_TABLE")
public class ContactData {

    @Id
    @Column(name = "CONTACT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CITY", nullable = true, length = 255)
    private String city;

    @Column(name = "STREET", nullable = true, length = 10)
    private String street;

    @Column(name = "PHONE_NUMBER", nullable = true, length = 10)
    private String phoneNumber;

    @Column(name = "EMAIL", nullable = true, length = 10)
    private String email;

    @ManyToOne
    @JoinColumn(name = "TESTER_ID", nullable = false)
    private Tester tester;
}