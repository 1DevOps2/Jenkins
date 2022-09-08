#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call() {
                    mail from: "anas.rehman@technonies.com",
                    to: "tehchnonies@gmail.com", 
                    subject: "APPROVAL REQUIRED FOR $JOB_NAME" , 
                    body: """Build $BUILD_NUMBER required an approval. Go to http://13.95.115.63:8080/job/aprroval-job/ for more info."""
 
                    def deploymentDelay = input id: 'Deploy', 
                      message: 'Deploy to production?', 
                      parameters: [choice(choices: ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24'], 
                      description: 'Hours to delay deployment?', 
                      name: 'deploymentDelay')]
                      sleep time: deploymentDelay.toInteger(),
                      unit: 'HOURS'

                       
                       
}

