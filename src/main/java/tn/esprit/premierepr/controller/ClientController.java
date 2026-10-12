package tn.esprit.premierepr.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.premierepr.domain.Client;
import tn.esprit.premierepr.service.IClientService;
import tn.esprit.premierepr.service.IClientService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")

public class ClientController {
    final IClientService ic;
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c){

        return ic.addClient(c);
    }
    @GetMapping("/getClient")
    public List<Client> getallClients(){
        return ic.retrieveAllClients();
    }
    @GetMapping("/getClientid/{idc}")
    public Client getClientid(@PathVariable long idc){
        return ic.retrieveClient(idc);
    }
    @DeleteMapping("/DeleteClient/{idcc}")
    public void deleteClient(@PathVariable long idcc){
        ic.removeClient(idcc);
    }
    @PutMapping("/UpdateClient")
    public Client UpdateClient(@RequestBody Client c)
    {
        return ic.updateClient(c);
    }



}