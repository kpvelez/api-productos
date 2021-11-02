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
}