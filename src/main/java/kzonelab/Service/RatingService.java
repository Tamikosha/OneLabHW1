package kzonelab.Service;

import kzonelab.Entity.*;

import java.util.List;

public interface RatingService {
    List<Rating> getAllRatings();
    Rating getRatingById(Long ratingId);
    void saveRating(Rating rating);
}
