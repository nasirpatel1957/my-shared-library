def call(String hubUser, String project, String version){
    withCredentials([usernamePassword(
        credentialsId: 'docker', 
        passwordVariable: 'PASS', 
        usernameVariable: 'USER')]) {

    sh """
        docker login -u "$USER" -p "$PASS"
        docker image push ${hubUser}/${project}:${version}
        docker image push ${hubUser}/${project}:latest
    """
    }
}