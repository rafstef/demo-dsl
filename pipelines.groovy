pipelineJob('AWS/rke/rke-deploy') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-rke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/rke/rke-deploy-minimal') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-rke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile_minimal.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/rke/rke-destroy') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-rke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile_destroy.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}



pipelineJob('AWS/rke/rke-AxaStyle') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-rke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile_AxaStyle.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('GCP/gke/gke-deploy-minimal') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-gke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile_minimal.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('GCP/gke/gke-destroy') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@bitbucket.org:raffaelestefanile/demo-gke.git')
            credentials('bitbucket')
            scriptPath("Jenkinsfile_destroy.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}