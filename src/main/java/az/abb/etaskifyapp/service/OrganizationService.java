package az.abb.etaskifyapp.service;

import az.abb.etaskifyapp.entity.Organization;
//import az.abb.etaskifyapp.entity.Role;
import az.abb.etaskifyapp.entity.User;
import az.abb.etaskifyapp.exception.AppException;
import az.abb.etaskifyapp.payload.ApiResponse;
import az.abb.etaskifyapp.payload.SignUpRequest;
import az.abb.etaskifyapp.repository.OrganizationRepository;
//import az.abb.etaskifyapp.repository.RoleRepository;
import az.abb.etaskifyapp.repository.UserRepository;
import az.abb.etaskifyapp.security.JwtTokenProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.UUID;

@Service
public class OrganizationService {

    private AuthenticationManager authenticationManager;
    private OrganizationRepository organizationRepository;
    private UserRepository userRepository;
//    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private JwtTokenProvider tokenProvider;
    private EmailService emailService;


    public ResponseEntity registerOrganization(SignUpRequest signUpRequest){
        if(organizationRepository.existsByOrgName(signUpRequest.getOrganizationName())){
            return new ResponseEntity(new ApiResponse(false,"Organization name is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        // Creating organization
        Organization organization = new Organization(signUpRequest.getOrganizationName(),signUpRequest.getPhone(),
              signUpRequest.getAddress());

        Organization organizationResult = organizationRepository.save(organization);
        //creating user
        User user = new User(signUpRequest.getName(),signUpRequest.getSurname(),signUpRequest.getUsername(),
                signUpRequest.getEmail(), passwordEncoder.encode(signUpRequest.getPassword()));

        if(userRepository.findByUsername(user.getUsername())){
            return new ResponseEntity(new ApiResponse(false,"userName is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        user.setRole(1L);

        String confirmationToken = getConfirmationToken();
        user.setConfirmationToken(confirmationToken);

        user.setIdOrganization(organizationResult.getId());

        User userResult = userRepository.save(user);

        return ResponseEntity.ok((new ApiResponse(true, "Organization registered successfully")));
    }


    private String getConfirmationToken(){
        UUID gfg = UUID.randomUUID();
        return gfg.toString();
    }
}
