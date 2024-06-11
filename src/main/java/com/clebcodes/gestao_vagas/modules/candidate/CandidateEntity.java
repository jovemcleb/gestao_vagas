package com.clebcodes.gestao_vagas.modules.candidate;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CandidateEntity {
  private UUID id;
  private String name;

  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
  private String username;

  @Email(message = "O campo [email] não deve conter espaço")
  private String email;

  @Length(min = 6)
  private String password;
  private String description;
  private String curriculum;
}
