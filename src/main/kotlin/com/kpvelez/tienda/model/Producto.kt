package com.kpvelez.tienda.model

import javax.persistence.*

@Entity
@Table(name = "productos")

class Producto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description: String? = null
    var details: String? = null

}