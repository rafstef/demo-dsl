pipelineJob('AWS/MODULAR/PROD/prod-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MODULAR/PROD/prod-destroy-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MODULAR/NOPROD/preprod-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MODULAR/NOPROD/preprod-destroy-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MODULAR/NOPROD/dev-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/MODULAR/NOPROD/dev-destroy-demo-terraform-modular') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-modular')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}