package com.clebcodes.gestao_vagas.modules.candidate.controllers;

import com.clebcodes.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

  @PostMapping("/")
  public void  create(@Valid @RequestBody CandidateEntity candidateEntity) {
    System.out.println(candidateEntity.getEmail());
  }
}