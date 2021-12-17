package az.abb.etaskifyapp.controller;

import az.abb.etaskifyapp.payload.SignUpRequest;
import az.abb.etaskifyapp.response.BaseResponse;
import az.abb.etaskifyapp.service.ManageUsers;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private ManageUsers manageUsers;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @CrossOrigin
    @PreAuthorize("hasRole('ADMIN')")
    @ApiOperation(value = "",authorizations = {@Authorization(value = "jwtToken")})
    public ResponseEntity saveUser(@RequestBody SignUpRequest signUpRequest){
        return manageUsers.createUser(signUpRequest);
    }
}
