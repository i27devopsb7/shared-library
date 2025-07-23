import com.i27academy.builds.Calculator

def call(Map pipelineParams){
    // instance of a Calculator class 
    Calculator calculator = new Calculator(this)
    pipeline {
        agent {
            label 'java-slave'
        }
        // ${ENV_NAME}
        // ${env.ENV_NAME}
        // ${pipelineParams.appName}
        // ${params.param_name}
        environment {
            APPLICATION_NAME  = "${pipelineParams.appName}"
        }
        stages {
            stage ('calculate'){
                steps {
                    script {
                        echo "**** Calling add method for reusability *****"
                        echo "***** Pringitn the sumn of values ********"
                        println calculator.add(2,3)
                    }
                }
            }
            stage('Build') {
                steps {
                    echo "***** Building the applicaiton ******"
                    echo "********* I am building for ${env.APPLICATION_NAME}"
                }
            }
            stage ('test'){
                steps {
                    echo "***** Applicaiton testing ******"
                }
            }
            stage ('DevDeploy'){
                steps {
                    echo "***** Deploying to dev environment ******"
                }
            }
            stage ('testDeploy'){
                steps {
                    echo "***** Deploying to test environment ******"
                }
            }
            stage ('stageDeploy'){
                steps {
                    echo "***** Deploying to stage environment ******"
                }
            }
            stage ('prodDeploy'){
                steps {
                    echo "***** Deploying to prod environment ******"
                }
            }
        }
    }
}






