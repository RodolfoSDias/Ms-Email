package com.ms.user.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(@NotBlank String Name,
                            @NotBlank @Email String email) {
}
