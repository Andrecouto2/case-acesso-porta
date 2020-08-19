package br.com.mastertech.couto.port.repository

import br.com.mastertech.couto.port.models.Door
import org.springframework.data.repository.CrudRepository

interface DoorRepository : CrudRepository<Door, Integer>