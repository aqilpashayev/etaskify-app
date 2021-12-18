package az.abb.etaskifyapp.service;

//import az.abb.etaskifyapp.entity.Role;
import az.abb.etaskifyapp.entity.User;
import az.abb.etaskifyapp.exception.AppException;
import az.abb.etaskifyapp.payload.ApiResponse;
import az.abb.etaskifyapp.payload.SignUpRequest;
//import az.abb.etaskifyapp.repository.RoleRepository;
import az.abb.etaskifyapp.repository.UserRepository;
import az.abb.etaskifyapp.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ManageUsers {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
//    private RoleRepository roleRepository;

    public ResponseEntity createUser(SignUpRequest signUpRequest){
        if(userRepository.findByUsername(signUpRequest.getUsername())){
            return new ResponseEntity(new ApiResponse(false,"userName is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        User user = new User(signUpRequest.getName(),signUpRequest.getSurname(),signUpRequest.getUsername(),
                signUpRequest.getEmail(),passwordEncoder.encode(signUpRequest.getPassword()));

        //user.setIdOrganization(signUpRequest.getIdOrganization());

//        Role userRole = roleRepository.findById(signUpRequest.getRoleId())
//                .orElseThrow(()-> new AppException("User Role not set"));
//        user.setRoles(Collections.singleton(userRole));

        User userResult = userRepository.save(user);
        return ResponseEntity.ok(new ApiResponse(true,"User created successfully"));
    }
}
