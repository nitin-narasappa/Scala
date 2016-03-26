
// This program prints Hello World string n number of times.
object PrintHelloWorld {
    def main(args: Array[String]) {
      f(args[1]) 
    }
   def f(n: Int) = {
       var index = 0
       while (index < n) {
           println("Hello World")
           index = index + 1
       }    
   }
}
