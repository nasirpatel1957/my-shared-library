def call(String hubUser, String project, String version){
    sh """
        trivy image ${hubUser}/${project}:latest > scan.txt
        cat scan.txt
    """
}