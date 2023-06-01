package tranhanhtrithienthanh.Lab_3.repository;
import org.springframework.stereotype.Repository;
import tranhanhtrithienthanh.Lab_3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findByUsername(String username);
}
