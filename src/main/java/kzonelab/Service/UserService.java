package kzonelab.Service;

import kzonelab.Entity.*;

import java.util.List;

public interface UserService {
    List<UserRating> getAllUsers();
    UserRating getUserRatingById(Long userRatingId);
    void saveUserRating(UserRating userRating);
}
