object Main extends App {
  val factorial: Factorial = new Factorial
  
  println(Console.GREEN + factorial.factorial(5) + Console.RESET)
  
  println(Console.RED + factorial.factorial(0) + Console.RESET)
  
  println(Console.YELLOW + factorial.factorial(-1) + Console.RESET)
  
  println(Console.CYAN + factorial.factorial(3) + Console.RESET)
  
  println(Console.BLUE + factorial.factorial(1) + Console.RESET)
  
  println(Console.MAGENTA + factorial.factorial(2) + Console.RESET)
  
  println(Console.RED + factorial.factorial(4) + Console.RESET)
}