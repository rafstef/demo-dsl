pipelineJob('AWS/NETWORKING/PROD/prod-demo-terraform-ec2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-ec2')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/preprod-demo-terraform-ec2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-ec2')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/preprod-destroy-demo-terraform-ec2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-ec2')
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

pipelineJob('AWS/NETWORKING/NOPROD/dev-destroy-demo-terraform-ec2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-ec2')
            scriptPath("pipelines/destroy.groovy")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/NOPROD/dev-demo-terraform-ec2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-ec2')
            scriptPath("pipelines/Jenkinsfile")
          }
          branch('*/develop')
        }
      }
      lightweight()
    }
  }
}