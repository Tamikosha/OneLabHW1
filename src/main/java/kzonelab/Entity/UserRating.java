package kzonelab.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user_ratings")
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double averageRating;

    private int totalRatings;

    private int positiveRatings;

    private int negativeRatings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getPositiveRatings() {
        return positiveRatings;
    }

    public void setPositiveRatings(int positiveRatings) {
        this.positiveRatings = positiveRatings;
    }

    public int getNegativeRatings() {
        return negativeRatings;
    }

    public void setNegativeRatings(int negativeRatings) {
        this.negativeRatings = negativeRatings;
    }

}

