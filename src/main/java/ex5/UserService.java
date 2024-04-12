//package ex5;
//
//import com.ArkadiaPlocienniczak.BilbiotekaWirtualna.model.User;
//import com.ArkadiaPlocienniczak.BilbiotekaWirtualna.repository.UserRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Slf4j
//@Service
//public class UserService {
//
//    /*    @param injecting beans
//    @return service methods
//
//     */
//
//    private UserRepository userRepository;
//    private final UserDTOMapper userDTOMapper;
//
//    public UserService(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//    public UserDTO getUser(Long id){
//        return userRepository.findById(id)
//                .map(userDTOMapper)
//                .orElse(null);
//    }
//
//    public List<UserDTO> getUser(){
//        return userRepository.findAll()
//                .stream()
//                .map(userDTOMapper)
//                .collect(Collectors.toList());;
//    }
//
//    public void addUser(UserModel user){
//        userRepository.save(user);
//        log.info("Dodano użytkownika: " + user.getId());
//    }
//
//    public void editUser(UserModel user){
//        userRepository.save(user);
//    }
//
//    public void deleteUserById(Long id){
//        userRepository.deleteById(id);
//        log.info("Usunięto użytkownika o id" + id);
//    }
//}
//
