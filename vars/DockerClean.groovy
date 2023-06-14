def call(String hubUser, String project, String version){
    sh """
        docker rmi ${hubUser}/${project}:${version}
        docker rmi ${hubUser}/${project}:latest
    """
}