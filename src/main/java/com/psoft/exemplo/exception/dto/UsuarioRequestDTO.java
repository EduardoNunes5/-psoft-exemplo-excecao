package com.psoft.exemplo.exception.dto;

public class UsuarioRequestDTO {

    private int id;

    private String nome;

    private String idade;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(int id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
