package com.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Reservation {

@Id
@GeneratedValue
Long id;

String name;

Reservation() {
}

public Reservation(String name) {
this.name = name;
}

}
