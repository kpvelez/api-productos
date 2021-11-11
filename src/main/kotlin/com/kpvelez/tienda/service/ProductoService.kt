package com.kpvelez.tienda.service

import com.kpvelez.tienda.model.Producto
import com.kpvelez.tienda.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {

        return productoRepository.findAll()

    }

    fun save (@RequestBody producto: Producto): Producto {
        return productoRepository.save(producto)

    }

    fun update (@RequestBody producto: Producto): Producto {
        return productoRepository.save(producto)
    }

    fun updateDescription (producto: Producto):Producto {
        val response = productoRepository.findById(producto.id)
            ?: throw Exception()
        response.apply {
            this.description=producto.description
        }
        return productoRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        productoRepository.deleteById(id)
        return true
    }

}