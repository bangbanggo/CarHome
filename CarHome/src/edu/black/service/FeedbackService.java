package edu.black.service;


import edu.black.model.Feedbacks;

import java.util.List;

public interface FeedbackService {
    public boolean add(Feedbacks feedback);
    public boolean update(Feedbacks feedback);
    public Feedbacks getFeedback(Feedbacks feedback);
    public List<Feedbacks> queryall(Feedbacks feedback);
    public boolean delete(List<Feedbacks> feedback);
}
