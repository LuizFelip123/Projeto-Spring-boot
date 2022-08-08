package br.edu.engenhariasoftware.escola.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/Usuario/")
public UsuarioController{

    @GetMapping("TelaPrincipal")
    public String mostrarPrincipal(){
        return"usuario/telaprincipal";
    }
    
    @GetMapping("Cadastro")
    public String mostrarCadastro(){

        return"usuario/cadastrarUsuario";
    }
}