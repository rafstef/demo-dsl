pipelineJob('AWS/NETWORKING/prod-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("Jenkinsfile")
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('AWS/NETWORKING/preprod-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("Jenkinsfile")
          }
          branch('*/release')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('AWS/NETWORKING/dev-demo-terraform-vpc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rafstef/demo-terraform-vpc')
            scriptPath("Jenkinsfile")
          }
          branch('*/dev')
        }
      }
      lightweight()
    }
  }
}