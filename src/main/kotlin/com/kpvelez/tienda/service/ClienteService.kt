package com.kpvelez.tienda.service

import com.kpvelez.tienda.model.Cliente
import com.kpvelez.tienda.model.Producto
import com.kpvelez.tienda.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository


    fun list(): List<Cliente> {

        return clienteRepository.findAll()

    }

    fun save (@RequestBody cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)

    }

    fun update (@RequestBody cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun updateApellido (cliente: Cliente):Cliente {
        val response = clienteRepository.findById(cliente.id)
            ?: throw Exception()
        response.apply {
            this.apellido=cliente.apellido
        }
        return clienteRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        clienteRepository.deleteById(id)
        return true
    }

}