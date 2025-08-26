package fitech.restful.repository;

import fitech.restful.entitiy.Contact;
import fitech.restful.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findFirstByuserAndId(User user, String id);

}
