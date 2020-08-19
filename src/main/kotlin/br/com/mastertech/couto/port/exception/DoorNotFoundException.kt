package br.com.mastertech.couto.port.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Door not found.")
class DoorNotFoundException : RuntimeException()