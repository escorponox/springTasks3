package jpa;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class BeanEntity implements Serializable {

    @SequenceGenerator(name = "SEQ", sequenceName = "BEANENTITY_SEQ", allocationSize = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    private Long id;

	@Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters long.")
    private String titulo;

	@Range(min = 1, max = 100, message = "min 1 max 100")
    private Long numero;

    public BeanEntity() {
    }

    public BeanEntity(String titulo, Long numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "BeanEntity{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}