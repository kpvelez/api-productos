package com.kpvelez.tienda.controller

import com.kpvelez.tienda.model.Cliente
import com.kpvelez.tienda.service.ClienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClienteController {

    @Autowired
    lateinit var clienteService:  ClienteService

    @GetMapping
    fun list(): List<Cliente>{
        return clienteService.list()

    }
}