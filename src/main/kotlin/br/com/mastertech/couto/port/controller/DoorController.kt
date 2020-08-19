package br.com.mastertech.couto.port.controller

import br.com.mastertech.couto.port.models.DoorMapper
import br.com.mastertech.couto.port.models.dtos.CreateDoorRequest
import br.com.mastertech.couto.port.models.dtos.CreateDoorResponse
import br.com.mastertech.couto.port.service.DoorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/porta")
class DoorController {

    @Autowired
    lateinit var doorService: DoorService

    @Autowired
    lateinit var doorMapper: DoorMapper

    @PostMapping
    fun create(@RequestBody createDoorRequest: @Valid CreateDoorRequest): ResponseEntity<CreateDoorResponse> {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(doorMapper.toCreateDoorResponse(doorService.createDoor(doorMapper.toDoor(createDoorRequest))))
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Integer): ResponseEntity<CreateDoorResponse> {
        return ResponseEntity.ok(doorMapper.toCreateDoorResponse(doorService.getDoorById(id)))
    }
}