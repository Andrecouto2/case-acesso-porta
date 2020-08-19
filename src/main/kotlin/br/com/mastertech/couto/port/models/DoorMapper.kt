package br.com.mastertech.couto.port.models

import br.com.mastertech.couto.port.models.dtos.CreateDoorRequest
import br.com.mastertech.couto.port.models.dtos.CreateDoorResponse
import org.springframework.stereotype.Component

@Component
class DoorMapper {

    fun toCreateDoorRequest(door: Door): CreateDoorRequest {
        return CreateDoorRequest(door.floor, door.room)
    }

    fun toCreateDoorResponse(door: Door): CreateDoorResponse {
        return CreateDoorResponse(door.id, door.floor, door.room)
    }

    fun toDoor(createDoorResponse: CreateDoorRequest): Door {
        val door = Door()
        door.floor = createDoorResponse.floor
        door.room = createDoorResponse.room
        return door
    }
}