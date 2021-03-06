package com.gilberto.storeapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="produto")
public class Product {

    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    //@ManyToOne
    //@JoinColumn(name = "categoria", referencedColumnName = "id")
    @Column(name="categoria_id")
    private Integer categoryId;

    @Column(name="preco_compra")
    private Double buyPrice;

    @Column(name="preco_venda")
    private Double sellPrice;

}
