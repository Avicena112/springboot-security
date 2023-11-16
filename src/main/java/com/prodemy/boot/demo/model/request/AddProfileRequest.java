package com.prodemy.boot.demo.model.request;


import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddProfileRequest {
	private String email;
	private String firstName;
	private String lastName;
	private String profileImage;

}
