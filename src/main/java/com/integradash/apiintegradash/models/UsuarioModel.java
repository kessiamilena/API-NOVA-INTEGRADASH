package com.integradash.apiintegradash.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel  {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nome_usuario;
    private int telefone;
    private String email;
    private String senha;

    // private String url_img;

    //@OneToMany
    //@JoinColumn(name = "id_estrategia", referencedColumnName = "id")
    //private EstrategiaModel estrategia;




}