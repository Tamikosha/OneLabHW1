package kzonelab.Repository;

import kzonelab.Entity.User;
import kzonelab.Entity.UserRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRatingRepository extends JpaRepository<UserRating, Long> {
    UserRating findByUser(User user);
}

