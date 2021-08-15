package com.web.tornese.SpringWeb.controllers;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import com.web.tornese.SpringWeb.models.Administrador;
import com.web.tornese.SpringWeb.repositorio.AdministradoresRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdministradoresController {

  @Autowired
  private AdministradoresRepo repo;

  @GetMapping("/administradores")
  public String index(Model model){
    List<Administrador> administradores = (List<Administrador>)repo.findAll();
    model.addAttribute("administradores", administradores);
    return "administradores/index";
  }

  @GetMapping("/administradores/novo")
  public String novo(){
    return "administradores/novo";
  }

  @PostMapping("/administradores/criar")
  public String criar(Administrador administrador){
    repo.save(administrador);
    return "redirect:/administradores";
  }
}
