package com.ciandt.springbootmongodb.cadastro.dto;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task")

public class ClientDto {

    private String id;
    private String nome;
    private String phone;
    private String email;

    public ClientDto(String nome, String email, String phone) {
        this.nome = nome;
        this.email = email;
        this.phone = phone;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
