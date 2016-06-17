package com.jorge.springmvc.model;
// Generated 18/03/2016 11:50:18 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.google.common.base.MoreObjects;

/**
 * Produccion generated by hbm2java
 */
@Entity
@Table(name="produccion"
    ,catalog="jpro"
)
public class Produccion  implements java.io.Serializable {


     private int idProduccion;
     private TipoDeCultivo tipoDeCultivo;
     private Usuario usuario;
     private Integer cantidad;
     private Date fechaCorte;
     private Date fechaRegistro;
   
     @Id 

    
    @Column(name="id_produccion", unique=true, nullable=false)
    public int getIdProduccion() {
        return this.idProduccion;
    }
    
    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_de_cultivo_id_tipo_de_cultivo", nullable=false)
    public TipoDeCultivo getTipoDeCultivo() {
        return this.tipoDeCultivo;
    }
    
    public void setTipoDeCultivo(TipoDeCultivo tipoDeCultivo) {
        this.tipoDeCultivo = tipoDeCultivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_idusuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_corte", length=19)
    public Date getFechaCorte() {
        return this.fechaCorte;
    }
    
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_registro", length=19)
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("idProduccion", idProduccion).add("cantidad", cantidad)
				.add("fechaCorte", fechaCorte).add("fechaRegistro", fechaRegistro).toString();
	}


    

}


