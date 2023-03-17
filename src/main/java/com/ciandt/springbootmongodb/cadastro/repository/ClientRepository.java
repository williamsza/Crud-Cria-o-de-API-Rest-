package com.ciandt.springbootmongodb.cadastro.repository;

import com.ciandt.springbootmongodb.cadastro.dto.ClientDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientDto, String> {




}

