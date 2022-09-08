#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call() {
//                   def mailRecipients = '1devops2@gmail.com'
//                   def mailSender = 'anas.rehman@technonies.com'
//                    def jobName = currentBuild.fullDisplayName
                   //emailext body: '''${SCRIPT, template="groovy-html.template"}''',
                    mail from: "anas.rehman@technonies.com",
                      to: "tehchnonies@gmail.com", 
                      subject: "APPROVAL REQUIRED FOR $JOB_NAME" , 
                      body: """Build $BUILD_NUMBER required an approval. Go to http://13.95.115.63:8080/job/aprroval-job/ for more info."""
//                    emailext body: '''Hello''',
//                        mimeTye: 'text/html',
//                        subject: "[Jenkins] Started ${jobName}",
//                        to: "${mailRecipients}",
//                        from: "${mailSender}"
                       
                       
}

