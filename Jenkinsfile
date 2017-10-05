pipeline {
	agent {
              docker {
                   image 'openjdk:8-jdk-alpine'
              }
         }

	triggers {
         pollSCM('* * * * *')
    }

	stages {
	    stage("Package") {
	        steps {
	           sh "./gradlew build"
	        }
	    }

	    stage("Docker build") {
            steps {
               sh "docker build -t calculator ."
            }
        }
		
	}
}
