package org.bob.cxfrs.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.bob.cxfrs.beans.constants.Constants;


public class FileProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {



         User user = exchange.getIn().getBody(User.class);
         exchange.setProperty("test", user.getName());
         String auditBody = "Name: "+ user.getName() +"\nScore: "+ user.getScore() +"\nEmail: "+ user.getEmail();
         exchange.getOut().setBody(auditBody);

    }

}
