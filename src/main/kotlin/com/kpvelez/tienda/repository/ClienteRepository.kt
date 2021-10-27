package com.kpvelez.tienda.repository

import com.kpvelez.tienda.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
}