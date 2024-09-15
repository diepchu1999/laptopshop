package vn.hoidanit.laptopshop.service;

import org.springframework.stereotype.Service;
import java.util.List;
import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        User eric = this.userRepository.save(user);
        return eric;
    }

    public User getUserById(long id) {
        User user1 = this.userRepository.findById(id);
        return user1;
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }
}
