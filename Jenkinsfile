pipeline {
	agent any 
	stages {
		
		stage("compile me hello") {
			steps {
				sh "./gradlew compileJava"
			}
		}
		
		stage("unit test") {
			steps {
				sh "./gradlew test"
			}
		}
	
	}
}
