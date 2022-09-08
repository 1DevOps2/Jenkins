#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call() {
         def mailRecipients = 'anas.rehman@technonies.com'
                   def jobName = currentBuild.fullDisplayName
                   //emailext body: '''${SCRIPT, template="groovy-html.template"}''',
                   emailext body: '''Hello''',
                       mimeTye: 'text/html',
                       subject: "[Jenkins] Started ${jobName}",
                       to: "${mailRecipients}",
                       replyTo: "${mailRecipients}",
                       recipientProviders: [[$class: 'CulpritsRecipientProvider']]
}

