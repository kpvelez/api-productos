package com.kpvelez.tienda.repository

import com.kpvelez.tienda.model.Cliente
import com.kpvelez.tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
    fun findById (id: Long?): Cliente
}