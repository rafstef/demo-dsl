pipelineJob('AWS/NETWORKING/PROD') {
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
pipelineJob('AWS/NETWORKING/PREPROD') {
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

pipelineJob('AWS/NETWORKING/DEV') {
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