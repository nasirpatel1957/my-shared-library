def call(Map stageParams) {
    checkout {[
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[url: stageParms.url]] 
    ]}
}