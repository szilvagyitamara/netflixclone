package com.netflixclone.netflixclone.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class ChangePasswordRequest {
    @NotBlank(message = "Current Password is required")
    private String currentPassword;
    @NotBlank(message = "New password is required")
    private String newPassword;
}
