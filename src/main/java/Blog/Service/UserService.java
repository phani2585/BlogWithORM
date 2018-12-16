package Blog.Service;

import Blog.Model.User;
import Blog.repository.PostRepository;
import Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(User user) {

        User existingUser = userRepository.checkUser(user.getUsername(), user.getPassword());
        if(existingUser != null) {
            return existingUser;
        }
        else {
            return null;
        }
    }

    public void registerUser(User newUser) {
        userRepository.registerUser(newUser);
    }
}