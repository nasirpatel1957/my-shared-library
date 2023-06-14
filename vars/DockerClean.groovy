def call(String hubUser, String project, String version){
    sh """
        docker image ${hubUser}/${project}:${version}
        docker image ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}