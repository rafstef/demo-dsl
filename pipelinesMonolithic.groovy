pipelineJob('AWS/MONOLITHIC/PROD/prod-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MONOLITHIC/PROD/preprod-destroy-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MONOLITHIC/NOPROD/preprod-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MONOLITHIC/NOPROD/preprod-destroy-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MONOLITHIC/NOPROD/dev-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MONOLITHIC/NOPROD/dev-destroy-demo-terraform-monolithic') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-monolithic')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}