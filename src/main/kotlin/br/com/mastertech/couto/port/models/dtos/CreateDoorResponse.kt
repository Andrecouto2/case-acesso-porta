package br.com.mastertech.couto.port.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.Setter

data class CreateDoorResponse(@Getter @Setter val id: Integer,
                              @Getter @Setter @JsonProperty("andar") val floor: String,
                              @Getter @Setter @JsonProperty("sala") val room: String)