#!/usr/bin/env groovy
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call() {
    def from = "anas.rehman@technonies.com"
    def to = "tehchnonies@gmail.com"
    def emailBody = "Please go to ${env.BUILD_URL} to verify the build."
    def emailSubject = "[Jenkins] ${env.JOB_NAME} - Build# ${env.BUILD_NUMBER}"
    sendEmail("${from}","${to}","${emailSubject}","${emailBody}")
}
