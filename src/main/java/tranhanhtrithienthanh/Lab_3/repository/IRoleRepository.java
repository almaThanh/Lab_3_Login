package tranhanhtrithienthanh.Lab_3.repository;
import tranhanhtrithienthanh.Lab_3.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query("Select r.id FROM Role r WHERE r.name = ?1")
    Long getRoleIdByName(String roleName);
}
