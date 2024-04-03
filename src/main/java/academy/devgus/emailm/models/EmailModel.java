package academy.devgus.emailm.models;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EmailModel {
     private Long userId;
     private String text;
     private String emailTo;
     private String subject;

     public Long getUserId() {
          return userId;
     }

     public void setUserId(Long userId) {
          this.userId = userId;
     }

     public String getText() {
          return text;
     }

     public void setText(String text) {
          this.text = text;
     }

     public String getEmailTo() {
          return emailTo;
     }

     public void setEmailTo(String emailTo) {
          this.emailTo = emailTo;
     }

     public String getSubject() {
          return subject;
     }

     public void setSubject(String subject) {
          this.subject = subject;
     }
}
