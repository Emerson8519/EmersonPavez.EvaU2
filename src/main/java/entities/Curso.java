/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author emers
 */
@Entity
@Table(name = "cursos")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findById", query = "SELECT c FROM Curso c WHERE c.id = :id"),
    @NamedQuery(name = "Curso.findByCurso", query = "SELECT c FROM Curso c WHERE c.curso = :curso"),
    @NamedQuery(name = "Curso.findByProfesor", query = "SELECT c FROM Curso c WHERE c.profesor = :profesor"),
    @NamedQuery(name = "Curso.findByMateriales", query = "SELECT c FROM Curso c WHERE c.materiales = :materiales"),
    @NamedQuery(name = "Curso.findByDescripcion", query = "SELECT c FROM Curso c WHERE c.descripcion = :descripcion")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ID")
    private String id;
    @Size(max = 2147483647)
    @Column(name = "curso")
    private String curso;
    @Size(max = 2147483647)
    @Column(name = "profesor")
    private String profesor;
    @Size(max = 2147483647)
    @Column(name = "materiales")
    private String materiales;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;

    public Curso() {
    }

    public Curso(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Curso[ id=" + id + " ]";
    }
    
}
