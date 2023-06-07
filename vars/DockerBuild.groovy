def call(String hubUser, String project, String version){
    sh """
        docker build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${version}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}