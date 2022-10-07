pipelineJob('AWS/NETWORKING/PROD/prod-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/preprod-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/preprod-destroy-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
  triggers {
        gitlabPush {
            buildOnMergeRequestEvents(true)
    }
  }
}

pipelineJob('AWS/NETWORKING/NOPROD/dev-destroy-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/dev-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}