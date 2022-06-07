package com.example.demo.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LineaPedido {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Propiedades

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_id")
	private Producto producto;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Constructores

	public LineaPedido() {

	}

	public LineaPedido(Producto producto, Pedido pedido) {

		super();
		this.pedido = pedido;
		this.producto = producto;

	}

	public LineaPedido(Pedido pedido) {

		super();
		this.pedido = pedido;

	}

	public LineaPedido(Pedido pedido, Producto producto, int unidades) {

		super();
		this.pedido = pedido;
		this.producto = producto;
		this.cantidad = unidades;
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Setters y Getters

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// Metodos Override


	@Override
	public String toString() {
		return "LineaPedido [pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedido, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaPedido other = (LineaPedido) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(producto, other.producto);
	}

}
