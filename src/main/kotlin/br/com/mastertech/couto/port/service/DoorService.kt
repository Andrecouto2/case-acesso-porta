package br.com.mastertech.couto.port.service

import br.com.mastertech.couto.port.exception.DoorNotFoundException
import br.com.mastertech.couto.port.models.Door
import br.com.mastertech.couto.port.repository.DoorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DoorService {

    @Autowired
    private lateinit var doorRepository: DoorRepository

    fun getDoorById(id: Integer): Door {
        val door = doorRepository.findById(id)
        if (door.isPresent.not()) throw DoorNotFoundException()
        return door.get()
    }

    fun createDoor(door: Door): Door {
        return doorRepository.save(door)
    }
}