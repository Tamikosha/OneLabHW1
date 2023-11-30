package kzonelab.Service;
import kzonelab.Repository.UserRatingRepository;
import kzonelab.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRatingRepository userRatingRepository;

    @Override
    public List<UserRating> getAllUsers() {
        return userRatingRepository.findAll();
    }

    @Override
    public UserRating getUserRatingById(Long userRatingId) {
        return userRatingRepository.findById(userRatingId).orElse(null);
    }

    @Override
    public void saveUserRating(UserRating userRating) {
        userRatingRepository.save(userRating);
    }

}
