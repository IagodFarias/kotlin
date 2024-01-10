fun main(){
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()
    
    if(numero % 2 == 0){
        println("par")
    }
    else {println("impar")
}
}