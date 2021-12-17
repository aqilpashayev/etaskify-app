package az.abb.etaskifyapp.service;

import az.abb.etaskifyapp.payload.SignUpRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    public ResponseEntity registerOrganization(SignUpRequest signUpRequest){


        return new ResponseEntity(HttpStatus.OK);
    }
}
