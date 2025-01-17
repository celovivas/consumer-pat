package br.com.alelo.consumer.consumerpat.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
@Entity
public class Consumer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    
    String name;
    int documentNumber;
    @JsonFormat(pattern =  "dd/MM/yyyy")
    Date birthDate;

    //contacts
    String mobilePhoneNumber;
    String residencePhoneNumber;
    String phoneNumber;
    String email;

    //Address
    @Embedded
    private Address address;    

    //cards
    String foodCardNumber;
    double foodCardBalance;

    String fuelCardNumber;
    double fuelCardBalance;

    String drugstoreNumber;
    double drugstoreCardBalance;
    
//    @OneToMany(mappedBy = "consumer",
//        	cascade = CascadeType.DETACH,
//        	orphanRemoval = true
//			)
//	private List<Card> cards;    

}
