def  newGit(repo)
{
  git  "${repo}"  
}

def  newMaven()
{
    sh 'mvn package' 
}

def  new Dep(jobname,ip,appname)
{
    deploy adapters: [tomcat9(credentialsId: "d2e49ea0-a00f-459f-8b56-b7decb7fe915', path: '', url: '${ip}')], contextPath: '${appname}', war: '**/*.war"
}

def  newTest(jobname)
{
     sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
                              
def newMail(body,subject,mail)
{
  mail bcc: '', body: "${body}", cc: '', from: '', replyTo: '', subject: "${subject}", to: "${mail}" 
}                                
                              
                                
                                
                              
 
