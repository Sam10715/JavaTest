node{
stage('SCM checkout'){
git "https://github.com/Sam10715/JavaTest"
}
stage('compile-package'){
  def mavan_home=tool name: 'Maven', type: 'maven'
  bat "${mavan_home}\bin\mvn package"
}

}
