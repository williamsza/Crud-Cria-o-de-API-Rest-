package com.ciandt.springbootmongodb.cadastro.controller;

import ch.qos.logback.core.net.server.Client;
import com.ciandt.springbootmongodb.cadastro.dto.ClientDto;
import com.ciandt.springbootmongodb.cadastro.repository.ClientRepository;
import com.ciandt.springbootmongodb.cadastro.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value ="/clients")

public class ClientController<Client> {
    @Autowired
    private ClientService clientService;
    private ClientService taskRepository;
    private ClientRepository clientRepository;

    @GetMapping(path = "/api/status")
    public String check(){
        return "Online";

    }



    @GetMapping
    public List<ClientDto> geAll() {
        return this.clientService.getAll();
    }
    @PostMapping
    public ClientDto create(@RequestBody ClientDto taskDto) {
        return this.clientService.criar(taskDto);
    }

    @PutMapping(value = "/{userId}")
    public  ClientDto updated(@PathVariable("userId") String userId, @RequestBody ClientDto clientDto) {
        return this.clientService.update(userId, clientDto);
    }
    @DeleteMapping(value = "/{id}" )
    public String delete(@PathVariable String id){
        clientService.delete(id);
        return "DELETED";
    }
//    @DeleteMapping(value="/delete/{Id}")
//    public String deleteClients(@PathVariable String id) {
//        taskRepository.deleteById(id);
//        return "Deleted Successfully";
    //}
}