import javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration
import jenkins.model.GlobalConfiguration

// disable Job DSL script approval

GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).useScriptSecurity=false

GlobalConfiguration.all().get(GlobalJobDslSecurityConfiguration.class).save()


pipeline {
    agent any
    stages {
        stage('Folder') {
            steps {
                jobDsl scriptText: 'job("folders")'
                jobDsl targets: ['folders.groovy'].join('\n'),
                removedJobAction: 'DELETE',
                removedViewAction: 'DELETE',
                lookupStrategy: 'SEED_JOB'
            }
        }
        stage('pipelines-monolithic') {
            steps {
                jobDsl scriptText: 'job("pipelines-monolithic")'
                jobDsl targets: ['pipelinesMonolithic.groovy'].join('\n'),
                removedJobAction: 'DELETE',
                removedViewAction: 'DELETE',
                lookupStrategy: 'SEED_JOB'

            }
       }
/*
        stage('pipelines-networking') {
            steps {
                jobDsl scriptText: 'job("pipelines-networking")'
                jobDsl targets: ['pipelinesNetworking.groovy'].join('\n'),
                removedJobAction: 'DELETE',
                removedViewAction: 'DELETE',
                lookupStrategy: 'SEED_JOB'

            }
       }
        stage('pipelines-infra') {
            steps {
                jobDsl scriptText: 'job("pipelines-infra")'
                jobDsl targets: ['pipelinesInfra.groovy'].join('\n'),
                removedJobAction: 'DELETE',
                removedViewAction: 'DELETE',
                lookupStrategy: 'SEED_JOB'

            }
       }
    }
*/
    post {
        // Clean after build
        always {
            cleanWs(cleanWhenNotBuilt: false,
            deleteDirs: true,
            disableDeferredWipeout: true,
            notFailBuild: true,
            patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
            [pattern: '.propsfile', type: 'EXCLUDE']])
            //Send email always
        }
    }
}