#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call() {
                  def mailRecipients = '1devops2@gmail.com'
                  def mailSender = 'anas.rehman@technonies.com'
                   def jobName = currentBuild.fullDisplayName
                   //emailext body: '''${SCRIPT, template="groovy-html.template"}''',
                   emailext body: '''Hello''',
                       mimeTye: 'text/html',
                       subject: "[Jenkins] Started ${jobName}",
                       to: "${mailRecipients}",
                       from: "${mailSender}",
                       replyTo: "${mailRecipients}",
                       recipientProviders: [[$class: 'CulpritsRecipientProvider']]
}

