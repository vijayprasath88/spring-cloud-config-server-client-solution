**Spring Config Server and Config Client**


    
    Steps
        1. Start config-server project in port 8001
        2. once the server is started, hit the url - [ConfigServerURL](http://localhost:8001/config-server/default) - output - JSON string will be shown
        3. Start config-client project in port 8002
        4. once the server is started hit the url - [ConfigServerURL](http://localhost:8002/configmessage)
        
        output = Welcome message from config-properties github repository
        this output message is fetched from github repository (url given below)
        [GitHuburl](https://github.com/vijayprasath88/config-properties.git)