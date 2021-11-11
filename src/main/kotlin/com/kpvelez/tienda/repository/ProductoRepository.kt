package com.kpvelez.tienda.repository

import com.kpvelez.tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository: JpaRepository<Producto, Long> {
    fun findById (id: Long?): Producto?
}