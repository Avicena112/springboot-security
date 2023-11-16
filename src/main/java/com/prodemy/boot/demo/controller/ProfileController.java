package com.prodemy.boot.demo.controller;



import com.prodemy.boot.demo.dto.ProfileDto;
import com.prodemy.boot.demo.model.Profile;
import com.prodemy.boot.demo.model.request.AddProfileRequest;
import com.prodemy.boot.demo.model.request.UpdateProfileRequest;
import com.prodemy.boot.demo.model.response.HttpResponseModel;
import com.prodemy.boot.demo.repository.ProfileRepository;
import com.prodemy.boot.demo.service.ProfileService;
import io.swagger.v3.oas.annotations.Operation;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileRepository repo;

    @Autowired
    private ProfileService service;

   

    @Operation(summary = "Add new profile", description = "Adding new profile")
    @PostMapping
    public HttpResponseModel<ProfileDto> addProfile(@RequestBody AddProfileRequest req) {
        HttpResponseModel<ProfileDto> resp = new HttpResponseModel<>();

        try {
            // Create a new Profile entity using the data from the request
            Profile entity = Profile.builder()
                    .email(req.getEmail())
                    .firstName(req.getFirstName())
                    .lastName(req.getLastName())
                    .profileImage(req.getProfileImage())
                    .build();

            // Save the profile using the service
            Profile savedProfile = this.service.saveProfile(entity);

         
            resp.setStatus(0);
            resp.setData(convertToDto(savedProfile));

        } catch (Exception e) {
        
            resp.setStatus(-1);
            resp.setData(null);
          
            e.printStackTrace();
        }

        return resp;
    }

  

    @Operation(summary = "Update profile", description = "Update existing profile")
    @PutMapping("/update/{id}")
    public HttpResponseModel<ProfileDto> updateProfile(@RequestBody Profile req) {
        HttpResponseModel<ProfileDto> resp = new HttpResponseModel<>();

        Profile entity = Profile.builder()
        		.id(req.getId())
                .email(req.getEmail())
                .firstName(req.getFirstName())
                .lastName(req.getLastName())
                .profileImage(req.getProfileImage())
                .build();
		
		resp.setStatus(0);
		resp.setData(convertToDto(this.repo.save(entity)));
		
		return resp;
    }

	private ProfileDto convertToDto(Profile entity) {
        // Implement your conversion logic from Profile to ProfileDto
        return ProfileDto.builder()
        		.id(entity.getId())
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .profileImage(entity.getProfileImage())
                .build();
    }

    @Operation(summary = "Get Profile by id", description = "Get profile by its identifier (id)")
	@GetMapping(value = "/{id}")
	public HttpResponseModel<ProfileDto> findProfile(@PathVariable("id") Long id) {
		HttpResponseModel<ProfileDto> resp = new HttpResponseModel<>();
		
		Optional<Profile> op = this.repo.findById(id);
		if (op.isPresent()) {
			resp.setStatus(0);
			resp.setData(convertToDto(op.get()));
		} else {
			resp.setStatus(-1);
			resp.setData(null);
			
		}
		return resp;
	}
    
}
