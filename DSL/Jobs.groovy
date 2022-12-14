pipelineJob('Configuring-GitHub') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/Jenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('* * * * *')    
						}
            }
            scriptPath('JenkinsFiles/Jenkinsfile')
        }
    }
}

pipelineJob('Print-Words') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/Jenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('JenkinsFiles/Jenkinsfile1')
        }
    }
}




pipelineJob('share-lib') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/Jenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('JenkinsFiles/Jenkinsfile2')
        }
    }
}

