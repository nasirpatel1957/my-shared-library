def call(String hubUser, String project, String version){
    sh """
        docker image tag ${hubUser}/${project}:${version}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}