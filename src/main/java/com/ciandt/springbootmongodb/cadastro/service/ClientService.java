package com.ciandt.springbootmongodb.cadastro.service;

import com.ciandt.springbootmongodb.cadastro.dto.ClientDto;
import com.ciandt.springbootmongodb.cadastro.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Service
public class ClientService {
    private ClientRepository clientRepository;
    private static final HashMap<String, ClientDto> tasks = new HashMap<String, ClientDto>();


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }



    public ClientDto criar(ClientDto taskDto) {
        String novoId = tasks.keySet().size() + "1";
        taskDto.setId(novoId);
        tasks.put(novoId, taskDto);
        this.clientRepository.save(taskDto);
        return taskDto;

    }
    public ClientDto update(String userId, ClientDto clientDto ) {
        Optional<ClientDto> updated = this.clientRepository.findById(userId);
        if (updated.isPresent()) {
            ClientDto dto = updated.get();
            dto.setNome(clientDto.getNome());
            dto.setPhone(clientDto.getPhone());
            dto.setEmail(clientDto.getEmail());
            this.clientRepository.save(dto);
            return dto;
        }else {
throw new RuntimeException("User not found");
        }
    }

    public ClientDto getById(String taskId){
  ClientDto dto = this.clientRepository.findById(taskId).get();
        return dto;
    }

    public List<ClientDto> getAll(){
       return this.clientRepository.findAll();
      

    }
    public String delete(String userId){
       this.clientRepository.deleteById(userId);
        return "DELETED";
    }
    public void save(String nome, String phone, String email){
        ClientDto taskDto = new ClientDto(nome,phone,email);
        this.clientRepository.save(taskDto);
    }

}

