// A comment!
/* Another comment */
/** A documentation comment */

import scala.annotation.tailrec

object MyModule {
    def abs(n: Int): Int = 
      if (n < 0) -n
      else n

    private def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s value of %d is %d"
        msg.format(name, n, f(n))
    }

    def factorial(n: Int): Int = {
		
        @tailrec
        def go(n: Int, acc: Int): Int = 
            if (n <= 0) acc
            else go(n-1, n*acc)

        go(n, 1)
    }

    def main(args: Array[String]): Unit = {
        println(formatResult("absolute value", -42, abs))
        println(formatResult("factorial", 7, factorial))
    } 
}
