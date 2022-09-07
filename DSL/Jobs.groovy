pipelineJob('Configuring-GitHub') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('* * * * *')    
						}
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('Print-Words') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('Jenkinsfile1')
        }
    }
}


pipelineJob('Print-Words') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('Jenkinsfile1')
        }
    }
}

pipelineJob('share-lib') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkins')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('Jenkinsfile2')
        }
    }
}

