def call(string appName, string ImageTag){
  docker build -t "${appName}":"${ImageTag}"
}
