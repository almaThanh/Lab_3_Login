package tranhanhtrithienthanh.Lab_3.services;
import tranhanhtrithienthanh.Lab_3.entity.User;
import tranhanhtrithienthanh.Lab_3.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
