#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(String sender="anas.rehman@technonies.com", String reciever="tehchnonies@gmail.com") {
                    mail from: "${sender}",
                    to: "${reciever}", 
                    subject: "APPROVAL REQUIRED FOR $JOB_NAME" , 
                    body: """Build $BUILD_NUMBER required an approval. Go to http://20.171.65.204:8080/view/Shared%20Library/job/Email-Approval/ for more info."""
 
                    def deploymentDelay = input id: 'Deploy', 
                      message: 'Deploy to production?', 
                      parameters: [choice(choices: ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24'], 
                      description: 'Hours to delay deployment?', 
                      name: 'deploymentDelay')]
                      sleep time: deploymentDelay.toInteger(),
                      unit: 'HOURS'
                     
                     
}

  

