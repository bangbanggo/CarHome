package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Clients;
import edu.black.model.Feedbacks;
import edu.black.service.ClientService;
import edu.black.service.FeedbackService;
import edu.black.service.impl.ClientServiceImpl;
import edu.black.service.impl.FeedbackServiceImpl;

import java.util.List;

public class VisitAction extends ActionSupport {
    private ClientService clientService = new ClientServiceImpl();
    private FeedbackService feedbackService = new FeedbackServiceImpl();
    private Feedbacks feedback;
    private List<Feedbacks> feedbackList;
    private List<Clients> clientsList;
    public String preadd(){
        clientsList = clientService.queryall(null);
        return "add";
    }

    public String add(){
        if (feedbackService.add(feedback)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String edit(){
        feedback = feedbackService.getFeedback(feedback);
        return "update";
    }

    public String update(){
        if(feedbackService.update(feedback)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String list(){
        feedbackList = feedbackService.queryall(feedback);
        return SUCCESS;
    }


    public String delete(){
        feedbackService.delete(feedbackList);
        return "list";
    }

    public Feedbacks getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedbacks feedback) {
        this.feedback = feedback;
    }

    public List<Feedbacks> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedbacks> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }
}
