println "Arquivo [${args[0]}]" 
File arquivo = new File(args[0])
arquivo.each{
    def nomeArq =it.substring( it.lastIndexOf("/")+1)
    println" Baixando [$nomeArq] "
    def cmd ="wget ${it} -O ${nomeArq}"
    println cmd 
    cmd.execute().text
  }