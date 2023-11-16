package com.prodemy.boot.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateProfileRequest {
	private String email;
	private String firstName; // Updated first name
    private String lastName;  // Updated last name
    private String profileImage;
}
