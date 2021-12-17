//package az.abb.etaskifyapp.security;
//
//import az.abb.etaskifyapp.entity.User;
//import az.abb.etaskifyapp.exception.ResourceNotFoundException;
//import az.abb.etaskifyapp.repository.UserRepository;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//@Component
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
////    @Override
////    @Transactional
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        // Let people login with username
////        User user = userRepository.getByUsername(username)
////                .orElseThrow(() ->
////                new UsernameNotFoundException("User not found with username" + username)
////        );
////
////        return UserPrincipal.create(user);
////    }
//
//
////    @Override
////    @Transactional
////    public  UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        // Let people login with username
////        User user = userRepository.getByUsername(username);
////        if(user == null){
////
////        }
////
////
////        return UserPrincipal.create(user);
////    }
//
//
//
//
////    @Transactional
////    public UserDetails loadUserById(Long id) {
////        User user = userRepository.findById(id).orElseThrow(
////                () -> new ResourceNotFoundException("User", "id", id)
////        );
////
////        return UserPrincipal.create(user);
////    }
//}
