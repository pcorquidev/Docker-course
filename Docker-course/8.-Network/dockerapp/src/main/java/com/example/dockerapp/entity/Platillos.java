package com.example.dockerapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "platillos")
public class Platillos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    private String nombre;
    private Integer categoria;
    private String descripcion;


    public int getProductId() {
        return Id;
    }

    public void setProductId(int productId) {
        this.Id = productId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
