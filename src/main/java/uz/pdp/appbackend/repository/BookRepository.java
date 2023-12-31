package uz.pdp.appbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appbackend.entity.Book;

import java.util.UUID;

@Repository
@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, UUID> {
}