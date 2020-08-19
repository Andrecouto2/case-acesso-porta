package br.com.mastertech.couto.port.models

import lombok.Getter
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    lateinit var id: Integer

    @Getter
    @Setter
    lateinit var floor: String

    @Getter
    @Setter
    lateinit var room: String

}