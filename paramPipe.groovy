pipeline{
    agent any
    parameters {
        string defaultValue: 'rv', description: 'name can be add', name: 'name'
        string defaultValue: 'palava', description: 'location can be add', name: 'location'
        choice choices: ['UAT', 'SIT', 'PROD', 'QA'], description: 'select evironemnt', name: 'enviroment'
        booleanParam description: 'execution required or not', name: 'execution'
        credentials credentialType: 'com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl', defaultValue: '', name: 'password', required: false
    }
    
    stages{
        stage("generate param"){
            steps{
                echo "Hi ${params.name}, welcome in ${params.location}"
                echo "Hi ${name}, welcome in ${location}"
                echo "your testing environment is ${enviroment}"
            }
        }
    }
}
