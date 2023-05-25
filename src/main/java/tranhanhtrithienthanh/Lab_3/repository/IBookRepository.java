package tranhanhtrithienthanh.Lab_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tranhanhtrithienthanh.Lab_3.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
